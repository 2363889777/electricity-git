package com.sanyi.sn.web.servlet.content.order;

import com.sanyi.sn.service.OrderService;
import com.sanyi.sn.service.impl.OrderServiceImpl;
import com.sanyi.sn.vo.order.SimpleOrderMessageVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 十年
 * @function 以完成
 * @date 2020/3/17
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/order/allOrder/complete")
public class CompleteOrdersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OrderService orderService = OrderServiceImpl.newObj();
        List<SimpleOrderMessageVo> simpleOrderMessageVoList = orderService.getOrderSimpleMessage(0,5,"已完成");
        System.out.println(simpleOrderMessageVoList);
        req.setAttribute("orders",simpleOrderMessageVoList);
        req.getRequestDispatcher("/WEB-INF/views/sn/content/order/allOrders.jsp").forward(req, resp);
    }
}
