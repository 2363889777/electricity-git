package com.sanyi.allende.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.sql.Date;

// 设置 退货列表
public class ReturnAddressList {
    // 表 return_address
    // 地址 return_address  pk_return_address_id
    @ColName("pk_return_address_id")
    private Integer pkReturnAddressId;
    // 收货人姓名
    @ColName("return_consignee_name")
    private String returnConsigneeName;
    // 联系电话
    @ColName("return_phone")
    private String returnPhone;
    // 详细地址
    @ColName("return_address_location")
    private String returnAddressLocation;
    // 排序
    @ColName("return_address_show_s")
    private Integer returnAddressShows;
    // 添加时间
    @ColName("create_time")
    private Date createTime;
    // 更新时间
    @ColName("update_time")
    private Date updateTime;

    public Integer getPkReturnAddressId() {
        return pkReturnAddressId;
    }

    public void setPkReturnAddressId(Integer pkReturnAddressId) {
        this.pkReturnAddressId = pkReturnAddressId;
    }

    public String getReturnConsigneeName() {
        return returnConsigneeName;
    }

    public void setReturnConsigneeName(String returnConsigneeName) {
        this.returnConsigneeName = returnConsigneeName;
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    public String getReturnAddressLocation() {
        return returnAddressLocation;
    }

    public void setReturnAddressLocation(String returnAddressLocation) {
        this.returnAddressLocation = returnAddressLocation;
    }

    public Integer getReturnAddressShows() {
        return returnAddressShows;
    }

    public void setReturnAddressShows(Integer returnAddressShows) {
        this.returnAddressShows = returnAddressShows;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
