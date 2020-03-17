package com.sanyi.sn.web.servlet.content;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 十年
 * @function 页面内容处理servlet
 * @date 2020/3/17 0017
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/views/sn/others")
public class PageContentServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/sn/others.jsp").forward(req, resp);
    }
}
