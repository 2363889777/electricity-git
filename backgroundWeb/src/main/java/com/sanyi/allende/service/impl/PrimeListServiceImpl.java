package com.sanyi.allende.service.impl;

import com.sanyi.allende.dao.PrimeListDao;
import com.sanyi.allende.domain.PrimeList;
import com.sanyi.allende.service.PrimeListService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

public class PrimeListServiceImpl implements PrimeListService {
    private PrimeListDao primeListDao= SqlSessionFactoryUits.getCurrentSqlSession().getMapper(PrimeListDao.class);

    @Override
    public List<PrimeList> getAllPrime() {
        return primeListDao.getAllPrime();
    }
}
