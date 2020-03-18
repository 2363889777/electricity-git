package com.sanyi.a.dao;

import com.sanyi.a.domain.GoodMarketingTypeDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

/**
 * @工能 衣服商品营销类型(热销，推荐，应季。。。。)表d的数据接口
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface GoodMarketingTypeDao {
    @SQL(value="select * from good_marketing_type",resultType = GoodMarketingTypeDomain.class)
    /**
     *  查询衣服商品营销(将商品变成热销，推荐。。。。)表中的所有数据
     */
    GoodMarketingTypeDomain selectAll();
}
