package com.sanyi.allende.service.impl;

import com.sanyi.allende.dao.FreightFormworkListDao;
import com.sanyi.allende.domain.FreightFormwork;
import com.sanyi.allende.service.FreightFormworkService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

public class FreightFormworkServiceImpl implements FreightFormworkService {
    private FreightFormworkListDao freightFormworkListDao= SqlSessionFactoryUits.getCurrentSqlSession().getMapper(FreightFormworkListDao.class);
    @Override
    public List<FreightFormwork> getAllFreightFormwork() {
        return freightFormworkListDao.getAllFreightFormwork();
    }
}
