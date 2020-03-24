package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;
/**
 *
 * @功能 用来定义对应表user的结构
 * @作者 杜目杰
 * @时间 2020年2月28日 上午9:30:19
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 *
 */
public class UserDomain {
    @ColName("pk_user_id")
    private int pk_user_id;
    @ColName("pk_user_name")
    private String pk_user_name;
    @ColName("user_password")
    private String user_password;
    @ColName("create_time")
    private  Date create_time;
    @ColName("update_time")
    private Date update_time;

    public int getPk_user_id() {
        return pk_user_id;
    }

    public void setPk_user_id(int pk_user_id) {
        this.pk_user_id = pk_user_id;
    }

    public String getPk_user_name() {
        return pk_user_name;
    }

    public void setPk_user_name(String pk_user_name) {
        this.pk_user_name = pk_user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
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
