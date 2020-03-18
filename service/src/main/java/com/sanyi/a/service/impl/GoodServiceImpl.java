package com.sanyi.a.service.impl;

import com.sanyi.a.dao.GoodDao;
import com.sanyi.a.domain.GoodDomain;
import com.sanyi.a.service.GoodService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

public class GoodServiceImpl implements GoodService {
    GoodDao goodDao = SqlSessionFactoryUits.getCurrentMapper(GoodDao.class);
    public GoodDomain searchById(int id) {
        return goodDao.selectById(id);
    }
}
