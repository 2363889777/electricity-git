package com.sanyi.a.service.impl;

import com.sanyi.a.dao.BackgroundConsumerDao;
import com.sanyi.a.domain.BackgroundConsumerDomain;
import com.sanyi.a.domain.UserDomain;
import com.sanyi.a.service.BackgroundLoginService;
import com.sanyi.a.service.LoginService;
import com.sanyi.a.utils.StringUtils;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

/**
 * @工能 执行后端登录业务
 * @作者 杜目杰
 * @时间 2020/3/18
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class BackgroundLoginServiceImpl implements BackgroundLoginService {
    BackgroundConsumerDao backgroundConsumerDao = SqlSessionFactoryUits.getCurrentMapper(BackgroundConsumerDao.class);
    public boolean loginCheck(String name, String password) {

        BackgroundConsumerDomain backgroundConsumerDomain =  backgroundConsumerDao.selectByPk_user_name(name);
        if (backgroundConsumerDomain == null){
            return false;
        }
        String pass =backgroundConsumerDomain.getCustomerPassword();
        return password.equals(pass)&& StringUtils.isNotNullOrWhiteSpace(pass);
    }
    public int getPages() {
        int numbers = backgroundConsumerDao.selectAll().size();
        int page = numbers/10;
        if(numbers > page*10){
            page += 1;
        }
        return page;
    }

    public List<BackgroundConsumerDomain> getPagesDate(int pages) {
        return backgroundConsumerDao.selectTenNumber((pages-1)*10);
    }
}
