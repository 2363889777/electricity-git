package com.sanyi.sn.web.servlet.content.good;

import org.apache.commons.fileupload.DefaultFileItemFactory;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 十年
 * @function 添加商品标题图片
 * @date 2020/3/23 0023
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/good/GoodClassifyList/add/goodImg")
public class AddGoodTitleImg extends HttpServlet {
    private static final long serialVersionUID = 1L;
    // 上传文件存储目录
    private static final String UPLOAD_DIRECTORY = "D:\\ljxt\\IntelliJ IDEA 2019.1.2\\save\\electricity-git\\backgroundWeb\\src\\main\\webapp\\static\\img\\sn\\good";
    // 上传配置
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        FileItemFactory factory = new DefaultFileItemFactory();

        ServletFileUpload fileUpload = new ServletFileUpload(factory);

        // 解析request




//
//        System.out.println("图片执行上传");
//        resp.getWriter().write("图片执行上传");
//        // 检测是否为多媒体上传
////        if (!ServletFileUpload.isMultipartContent(req)) {
////            // 如果不是则停止
////            PrintWriter writer = resp.getWriter();
////            writer.println("Error: 表单必须包含 enctype=multipart/form-data");
////            writer.flush();
////            return;
////        }
//        // 配置上传参数
//        FileItemFactory factory = new DefaultFileItemFactory();
////        // 设置内存临界值 - 超过后将产生临时文件并存储于临时目录中
////        factory.setSizeThreshold(MEMORY_THRESHOLD);
////        // 设置临时存储目录
////        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
//
//        ServletFileUpload upload = new ServletFileUpload(factory);
//        // 构造临时路径来存储上传的文件
//        // 这个路径相对当前应用的目录
//        String uploadPath =UPLOAD_DIRECTORY;
//        System.out.println(uploadPath);
//        resp.getWriter().write("执行了图片下载");
//
//        // 如果目录不存在则创建
//        File uploadDir = new File(uploadPath);
//        if (!uploadDir.exists()) {
//            uploadDir.mkdir();
//        }
//        try {
//            // 解析请求的内容提取文件数据
//            @SuppressWarnings("unchecked")
//            List<FileItem> formItems = upload.parseRequest(req);
//            System.out.println(formItems);
//            if (formItems != null && formItems.size() > 0) {
//                System.out.println("执行文件下载到本地");
//                // 迭代表单数据
//                for (FileItem item : formItems) {
//                    String fileName = new File(item.getName()).getName();
//                    String filePath = uploadPath + File.separator + fileName;
//                    File storeFile = new File(filePath);
//                    // 在控制台输出文件的上传路径
//                    System.out.println(filePath);
//                    item.write(storeFile);
////                    // 处理不在表单中的字段
////                    if (!item.isFormField()) {
////                        String fileName = new File(item.getName()).getName();
////                        String filePath = uploadPath + File.separator + fileName;
////                        File storeFile = new File(filePath);
////                        // 在控制台输出文件的上传路径
////                        System.out.println(filePath);
////                        // 保存文件到硬盘
////                        item.write(storeFile);
////                        req.setAttribute("message",
////                                "文件上传成功!");
////                    }
//                }
//            }
//        } catch (Exception ex) {
//            req.setAttribute("message",
//                    "错误信息: " + ex.getMessage());
//            resp.getWriter().write("异常");
//        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
