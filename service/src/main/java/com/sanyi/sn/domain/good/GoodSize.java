package com.sanyi.sn.domain.good;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @author 十年
 * @function 商品尺码
 * @date 2020/3/22 0022
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class GoodSize {
//    -- 查询商品尺码
//-- create table good_size
//-- (
//        --    pk_good_size_id      int unsigned not null auto_increment comment '衣服尺码编号',
    /**
     *衣服尺码编号
     */
    @ColName("pk_good_size_id")
    private  int id;
//            --    good_size_name       varchar(50) not null comment '衣服尺码名称(M  L  XL 2XL)',
    /**
     *衣服尺码名称(M  L  XL 2XL)
     */
    @ColName("good_size_name")
    private String name;
//            --    crete_time           datetime not null default CURRENT_TIMESTAMP comment '创建时间',
    /**
     *创建时间
     */
    @ColName("crete_time")
    private Date createTime;
//            --    update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    /**
     *更新时间
     */
    @ColName("update_time")
    private Date updateTime;
//            --    primary key (pk_good_size_id)


    @Override
    public String toString() {
        return "GoodSize{" +
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
