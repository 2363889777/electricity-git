package com.sanyi.a.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/23
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
@WebServlet("/login.html")
public class LoginServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/views/a/login.jsp").forward(req,resp);
    }
}
