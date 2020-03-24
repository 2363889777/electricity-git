package com.sanyi.a.dao;

import com.sanyi.a.domain.GoodMarketingDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

/**
 * @工能 衣服商品营销(将商品变成热销，推荐。。。。)表的数据接口
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface GoodMarketingDao {
    @SQL(value="select * from good_marketing",resultType = GoodMarketingDomain.class)
    /**
     *  查询衣服商品营销(将商品变成热销，推荐。。。。)表中的所有数据
     */
    List<GoodMarketingDomain> selectAll();
}
