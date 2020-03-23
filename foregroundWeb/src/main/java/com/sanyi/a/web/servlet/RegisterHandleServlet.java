package com.sanyi.a.web.servlet;

import com.sanyi.a.service.RegisterService;
import com.sanyi.a.service.impl.RegisterServiceImpl;
import com.sanyi.a.utils.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @工能  处理来自注册页面的请求
 * @作者 杜目杰
 * @时间 2020/3/19
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
@WebServlet("registerHandle")
public class RegisterHandleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建执行注册业务的对象
        RegisterService registerService = new RegisterServiceImpl();

        // 得到登录页面提交的用户名和密码
        String name =  req.getParameter("account");
        String pass =  req.getParameter("password");

        // 对账号和密码进行非空验证
        Boolean nameAndPassResult = StringUtils.isNotNullOrWhiteSpace(pass) && StringUtils.isNotNullOrEmpty(name);
        if(!nameAndPassResult){
            //错误 转发到登录页面
            req.getRequestDispatcher("WEB-INF/views/a/Register.jsp").forward(req,resp);
        }

        // 执行注册并保存执行结果
        int rResult = registerService.registerByNameAndPass(name,pass);

        // 根据执行进行反馈
        if(rResult == -1){
            //错误 转发到登录页面
            req.getRequestDispatcher("WEB-INF/views/a/Register.jsp").forward(req,resp);
        }
        req.getRequestDispatcher("WEB-INF/views/a/login.jsp").forward(req,resp);
    }
}
