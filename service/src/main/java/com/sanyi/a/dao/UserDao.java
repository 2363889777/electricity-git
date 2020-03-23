package com.sanyi.a.dao;

import com.sanyi.a.domain.UserDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

public interface UserDao {
    @SQL(value="select * from user where pk_user_name=#{arg0}",resultType = UserDomain.class)
    UserDomain selectByPk_user_name(String name);
    @SQL(value="insert into user(pk_user_id,pk_user_name,user_password,create_time,update_time) values(#{arg0},#{arg1},#{arg2},#{arg3},#{arg4})")
    int insert(Object[] values);
}
