package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/20
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class BackgroundConsumerDomain {
    /**
     * 后台人员编号
     */
    @ColName("pk_customer_bg_id")
    private int pkCustomerBgId;
    /**
     * 用户权限
     */
    @ColName("customer_level")
    private int customerLevel;
    /**
     * 用户名
     */
    @ColName("pk_customer_name")
    private String pkCustomerName;
    /**
     * 后台人员姓名
     */
    @ColName("customer_real_name")
    private String customerRealName;
    /**
     * 用户密码
     */
    @ColName("customer_password")
    private String customerPassword;
    /**
     * 更新时间
     */
    @ColName("update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @ColName("create_time")
    private Date createTime;

    public int getPkCustomerBgId() {
        return pkCustomerBgId;
    }

    public void setPkCustomerBgId(int pkCustomerBgId) {
        this.pkCustomerBgId = pkCustomerBgId;
    }

    public int getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(int customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getPkCustomerName() {
        return pkCustomerName;
    }

    public void setPkCustomerName(String pkCustomerName) {
        this.pkCustomerName = pkCustomerName;
    }

    public String getCustomerRealName() {
        return customerRealName;
    }

    public void setCustomerRealName(String customerRealName) {
        this.customerRealName = customerRealName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
