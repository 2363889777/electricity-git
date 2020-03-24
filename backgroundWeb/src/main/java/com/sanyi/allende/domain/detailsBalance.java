package com.sanyi.allende.domain;

import java.sql.Date;

// 二期工程
public class detailsBalance {
    // 用户ID         user_message            pk_user_id
    private Integer pkUserId;
    // 头像
    // 昵称
    private String userName;
    // 余额变动场景
    // 变动金额      user_shopping_message     shopping_menoy
    private Double shoppingMoney;
    // 描述说明
    // 管理员备注
    // 创建时间      user_shopping_message     createTime;
    private Date createTime;
}
