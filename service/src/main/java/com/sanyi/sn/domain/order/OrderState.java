package com.sanyi.sn.domain.order;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @author 十年
 * @function 订单状态 实体类
 * @date 2020/3/19 0019
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class OrderState {
//    pk_order_form_state_id int not null auto_increment comment '订单状态编号',
    /**
     * 订单状态编号
     */
    @ColName("pk_order_form_state_id")
    private int id;
//    order_form_state_name varchar(50) not null comment '订单状态名称',
    /**
     * 订单状态名称
     */
    @ColName("order_form_state_name")
    private String stateName;
//    create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
    /**
     * 创建时间
     */
    @ColName("create_time")
    private Date createTime;
//    update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    /**
     * 更新时间
     */
    @ColName("update_time")
    private Date updateTime;

    @Override
    public String toString() {
        return "OrderState{" +
                "id=" + id +
                ", stateName='" + stateName + '\'' +
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

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
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
