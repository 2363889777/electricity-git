package com.sanyi.a.service.impl;

import com.sanyi.a.dao.BackgroundConsumerDao;
import com.sanyi.a.domain.BackgroundConsumerDomain;
import com.sanyi.a.service.BackgroundRegisterService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

/**
 * @工能  执行后端注册业务
 * @作者 杜目杰
 * @时间 2020/3/19
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class BackgroundRegisterServiceImpl implements BackgroundRegisterService {
    BackgroundConsumerDao backgroundConsumerDao = SqlSessionFactoryUits.getCurrentMapper(BackgroundConsumerDao.class);
    public int registerByNameAndPass(String name , String realName,String pass) {
        // 查询用户是否已经存在
        BackgroundConsumerDomain userDomain = backgroundConsumerDao.selectByPk_user_name(name);
        //保存该用户名是否已被注册的结果
        boolean sResult = userDomain == null;
        //判断
        if(sResult){
            //执行注册语句并保存受影响的条数
            int rResult = backgroundConsumerDao.addEmployee(name,realName,pass);
            // 提交事物让sql语句生效
            SqlSessionFactoryUits.commit();
            return rResult;
        }
        //已被注册返回-1
        return -1;
    }
}
