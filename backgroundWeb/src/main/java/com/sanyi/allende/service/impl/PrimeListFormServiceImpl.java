package com.sanyi.allende.service.impl;

import com.sanyi.allende.dao.PrimeListFormDao;
import com.sanyi.allende.domain.PrimeListForm;
import com.sanyi.allende.service.PrimeListFormService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

public class PrimeListFormServiceImpl implements PrimeListFormService {
    private PrimeListFormDao primeListFormDao = (PrimeListFormDao) SqlSessionFactoryUits.getCurrentMapper(PrimeListForm.class);

    @Override
    public List<PrimeListForm> getAllPrimeForm() {
        return primeListFormDao.getAllPrimeForm();
    }
}
