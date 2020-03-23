package com.sanyi.a.dao;

import com.sanyi.a.domain.GoodSpecificationInformationDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

/**
 * @工能 商品规格信息表数据接口
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface GoodSpecificationInformationDao {
    @SQL(value="select * from good_marketing_type",resultType = GoodSpecificationInformationDomain.class)
    /**
     *  商品规格信息表中的所有数据
     */
    GoodSpecificationInformationDomain selectAll();
}
