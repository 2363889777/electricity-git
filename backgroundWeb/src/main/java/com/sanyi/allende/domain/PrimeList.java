package com.sanyi.allende.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

public class PrimeList {
    // 对象名          数据库表名              数据库列名
    // 用户ID         user_message            pk_user_id
    @ColName("um.pk_user_id")
    private Integer pkUserId;
    // 用户头像 无
    // 用户昵称       user_message            user_name
    @ColName("um.user_name")
    private String userName;
    // 用户余额 无
    // 可用积分       user_shopping_message   user_integral
    @ColName("usm.user_integral")
    private Integer userIntegral;
    // 会员等级 无
    // 实际消费金额
    // 性别 无
    // 国家 无
    // 城市 无
    // 地址           user_address           user_address_message
    @ColName("uad.user_address_message")
    private String userAddressMessage;
    // 注册时间       user_message           create_time
    @ColName("um.create_time")
    private Date createTime;

    public Integer getPkUserId() {
        return pkUserId;
    }

    public void setPkUserId(Integer pkUserId) {
        this.pkUserId = pkUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    public String getUserAddressMessage() {
        return userAddressMessage;
    }

    public void setUserAddressMessage(String userAddressMessage) {
        this.userAddressMessage = userAddressMessage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date dateTime) {
        this.createTime = dateTime;
    }
}
