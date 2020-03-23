package com.sanyi.a.service.impl;

import com.sanyi.a.dao.UserDao;
import com.sanyi.a.domain.UserDomain;
import com.sanyi.a.service.LoginService;
import com.sanyi.a.utils.StringUtils;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

/**
 * @工能 后端注册业务
 * @作者 杜目杰
 * @时间 2020/3/20
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class LoginServiceImpl implements LoginService {
    UserDao userDao = SqlSessionFactoryUits.getCurrentMapper(UserDao.class);
    public boolean loginCheck(String name, String password) {
        String pass = userDao.selectByPk_user_name(name).getUser_password();
        return password.equals(pass)&& StringUtils.isNotNullOrWhiteSpace(pass);
    }
    public int getPages() {
        int numbers = userDao.selectAll().size();
        int page = numbers/10;
        if(numbers > page*10){
            page += 1;
        }
        return page;
    }

    public List<UserDomain> getPagesDate(int pages) {
        return userDao.selectTenNumber((pages-1)*10);
    }
}
