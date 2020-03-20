package com.sanyi.sn.dao;

import com.sanyi.sn.vo.order.SimpleOrderMessageVo;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author 十年
 * @function
 * @date 2020/3/19 0019
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class OrderDaoTest {

    OrderDao orderDao;

    @Before
    public void setUp() throws Exception {
        orderDao = SqlSessionFactoryUits.getCurrentSqlSession().getMapper(OrderDao.class);
    }

    @Test
    public void getSimpleOrderMessage() {
        List<SimpleOrderMessageVo> simpleOrderMessageVoList = orderDao.getSimpleOrderMessage(0,1);
        for (SimpleOrderMessageVo s: simpleOrderMessageVoList
             ) {
            System.out.println(s);
        }
    }

    @Test
    public void getOrderState() {
        System.out.println(orderDao.getOrderState("待付款"));
    }
}