package com.sanyi.sn.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @author 十年
 * @function 后台菜单项
 * @date 2020/3/14 0014
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class BackgroundMenu {
//    pk_background_menu_id int unsigned not null auto_increment comment '后台菜单编号',
    /**
     *后台菜单编号
     */
    @ColName("pk_background_menu_id")
    private int id;
//    pk_level_id_bg       tinyint comment '后台菜单级别编号',
    /**
     *后台菜单级别编号
     */
    @ColName("pk_level_id_bg")
    private int levelId;
//    background_menu_name varchar(50) not null comment '后台菜单名称记录',
    /**
     *后台菜单名称记录
     */
    @ColName("background_menu_name")
    private String name;
//    background_url       varchar(50) not null default '/logic' comment '后台菜单地址信息记录',
    /**
     *后台菜单地址信息记录
     */
    @ColName("background_url")
    private String url;
//    background_menu_font_icon varchar(50) default 'fa-hand-pointer-o' comment '后台菜单字体图标',
    /**
     *后台菜单字体图标
     */
    @ColName("background_menu_font_icon")
    private String icon;
//    parent_id_background_menu int unsigned not null default 0 comment '父级菜单编号',
    /**
     *父级菜单编号
     */
    @ColName("parent_id_background_menu")
    private int parentId;
//    create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
    /**
     *创建时间
     */
    @ColName("create_time")
    private Date createTime;
//    update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    /**
     *更新时间
     */
    @ColName("update_time")
    private Date updateTime;

    @Override
    public String toString() {
        return "BackgroundMenu{" +
                "id=" + id +
                ", levelId=" + levelId +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", parentId=" + parentId +
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

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
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
