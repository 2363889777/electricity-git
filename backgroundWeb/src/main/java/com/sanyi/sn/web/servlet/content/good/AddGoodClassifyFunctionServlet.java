package com.sanyi.sn.web.servlet.content.good;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanyi.sn.service.GoodService;
import com.sanyi.sn.service.impl.GoodServiceImpl;
import com.sanyi.sn.vo.good.GoodClassifyVo;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取所有菜单名称
        GoodService goodService = GoodServiceImpl.newObj();
        List<GoodClassifyVo> goodClassifyVoList = goodService.getGoodClassifies(0, 10);
        //转换成json
        ObjectMapper om = new ObjectMapper();
        //返回
        resp.getWriter().write(om.writeValueAsString(goodClassifyVoList));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
