package com.sanyi.a.service.impl;

import com.sanyi.a.dao.UserDao;
import com.sanyi.a.service.LoginService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/18
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class LoginServiceImpl implements LoginService {
    UserDao userDao = SqlSessionFactoryUits.getCurrentMapper(UserDao.class);

    public boolean loginCheck(String name, String password) {

        String pass = userDao.selectByPk_user_name(name).getUser_password();

        return pass.equals(password) && password != null && password.length() >= 0;

    }
}
