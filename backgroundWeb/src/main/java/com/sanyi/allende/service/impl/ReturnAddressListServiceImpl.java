package com.sanyi.allende.service.impl;

import com.sanyi.allende.dao.ReturnAddressListDao;
import com.sanyi.allende.domain.ReturnAddressList;
import com.sanyi.allende.service.ReturnAddressListService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

public class ReturnAddressListServiceImpl implements ReturnAddressListService {
    private ReturnAddressListDao returnAddressListDao= SqlSessionFactoryUits.getCurrentSqlSession().getMapper(ReturnAddressListDao.class);

    @Override
    public List<ReturnAddressList> getAllReturnAddressList() {
        return returnAddressListDao.getAllReturnAddress();
    }
}
