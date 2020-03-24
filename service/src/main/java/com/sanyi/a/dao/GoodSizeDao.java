package com.sanyi.a.dao;

import com.sanyi.a.domain.GoodSizeDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

/**
 * @工能 衣服商品尺码(M.L.XL,2XL)表的数据接口
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface GoodSizeDao {
    @SQL(value="select * from good_marketing_type",resultType =GoodSizeDomain.class)
    /**
     *  查询衣服商品尺码(M.L.XL,2XL)表中的所有数据
     */
    GoodSizeDomain selectAll();
}
