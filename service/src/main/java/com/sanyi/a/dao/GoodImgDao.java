package com.sanyi.a.dao;

import com.sanyi.a.domain.GoodImgDomain;
import com.xuetang9.jdbc.frame.annotation.SQL;

import java.util.List;

/**
 * @工能 商品图片表的接口
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface GoodImgDao {
    @SQL(value = "select * from good_img", resultType = GoodImgDomain.class)
    /**
     * 商品图片表的所欲数据
     */
    List<GoodImgDomain>  selectAll();
}
