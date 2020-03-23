package com.sanyi.allende.dao;

import com.sanyi.allende.domain.PrimeListForm;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

public interface PrimeListFormDao {

    // 查询全部的表
    @SQL(value="select * from user_message",resultType = PrimeListForm.class)
    List<PrimeListForm> getAllPrimeForm();
}
