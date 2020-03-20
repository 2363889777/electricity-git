package com.sanyi.sn.vo.order;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 十年
 * @function 订单显示页面 简易信息
 * @date 2020/3/19 0019
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class SimpleOrderMessageVo {
//    o.pk_order_form_id,o.order_number,o.crete_time,
    /**
     * 订单编号
     */
    @ColName("o.pk_order_form_id")
    private int orderId;
    /**
     * 订单号
     */
    @ColName("o.order_number")
    private String orderNumber;
    /**
     * 创建时间
     */
    @ColName("o.create_time")
    private Date createTime;
//    u.pk_user_id,u.pk_user_name,
    /**
     * 用户编号
     */
    @ColName("u.pk_user_id")
    private int userId;
    /**
     * 用户名
     */
    @ColName("u.pk_user_name")
    private String userName;
//    m.method_of_payment_name,
    /**
     * 支付方式
     */
    @ColName(" m.method_of_payment_name")
    private String paymentName;
//    og.order_form_good_price,og.good_number,og.order_information_freight,
    /**
     * 商品价格
     */
    @ColName("og.order_form_good_price")
    private BigDecimal goodPrice;
    /**
     * 购买商品数量
     */
    @ColName("og.good_number")
    private int orderGoodNumber;
    /**
     * 运费
     */
    @ColName("og.order_information_freight")
    private BigDecimal orderFreight;
//    os.order_form_state_name,
    /**
     * 订单状态
     */
    @ColName("os.order_form_state_name")
    private String orderStateName;
//    od.order_distribution_name,
    /**
     * 订单配送方式
     */
    @ColName("od.order_distribution_name")
    private String orderDistribution;
//    g.good_name,
    /**
     * 商品名称
     */
    @ColName("g.good_name")
    private String goodName;
    //    g.pk_good_id
    /**
     * 商品编号,id
     */
    @ColName("g.pk_good_id")
    private int goodId;
//    gs.good_color_name,
    /**
     * 商品颜色
     */
    @ColName("gs.good_color_name")
    private String goodColor;
//    gsi.good_size_name
    /**
     * 商品型号
     */
    @ColName("good_size_name")
    private String goodSize;
//    gi.good_img_name
    /**
     * 商品链接图片
     */
    @ColName("gi.good_img_name")
    private String goodTitleImg;


    

    public String getGoodSize() {
        return goodSize;
    }

    public void setGoodSize(String goodSize) {
        this.goodSize = goodSize;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getOrderGoodNumber() {
        return orderGoodNumber;
    }

    public void setOrderGoodNumber(int orderGoodNumber) {
        this.orderGoodNumber = orderGoodNumber;
    }

    public BigDecimal getOrderFreight() {
        return orderFreight;
    }

    public void setOrderFreight(BigDecimal orderFreight) {
        this.orderFreight = orderFreight;
    }

    public String getOrderStateName() {
        return orderStateName;
    }

    public void setOrderStateName(String orderStateName) {
        this.orderStateName = orderStateName;
    }

    public String getOrderDistribution() {
        return orderDistribution;
    }

    public void setOrderDistribution(String orderDistribution) {
        this.orderDistribution = orderDistribution;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodColor() {
        return goodColor;
    }

    public void setGoodColor(String goodColor) {
        this.goodColor = goodColor;
    }

    public String getGoodTitleImg() {
        return goodTitleImg;
    }

    public void setGoodTitleImg(String goodTitleImg) {
        this.goodTitleImg = goodTitleImg;
    }
}
