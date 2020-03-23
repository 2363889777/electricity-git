package com.sanyi.a.dao;

import com.sanyi.a.domain.UserDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;
import com.xuetang9.jdbc.frame.annotation.SqlType;

import java.util.List;

/**
 * @工能 对数据库中 user 表的操作接口
 * @作者 杜目杰
 * @时间 2020/3/20
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface UserDao {
    /**
     * 通过用户名查询用户
     * @param name 前端用户名
     * @return 用户名对应的用户信息对象
     */
    @SQL(value="select * from user where pk_user_name=#{arg0}",resultType = UserDomain.class)
    UserDomain selectByPk_user_name(String name);

    /**
     * 向前端用户表中添加用户
     * @param name  用户名
     * @param pass 用户密码
     * @return 受影响的行数
     */
    @SQL(value="insert into user(pk_user_id,pk_user_name,user_password,create_time,update_time)" +
            " values(default,#{arg0},#{arg1},default,default)",type = SqlType.INSERT)
    int insert(String name, String pass);

    /**
     *  查询pages个用户后的10个用户信息
     * @param pages
     * @return 用户信息对象的集合
     */
    @SQL(value="select * from user limit #{arg0}，10}",resultType = UserDomain.class)
    List<UserDomain> selectTenNumber(int pages);

    /**
     *  查询所有用户
     * @return 用户信息对象的集合
     */
    @SQL(value="select * from user ")
    List<UserDomain> selectAll();
}
