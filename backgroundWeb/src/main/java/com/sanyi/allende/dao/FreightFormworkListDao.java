package com.sanyi.allende.dao;


import com.sanyi.allende.domain.FreightFormwork;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

public interface FreightFormworkListDao {

    @SQL(value = "",resultType = FreightFormwork.class)
    List<FreightFormwork> getAllFreightFormwork();
}
