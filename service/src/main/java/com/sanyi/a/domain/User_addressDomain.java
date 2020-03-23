package com.sanyi.a.domain;

import java.util.Date;
/**
 *
 * @功能 用来定义对应表User_address的结构
 * @作者 杜目杰
 * @时间 2020年2月28日 上午9:30:19
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 *
 */
public class User_addressDomain {
    private int pk_user_address_id ;
    private int pk_user_id;
    private String user_address_message;
    private String user_addressee;
    private String addressee_phone;
    private Date create_time;
    private Date update_time;

    public int getPk_user_address_id() {
        return pk_user_address_id;
    }

    public void setPk_user_address_id(int pk_user_address_id) {
        this.pk_user_address_id = pk_user_address_id;
    }

    public int getPk_user_id() {
        return pk_user_id;
    }

    public void setPk_user_id(int pk_user_id) {
        this.pk_user_id = pk_user_id;
    }

    public String getUser_address_message() {
        return user_address_message;
    }

    public void setUser_address_message(String user_address_message) {
        this.user_address_message = user_address_message;
    }

    public String getUser_addressee() {
        return user_addressee;
    }

    public void setUser_addressee(String user_addressee) {
        this.user_addressee = user_addressee;
    }

    public String getAddressee_phone() {
        return addressee_phone;
    }

    public void setAddressee_phone(String addressee_phone) {
        this.addressee_phone = addressee_phone;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
