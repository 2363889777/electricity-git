package com.sanyi.a.dao;

import com.sanyi.a.domain.GoodClassifyDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

/**
 * @工能 商品分类表的数据接口
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface GoodClassifyDao {
    @SQL(value = "select * from good_classify", resultType = GoodClassifyDomain.class)
    /**
     * 查询商品分类表的所欲数据
     */
    List<GoodClassifyDomain> selectAll();
}
