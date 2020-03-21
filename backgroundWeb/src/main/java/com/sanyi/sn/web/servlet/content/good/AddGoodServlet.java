package com.sanyi.sn.web.servlet.content.good;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 十年
 * @function 商品添加页面处理
 * @date 2020/3/20 0020
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/good/addGood")
public class AddGoodServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/webapp/sn/good/commodity_add_sn.jsp").forward(req, resp);
    }
}
