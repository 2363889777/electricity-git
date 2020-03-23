package com.sanyi.sn.web.servlet.content.good;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanyi.sn.domain.good.GoodSize;
import com.sanyi.sn.service.GoodService;
import com.sanyi.sn.service.impl.GoodServiceImpl;
import com.sanyi.sn.util.RequestUtils;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 十年
 * @function 添加商品页面功能处理
 * @date 2020/3/22 0022
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/good/addGood/function")
public class AddGoodFunctionServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //判断请求功能类型
        String type = RequestUtils.getParameter(req, "type");
        switch (type) {
            case "select":
                System.out.println("执行尺码查询");
                select(resp);
                break;
            case "img":
                addImg(req, resp);
                break;
            default:
        }

    }

    // 上传文件存储目录
    private static final String UPLOAD_DIRECTORY = "upload";
    private void addImg(HttpServletRequest request, HttpServletResponse resp){
        // 配置上传参数
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // 设置临时存储目录
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        ServletFileUpload upload = new ServletFileUpload(factory);
        // 中文处理
        upload.setHeaderEncoding("UTF-8");

        // 构造临时路径来存储上传的文件
        // 这个路径相对当前应用的目录
        String uploadPath = request.getContextPath()+ File.separator + UPLOAD_DIRECTORY;


        // 如果目录不存在则创建
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        try {
            // 解析请求的内容提取文件数据
            @SuppressWarnings("unchecked")
            List<FileItem> formItems = upload.parseRequest(request);

            if (formItems != null && formItems.size() > 0) {
                // 迭代表单数据
                for (FileItem item : formItems) {
                    // 处理不在表单中的字段
                    if (!item.isFormField()) {
                        String fileName = new File(item.getName()).getName();
                        String filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);
                        // 在控制台输出文件的上传路径
                        System.out.println(filePath);
                        // 保存文件到硬盘
                        item.write(storeFile);
                        request.setAttribute("message",
                                "文件上传成功!");
                    }
                }
            }
        } catch (Exception ex) {
            request.setAttribute("message",
                    "错误信息: " + ex.getMessage());
        }

    }

    private void addDate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取需求数据
        int parentId = Integer.parseInt(RequestUtils.getParameterNumber(req, "goodClassify"));
        int isPutAway = Integer.parseInt(RequestUtils.getParameterNumber(req, "goodPutAway"));
        int isHot = Integer.parseInt(RequestUtils.getParameterNumber(req, "goodHot"));
        int isRecommend = Integer.parseInt(RequestUtils.getParameterNumber(req, "goodRecommend"));
        String goodName = RequestUtils.getParameter(req, "goodName");
        double goodPrice = Double.parseDouble(RequestUtils.getParameterNumber(req, "goodPrice"));
        String goodColor = RequestUtils.getParameter(req, "goodColor");
        int goodSize = Integer.parseInt(RequestUtils.getParameter(req, "goodSize"));
        int goodCount = Integer.parseInt(RequestUtils.getParameterNumber(req, "goodCount"));
        //1.1 后台验证
        if (parentId == -1 || isPutAway == -1 || isHot == -1 || isRecommend == -1
                || goodCount == -1 || goodPrice == -1 || goodSize == -1) {
            resp.getWriter().write("数字相关格式错误");
            return;
        }
        if (goodName == "" || goodColor == "") {
            resp.getWriter().write("商品名字或颜色 不能为空");
            return;
        }
        //2 添加数据
        //2.1 添加数据库数据
        GoodService goodService = GoodServiceImpl.newObj();
        List<String> imgs = new ArrayList<>();
        boolean success = goodService.insertGoodMessage(parentId, isPutAway == 1, goodName, goodPrice, 0, goodColor, goodSize, goodCount, "a", imgs, imgs);
        //2.2 下载记录图片
        //3 返回信息
        if (success) {
            resp.getWriter().write("新增成功");
            SqlSessionFactoryUits.commit();
            //添加商品状态
            int goodId = goodService.getGoodId(goodName);
            if (goodId == -1) {
                resp.getWriter().write("商品营销状态更新失败");
            } else {
                if (isHot == 1) {
                    goodService.setGoodHot(goodId);
                }
                if (isRecommend == 1) {
                    goodService.setGoodRecommend(goodId);
                }
                SqlSessionFactoryUits.commit();
                resp.getWriter().write("商品营销状态更新成功");
            }
        } else {
            resp.getWriter().write("新增失败");
            SqlSessionFactoryUits.rollback();
        }
    }


    /**
     * 处理下拉条 请求 商品尺码
     *
     * @param resp 相应对象
     * @throws IOException
     */
    private void select(HttpServletResponse resp) throws IOException {
        //获取所有菜单名称
        GoodService goodService = GoodServiceImpl.newObj();
        List<GoodSize> goodSizes = goodService.getGoodSize(0, 10);
        System.out.println(goodSizes);
        //转换成json
        ObjectMapper om = new ObjectMapper();
        //返回
        resp.getWriter().write(om.writeValueAsString(goodSizes));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
