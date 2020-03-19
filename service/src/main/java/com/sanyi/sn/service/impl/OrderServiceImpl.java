package com.sanyi.sn.service.impl;

import com.sanyi.sn.dao.OrderDao;
import com.sanyi.sn.domain.order.OrderState;
import com.sanyi.sn.service.OrderService;
import com.sanyi.sn.vo.order.SimpleOrderMessageVo;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

/**
 * @author 十年
 * @function 订单服务实体类
 * @date 2020/3/19 0019
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class OrderServiceImpl implements OrderService {
    private final static OrderDao ORDER_DAO = SqlSessionFactoryUits.getCurrentSqlSession().getMapper(OrderDao.class);

    private OrderServiceImpl(){}

    public static OrderServiceImpl newObj(){return new OrderServiceImpl();}

    public List<SimpleOrderMessageVo> getOrderSimpleMessage(int startNum, int endNum) {
        return ORDER_DAO.getSimpleOrderMessage(startNum,endNum);
    }

    public List<SimpleOrderMessageVo> getOrderSimpleMessage(int startNum, int endNum, String orderState) {
        OrderState orderState1 = ORDER_DAO.getOrderState(orderState);
        if(orderState1==null){
            return null;
        }
        int orderStateId = orderState1.getId();
        return ORDER_DAO.getSimpleOrderMessage(startNum,endNum,orderStateId);
    }
}
