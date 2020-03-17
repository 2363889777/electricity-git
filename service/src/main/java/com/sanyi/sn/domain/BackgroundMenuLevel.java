package com.sanyi.sn.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @author 十年
 * @function 后台菜单等级
 * @date 2020/3/13 0013
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class BackgroundMenuLevel {
//    pk_level_id_bg       tinyint not null auto_increment comment '后台菜单级别编号',
    /**
     * 后台菜单级别编号
     */
    @ColName("pk_level_id_bg")
    private int id;
//    name_level_bg_menu   varchar(50) not null comment '后台菜单级别名称',
    /**
     *后台菜单级别名称
     */
    @ColName("name_level_bg_menu")
    private String name;
//    create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
    /**
     *创建时间
     */
    @ColName("name_level_bg_menu")
    private Date createTime;
//    update_time          datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    /**
     * 更新时间
     */
    @ColName("name_level_bg_menu")
    private Date updateTime;

    @Override
    public String toString() {
        return "BackgroundMenuLevel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
