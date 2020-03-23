package com.sanyi.a.service.impl;

import com.sanyi.a.dao.BackgroundConsumerDao;
import com.sanyi.a.domain.BackgroundConsumerDomain;
import com.sanyi.a.domain.UserDomain;
import com.sanyi.a.service.PersonnelManagementService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/21
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class PersonnelManagementServiceImpl implements PersonnelManagementService {
    BackgroundConsumerDao backgroundConsumerDao = SqlSessionFactoryUits.getCurrentMapper(BackgroundConsumerDao.class);
    public int getPages() {
        int numbers = backgroundConsumerDao.selectAll().size();
        int page = numbers/10;
        if(numbers > page*10){
            page += 1;
        }
        return page;
    }

    public List<UserDomain> getPagesDate(int pages) {
        return backgroundConsumerDao.selectTenNumber((pages-1)*10);
    }

    public int deleteUser(String name) {
       int dResult = backgroundConsumerDao.deleteByName(name);
        SqlSessionFactoryUits.commit();
        return dResult;
    }

    public int addEmployee(String name, String realName, String pass) {
        int aResult = -1;
        boolean sResult = backgroundConsumerDao.selectByPk_user_name(name) == null;
        if(sResult){
             aResult = backgroundConsumerDao.addEmployee(name,realName,pass);
        }

        return aResult;
    }

    public List<BackgroundConsumerDomain> inquireAll() {
        return backgroundConsumerDao.selectAll();
    }

}
