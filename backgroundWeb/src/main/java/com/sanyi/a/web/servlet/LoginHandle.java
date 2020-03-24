package com.sanyi.a.web.servlet;

import com.sanyi.a.service.BackgroundLoginService;
import com.sanyi.a.service.impl.BackgroundLoginServiceImpl;
import com.sanyi.a.utils.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @工能 处理登录页面的请求
 * @作者 杜目杰
 * @时间 2020/3/18
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
@WebServlet("/loginHandle")
public class LoginHandle extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务处理对象
        BackgroundLoginService loginService = new BackgroundLoginServiceImpl();

        //得到登录页面提交的用户名和密码
         String name =  req.getParameter("account");
        String pass =  req.getParameter("password");

        //对用户名和密码作非空验证
        boolean nameResult =  StringUtils.isNotNullOrEmpty(name);
        boolean passResult =  StringUtils.isNotNullOrEmpty(pass);
        if (!(nameResult&&passResult)){
            req.setAttribute("error","账号和密码不能为空");
            //错误 转发到登录页面
            req.getRequestDispatcher("WEB-INF/views/a/login.jsp").forward(req,resp);
        }

        //验证用户名和密码是否匹配
       boolean loginResult = loginService.loginCheck(name,pass);
        if(loginResult){
            req.getSession().setAttribute("account",name);
            //正确 重定向到主页面
            resp.sendRedirect("/sn/back/index");
        }else {
            req.setAttribute("error","账号或密码错误");
            //错误 转发到登录页面
            req.getRequestDispatcher("WEB-INF/views/a/login.jsp").forward(req,resp);
        }
    }
}
