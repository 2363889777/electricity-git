package com.sanyi.allende.dao;

import com.sanyi.allende.domain.PrimeList;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

public interface PrimeListDao {
    // 1. 分页查询显示+多表查询会员信息
    // 2. 有多个表选择单独查询某一两个信息

    //
    // select
    // pk_user_id,
    // user_name,
    // user_integral,
    // user_address_message,
    // create_time
    // from user_message um
    // inner join user_shopping_message usm on usm.pk_user_id = um.pk_user_id
    // inner join user_address uad on uad.pk_user_id = um.pk_user_id
    @SQL(value="select \n" +
            "\t\tum.pk_user_id,\n" +
            "\t\tum.user_name,\n" +
            "\t\tusm.user_integral,\n" +
            "\t\tuad.user_address_message,\n" +
            "\t\tum.create_time from user_message um\n" +
            "\t\tinner join user_shopping_message usm on usm.pk_user_id = um.pk_user_id \n" +
            "\t\tinner join user_address uad on uad.pk_user_id = um.pk_user_id",resultType = PrimeList.class)
    List<PrimeList> getAllPrime();


}
