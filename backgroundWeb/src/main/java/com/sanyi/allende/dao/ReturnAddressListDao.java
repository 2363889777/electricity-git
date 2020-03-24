package com.sanyi.allende.dao;

import com.sanyi.allende.domain.ReturnAddressList;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

public interface ReturnAddressListDao {

    @SQL(value = "select * from return_address")
    List<ReturnAddressList> getAllReturnAddress();
}
