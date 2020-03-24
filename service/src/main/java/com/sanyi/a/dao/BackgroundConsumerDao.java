package com.sanyi.a.dao;

import com.sanyi.a.domain.BackgroundConsumerDomain;
import com.sanyi.a.domain.UserDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;
import com.xuetang9.jdbc.frame.annotation.SqlType;

import java.util.List;

/**
 * @工能 对数据库中background_consumer表的操作接口
 * @作者 杜目杰
 * @时间 2020/3/20
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface BackgroundConsumerDao {
    /**
     *  得到员工表中所有的员工
     * @return 员工的集合
     */
    @SQL(value="select * from background_consumer ",resultType = BackgroundConsumerDomain.class )
    List<BackgroundConsumerDomain> selectAll();
    /**
     * 根据用户名查找员工
     * @param name 后端用户名
     * @return 查询到的员工
     */
    @SQL(value="select * from background_consumer where pk_customer_name=#{arg0}",resultType = BackgroundConsumerDomain.class)
    BackgroundConsumerDomain selectByPk_user_name(String name);

    /**
     *  添加员工
     * @param name 后端用户名
     * @param realName 员工真实姓名
     * @param pass 用户密码
     * @return
     */
    @SQL(value="insert into background_consumer(pk_customer_bg_id,pk_customer_name,customer_real_name,customer_password,create_time,update_time)" +
            " values(default,#{arg0},#{arg1},#{arg2},default,default)",type = SqlType.INSERT)
    int addEmployee(String name, String realName, String pass);

    /**
     * 根据用户名删除员工
     * @param name 后端用户名
     * @return 受影响的行数
     */
    @SQL(value="delete from background_consumer where pk_customer_name=#{arg0}",type = SqlType.DELETE)
    int deleteByName(String name);

    /**
     *  查询pages个用户后的10个用户信息
     * @param pages
     * @return 用户信息对象的集合
     */
    @SQL(value="select * from background_consumer limit #{arg0}，10}",resultType = UserDomain.class)
    List<UserDomain> selectTenNumber(int pages);
}
