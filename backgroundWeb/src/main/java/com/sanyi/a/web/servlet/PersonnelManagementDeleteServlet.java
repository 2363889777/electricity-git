package com.sanyi.a.web.servlet;

import com.sanyi.a.service.PersonnelManagementService;
import com.sanyi.a.service.impl.PersonnelManagementServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/21
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
@WebServlet("/userDelete")
public class PersonnelManagementDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获得执行业务操作的对象
        PersonnelManagementService personnelManagementService = new PersonnelManagementServiceImpl();
        //执行业务操作需要的数据
        String name = req.getParameter("name");
        //执行业务操作并得到反馈
       int pResult = personnelManagementService.deleteUser(name);
       //根据执行结果进行反馈
        if(pResult <= 0){
            req.setAttribute("error","删除失败");
        }
    }
}
