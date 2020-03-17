package com.sanyi.sn.web.servlet.content.order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 十年
 * @function 全部订单
 * @date 2020/3/17 0017
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/order/allOrder")
public class AllOrdersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/sn/content/order/allOrders.jsp").forward(req, resp);
    }
}
