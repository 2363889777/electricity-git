package com.sanyi.a.service.impl;

import com.sanyi.a.dao.UserDao;
import com.sanyi.a.domain.UserDomain;
import com.sanyi.a.service.UserService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;



public class UserServiceImpl implements UserService {
    UserDao userDao = SqlSessionFactoryUits.getCurrentMapper(UserDao.class);
    public UserDomain searchByName(String name) {
        return userDao.selectByPk_user_name(name);
    }

    public int addUser(Object[] values) {
        return userDao.insert(values);
    }
}
