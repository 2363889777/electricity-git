package com.sanyi.a.dao;


import com.sanyi.a.domain.GoodDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

public interface GoodDao {
    @SQL(value="select * from good where pk_good_id=#{arg0}",resultType = GoodDomain.class)
    GoodDomain selectById(int id);
    @SQL(value="select * from good ",resultType = GoodDomain.class)
    List<GoodDomain> selectAll();
}
