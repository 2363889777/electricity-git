package com.sanyi.sn.web.servlet.content.good;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanyi.sn.service.GoodService;
import com.sanyi.sn.service.impl.GoodServiceImpl;
import com.sanyi.sn.util.RequestUtils;
import com.sanyi.sn.vo.good.GoodClassifyVo;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 十年
 * @function 添加商品分类的功能实现
 * @date 2020/3/22 0022
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/good/GoodClassifyList/add/function")
public class AddGoodClassifyFunctionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("执行post");
        String type = RequestUtils.getParameter(req,"type");
        switch (type){
            case "select":
                select(resp);
                break;
            case "form":
                form(req,resp);
                break;
            default:
                resp.getWriter().write("书写不通过");
        }
    }

    /**
     * 处理表单提交 添加新分类
     * @param resp
     * @throws IOException
     */
    private void form(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        //获取值
        String classifyName = RequestUtils.getParameter(req,"classifyName");
        int parentId = Integer.parseInt(RequestUtils.getParameterNumber(req, "parentClassifyId"));
        if(classifyName == ""){
            resp.getWriter().write("分类名字不能为空");
            return;
        }
        if(parentId == -1){
            resp.getWriter().write("父级菜单不符合要求");
            return;
        }
        //通过验证
        GoodService goodService = GoodServiceImpl.newObj();
        //执行添加返回信息
        if(goodService.addGoodClassify(classifyName,parentId)){
            resp.getWriter().write("添加成功");
            SqlSessionFactoryUits.commit();
            System.out.println("执行提交");
        }else {
            resp.getWriter().write("添加失败");
            SqlSessionFactoryUits.rollback();
        }


    }

    /**
     * 处理下拉条 请求 菜单名称
     * @param resp 相应对象
     * @throws IOException
     */
    private void select(HttpServletResponse resp) throws IOException {
        //获取所有菜单名称
        GoodService goodService = GoodServiceImpl.newObj();
        List<GoodClassifyVo> goodClassifyVoList = goodService.getGoodClassifies(0, 10);
        //转换成json
        ObjectMapper om = new ObjectMapper();
        //返回
        resp.getWriter().write(om.writeValueAsString(goodClassifyVoList));
    }


}
