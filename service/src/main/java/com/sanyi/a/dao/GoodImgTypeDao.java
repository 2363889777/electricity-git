package com.sanyi.a.dao;


import com.sanyi.a.domain.GoodImgTypeDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

/**
 * @工能 商品图片类型表的数据接口
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface GoodImgTypeDao {
    @SQL(value="select * from good_img_type",resultType = GoodImgTypeDomain.class)
    /**
     *  查询商品图片类型表中的所有数据
     */
    List<GoodImgTypeDomain> selectAll();
}
