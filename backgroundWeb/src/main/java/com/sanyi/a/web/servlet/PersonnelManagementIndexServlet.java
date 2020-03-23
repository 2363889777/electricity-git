package com.sanyi.a.web.servlet;

import com.sanyi.a.domain.BackgroundConsumerDomain;
import com.sanyi.a.service.PersonnelManagementService;
import com.sanyi.a.service.impl.PersonnelManagementServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/21
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
@WebServlet("/index_c.html")
public class PersonnelManagementIndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("PersonnelManagementIndexServlet");
        //得到员工管理的业务处理对象
        PersonnelManagementService personnelManagementService = new PersonnelManagementServiceImpl();
        //得到所有员工的信息
        List<BackgroundConsumerDomain> backgroundConsumerDomains = personnelManagementService.inquireAll();
        // 用session保存页面显示的数据
        HttpSession session = req.getSession();
        session.setAttribute("test",backgroundConsumerDomains);
        System.out.println(backgroundConsumerDomains.size());
        for (BackgroundConsumerDomain a:backgroundConsumerDomains
             ) {
            System.out.println("难受" + a.getPkCustomerName());
        }
        req.getRequestDispatcher("webapp/sn/index_sn.jsp").forward(req,resp);
    }
}
