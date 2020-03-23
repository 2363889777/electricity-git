package com.sanyi.a.web.servlet;

import com.sanyi.a.service.PersonnelManagementService;
import com.sanyi.a.service.impl.PersonnelManagementServiceImpl;
import com.sanyi.a.utils.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @工能 后端人员管理添加员工
 * @作者 杜目杰
 * @时间 2020/3/21
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
@WebServlet("/addUser")
public class PersonnelManagementAddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("addUser");
        //得到执行后端人员管理添加业务的执行对象
        PersonnelManagementService personnelManagementService = new PersonnelManagementServiceImpl();
        //得到添加员工需要的信息
        String name = req.getParameter("name");
        String realName = req.getParameter("realName");
        String pass = req.getParameter("pass");
        String verification = req.getParameter("verifyPass");
        if(!pass.equals(verification)){
            System.out.println(pass);
            System.out.println(verification);
            System.out.println("密码验证错误");
            req.setAttribute("error","两次输入的密码不同");
            req.getRequestDispatcher("webapp/c/administrators_add_c.jsp").forward(req,resp);
        }
        // 非空验证
        Boolean nameAndPassResult = StringUtils.isNotNullOrWhiteSpace(pass) && StringUtils.isNotNullOrEmpty(name)&& StringUtils.isNotNullOrWhiteSpace(realName);
        if(!nameAndPassResult){
            System.out.println("非空验证错误");
            //错误 转发到登录页面
            req.getRequestDispatcher("webapp/c/administrators_add_c.jsp").forward(req,resp);
        }
       int aResult = personnelManagementService.addEmployee(name,realName,pass);
        System.out.println(aResult);
        if(aResult == -1){
            System.out.println("该账号已存在");
            req.setAttribute("error","改用户已存在");
            req.getRequestDispatcher("webapp/c/administrators_add_c.jsp").forward(req,resp);
        }

    }
}
