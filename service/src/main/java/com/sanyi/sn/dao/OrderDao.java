package com.sanyi.sn.dao;

import com.sanyi.sn.domain.order.OrderState;
import com.sanyi.sn.vo.order.SimpleOrderMessageVo;
import com.xuetang9.jdbc.frame.annotation.Param;
import com.xuetang9.jdbc.frame.annotation.SQL;
import com.xuetang9.jdbc.frame.annotation.SqlType;

import java.util.List;

/**
 * @author 十年
 * @function 订单Dao
 * @date 2020/3/19 0019
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public interface OrderDao {
    /**
     * 获取简易订单信息
     * @param startNum 开始行数
     * @param endNum 结束行数
     * @return 简易订单信息集合
     */
    @SQL(value = "select \n" +
            "o.pk_order_form_id,o.order_number,o.create_time,\n" +
            "u.pk_user_id,u.pk_user_name,\n" +
            "m.method_of_payment_name,\n" +
            "og.order_form_good_price,og.good_number,og.order_information_freight,\n" +
            "os.order_form_state_name,\n" +
            "od.order_distribution_name,\n" +
            "g.good_name,g.pk_good_id,\n" +
            "gs.good_color_name,\n" +
            "gi.good_img_name\n" +
            "from order_form_table o\n" +
            "inner join user u on o.pk_user_id = u.pk_user_id\n" +
            "inner join order_form_good_information og on o.pk_order_form_id = og.pk_order_form_id\n" +
            "inner join order_form_state os on os.pk_order_form_state_id = o.pk_order_form_state_id\n" +
            "inner join good_specification_information gs on og.pk_good_specification_id = gs.pk_good_specification_id\n" +
            "inner join good g on g.pk_good_id = gs.pk_good_id\n" +
            "inner join method_of_payment m on m.pk_method_of_payment = o.pk_method_of_payment\n" +
            "inner join order_distribution od on od.pk_order_distribution_id = o.pk_order_distribution_id\n" +
            "inner join good_img gi on gi.pk_good_id = g.pk_good_id\n" +
            "where gi.pk_good_type_id = 1\n" +
            "limit #{startNum},#{endNum};",resultType = SimpleOrderMessageVo.class,type = SqlType.SELECT)
    List<SimpleOrderMessageVo> getSimpleOrderMessage(@Param("startNum") int startNum, @Param("endNum") int endNum);


    /**
     * 通过订单状态 筛选获取简易订单信息
     * @param startNum 开始行数
     * @param endNum 结束行数
     * @param orderState 订单状态
     * @return  简易订单信息集合
     */
    @SQL(value = "select \n" +
            "o.pk_order_form_id,o.order_number,o.create_time,\n" +
            "u.pk_user_id,u.pk_user_name,\n" +
            "m.method_of_payment_name,\n" +
            "og.order_form_good_price,og.good_number,og.order_information_freight,\n" +
            "os.order_form_state_name,\n" +
            "od.order_distribution_name,\n" +
            "g.good_name,g.pk_good_id,\n" +
            "gs.good_color_name,\n" +
            "gi.good_img_name\n" +
            "from order_form_table o\n" +
            "inner join user u on o.pk_user_id = u.pk_user_id\n" +
            "inner join order_form_good_information og on o.pk_order_form_id = og.pk_order_form_id\n" +
            "inner join order_form_state os on os.pk_order_form_state_id = o.pk_order_form_state_id\n" +
            "inner join good_specification_information gs on og.pk_good_specification_id = gs.pk_good_specification_id\n" +
            "inner join good g on g.pk_good_id = gs.pk_good_id\n" +
            "inner join method_of_payment m on m.pk_method_of_payment = o.pk_method_of_payment\n" +
            "inner join order_distribution od on od.pk_order_distribution_id = o.pk_order_distribution_id\n" +
            "inner join good_img gi on gi.pk_good_id = g.pk_good_id\n" +
            "where gi.pk_good_type_id = 1 and o.pk_order_form_state_id = #{orderState}\n" +
            "limit #{startNum},#{endNum};",resultType = SimpleOrderMessageVo.class,type = SqlType.SELECT)
    List<SimpleOrderMessageVo> getSimpleOrderMessage(@Param("startNum") int startNum, @Param("endNum") int endNum, @Param("orderState") int orderState);

    /**
     * 根据订单状态名称 获取订单状态信息
     * @param name 订单状态名称
     * @return 订单状态信息
     */
    @SQL(value = "select pk_order_form_state_id,order_form_state_name,create_time,update_time from order_form_state where order_form_state_name = #{stateName};"
    ,resultType = OrderState.class,type = SqlType.SELECT)
    OrderState getOrderState(@Param("stateName") String name);


}
