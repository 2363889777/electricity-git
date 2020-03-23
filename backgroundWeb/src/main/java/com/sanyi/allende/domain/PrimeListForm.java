package com.sanyi.allende.domain;

import java.sql.Date;

public class PrimeListForm {
    private Integer pkUserMessageId;
    private Integer pkUserId;
    private String userName;
    private String userPhone;
    private Date createTime;
    private Date updateTime;

    public Integer getPkUserMessageId() {
        return pkUserMessageId;
    }

    public void setPkUserMessageId(Integer pkUserMessageId) {
        this.pkUserMessageId = pkUserMessageId;
    }

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

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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
