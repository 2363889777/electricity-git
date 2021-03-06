package com.sanyi.sn.dao;

import com.sanyi.sn.domain.good.GoodSize;
import com.sanyi.sn.vo.good.GoodClassifyVo;
import com.sanyi.sn.vo.good.GoodVo;
import com.xuetang9.jdbc.frame.annotation.Param;
import com.xuetang9.jdbc.frame.annotation.SQL;
import com.xuetang9.jdbc.frame.annotation.SqlType;

import java.math.BigInteger;
import java.util.List;

/**
 * @author 十年
 * @function 商品管理DAO
 * @date 2020/3/20 0020
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public interface GoodDao {
    /**
     * 添加商品分类
     * @param classifyName 商品分类名称
     * @param parentId 父级分类Id 0为最上级分类
     * @return 影响行数
     */
    @SQL(value = "insert into good_classify (good_classify_name,good_classify_parent_id) values(#{classifyName},#{parentId});",resultType = int.class,type = SqlType.INSERT)
    int insertGoodClassify(@Param("classifyName") String classifyName,@Param("parentId") int parentId);

    /**
     * 插入营销数据 即给商品添加销售状态
     * @param goodId 商品Id
     * @param goodMarketingTypeId 销售状态ID(对应:热销，推荐，应季。。。)
     * @return 影响行数
     */
    @SQL(value = "insert into good_marketing(pk_good_id,pk_good_marketing_type_id) values(#{goodId},#{goodMarketingTypeId});",resultType = int.class,type = SqlType.INSERT)
    int insertGoodMarketing(@Param("goodId") int goodId, @Param("goodMarketingTypeId") int goodMarketingTypeId);

    /**
     * 根据营销名称返回 营销Id
     * @param marketingName 营销名称(对应:热销，推荐，应季。。。)
     * @return 营销Id
     */
    @SQL(value = "select pk_good_marketing_type_id from good_marketing_type where good_marketing_type_name = #{marketingName};",resultType = Long.class,type = SqlType.SELECT)
    Long getGoodMarketingId(@Param("marketingName") String marketingName);

    /**
     * 删除营销数据 即给商品删除销售状态(根据商品ID ，销售状态ID筛选)
     * @param goodId 商品ID
     * @param goodMarketingTypeId 销售状态ID(对应:热销，推荐，应季。。。)
     * @return 影响行数
     */
    @SQL(value = "delete from good_marketing where pk_good_id = #{goodId} and pk_good_marketing_type_id = #{goodMarketingTypeId};"
            ,resultType = int.class,type = SqlType.DELETE)
    int deleteGoodMarketing(@Param("goodId")int goodId,@Param("goodMarketingTypeId") int goodMarketingTypeId);

    /**
     * 删除营销数据 即给商品删除销售状态(根据商品ID ，销售状态名称筛选)
     * @param goodID 商品ID
     * @param marketingName 销售状态名称(对应:热销，推荐，应季。。。)
     * @return 影响行数
     */
    @SQL(value = "delete from good_marketing where pk_good_id = #{goodID} and \n" +
            "pk_good_marketing_type_id = (select pk_good_marketing_type_id from good_marketing_type where good_marketing_type_name = #{marketingName});"
    ,resultType = int.class,type = SqlType.DELETE)
    int deleteGoodMarketing(@Param("goodID") int goodID,@Param("marketingName") String marketingName);

    /**
     * 根据商品ID 返回 商品相关的营销名称
     * @param goodId 商品ID
     * @return 商品相关的营销名称
     */
    @SQL(value = "select \n" +
            "group_concat(gmt.good_marketing_type_name)\n" +
            "from good_marketing gm \n" +
            "inner join good_marketing_type gmt on gmt.pk_good_marketing_type_id = gm.pk_good_marketing_type_id\n" +
            "where gm.pk_good_id = #{goodId} limit 1;",resultType = String.class,type = SqlType.SELECT)
    String getGoodMarketingName(@Param("goodId") int goodId);

    /**
     * 添加商品基本信息
     * @param classId 所属分类ID
     * @param isPutAway 是否上架
     * @param goodName 商品名称
     * @param goodPrice 商品价格
     * @param goodSales 商品销量
     * @return 影响的行数
     */
    @SQL(value = "insert into good (pk_good_classify_id,pk_good_is_putaway_id,good_name,good_price,good_sales)\n" +
            "values (#{classId},#{isPutAway},#{goodName},#{goodPrice},#{goodSales});",resultType = int.class,type = SqlType.INSERT)
    int insertGoodBaseMessage(@Param("classId") int classId,@Param("isPutAway") int isPutAway,@Param("goodName") String goodName, @Param("goodPrice")double goodPrice, @Param("goodSales")int goodSales);

    /**
     * 添加商品型号
     * @param goodSizeName 商品型号名称
     * @return 影响行数
     */
    @SQL(value = "insert into good_size (good_size_name) values (#{goodSizeName});",resultType = int.class,type = SqlType.INSERT)
    int insertGoodSize(@Param("goodSizeName") String goodSizeName);

    /**
     * 添加商品sku信息
     * @param goodId 商品ID
     * @param goodColor 商品颜色
     * @param sizeId 商品尺寸
     * @param goodPrice 商品价格
     * @param goodCount 商品库存
     * @param goodSales 商品销量
     * @return 影响行数
     */
    @SQL(value = "insert into good_specification_information (pk_good_id,good_color_name,pk_good_size_id,good_specification_price,good_specification_inventory,good_specification_sales)\n" +
            "values (#{goodId},#{goodColor},#{sizeId},#{goodPrice},#{goodCount},#{goodSales});",resultType = int.class,type = SqlType.INSERT)
    int insertGoodSku(@Param("goodId") int goodId,@Param("goodColor") String goodColor,@Param("sizeId") int sizeId, @Param("goodPrice")double goodPrice,@Param("goodCount") int goodCount, @Param("goodSales")int goodSales);

    /**
     * 记录商品 相关图片
     * @param goodId 商品ID
     * @param goodTypeId 图片类型编号（标题链接，展示图片，详细信息）
     * @param imgName 图片名称
     * @return 影响行数
     */
    @SQL(value = "insert into good_img (pk_good_id,pk_good_type_id,good_img_name)values(#{goodId},#{goodTypeId},#{imgName});"
    ,resultType = int.class,type = SqlType.INSERT)
    int insertGoodImg(@Param("goodId") int goodId,@Param("goodTypeId") int goodTypeId,@Param("imgName") String imgName);

    /**
     * 根据输入的 开始行和结束行 返回 相应的 简易商品展示数据
     * @param startNum 开始行
     * @param count 条数
     * @return 简易商品展示数据
     */
    @SQL(value = "select\n" +
            "g.pk_good_id,g.good_name,g.good_sales,g.create_time,\n" +
            "gi.good_img_name,\n" +
            "gc.good_classify_name,\n" +
            "gipt.good_is_putaway_name\n" +
            "from good g\n" +
            "inner join good_img gi on gi.pk_good_id = g.pk_good_id\n" +
            "inner join good_img_type git on git.pk_good_type_id = gi.pk_good_type_id\n" +
            "inner join good_classify gc on gc.pk_good_classify_id = g.pk_good_classify_id\n" +
            "inner join good_is_putaway_table gipt on gipt.pk_good_is_putaway_id = g.pk_good_is_putaway_id\n" +
            "where git.pk_good_type_id = \n" +
            "(select pk_good_type_id from good_img_type where good_img_type_name = '商品标题链接图片')\n" +
            "limit #{startNum},#{count};",resultType = GoodVo.class,type = SqlType.SELECT)
    List<GoodVo> getSimpleGoodVos(@Param("startNum") int startNum,@Param("count") int count);

    /**
     * 获取最近影响的行数
     * @return
     */
    @SQL(value = "select @@identity;",resultType = int.class,type = SqlType.SELECT)
    BigInteger getRecentlyId();

    /**
     * 根据图片类型名称 返回相应的行数
     * @param goodImgTypeName  图片类型名称
     * @return 相应的行数
     */
    @SQL(value = "select pk_good_type_id\n" +
            "from good_img_type where good_img_type_name = #{goodImgName};",resultType = Long.class,type = SqlType.SELECT)
    Long getGoodImgTypeId(@Param("goodImgName") String goodImgTypeName);

    /**
     * 查询上架，下架 对应的Id
     * @param putAwayName 上架，下架名字
     * @return 对应的Id
     */
    @SQL(value = "select pk_good_is_putaway_id from good_is_putaway_table where good_is_putaway_name = #{putAwayName};",
    resultType = Long.class,type = SqlType.SELECT)
    Long getGoodIsPutAwayId(@Param("putAwayName") String putAwayName);

    /**
     * 更新商品上下架状态
     * @param goodId  商品ID
     * @param putAwayId 上下架ID
     * @return 影响行数
     */
    @SQL(value = "update good set pk_good_is_putaway_id = #{putAwayId} where pk_good_id = #{goodId}",resultType = int.class,type = SqlType.UPDATE)
    int updateGoodIsPutAway(@Param("goodId") int goodId,@Param("putAwayId") int putAwayId);

    /**
     * 查询商品分类
     * @param startNum 开始行数
     * @param endNum 结束行数
     * @return 商品分类
     */
    @SQL(value = "select \n" +
            "gc.pk_good_classify_id,gc.good_classify_name,gc.create_time,\n" +
            "pgc.good_classify_name\n" +
            "from good_classify gc\n" +
            "left outer join good_classify pgc on gc.good_classify_parent_id = pgc.pk_good_classify_id\n" +
            "limit #{startNum},#{endNum}",resultType = GoodClassifyVo.class,type = SqlType.SELECT)
    List<GoodClassifyVo> getGoodClassifies(@Param("startNum") int startNum,@Param("endNum") int endNum);

    /**
     * 添加商品分类
     * @param classifyName 分类名称
     * @param parentId 父级Id
     * @return 影响行数
     */
    @SQL(value = "insert into good_classify (good_classify_name,good_classify_parent_id) values(#{classifyName},#{parentId});",
    resultType = int.class,type = SqlType.INSERT)
    int addGoodClassify(@Param("classifyName") String classifyName,@Param("parentId") int parentId);

    /**
     * 查询商品尺码
     * @param startNum 开始行数
     * @param endNum 结束行数
     * @return 商品尺码
     */
    @SQL(value = "select pk_good_size_id,good_size_name,crete_time,update_time from good_size limit #{startNum},#{endNum}"
    ,resultType = GoodSize.class,type = SqlType.SELECT)
    List<GoodSize> getGoodSize(@Param("startNum") int startNum,@Param("endNum") int endNum);

    /**
     * 根据商品名称返回 id
     * @param goodName 商品名称
     * @return 商品id
     */
    @SQL(value = "select pk_good_id from good where good_name = #{goodName};",resultType = Long.class,type = SqlType.SELECT)
    Long getGoodId(@Param("goodName") String goodName);


    /**
     * 查询所有的商品数量
     * @return 所有的商品总数
     */
    @SQL(value = "select\n" +
            "count(*)\n" +
            "from good g\n" +
            "inner join good_img gi on gi.pk_good_id = g.pk_good_id\n" +
            "inner join good_img_type git on git.pk_good_type_id = gi.pk_good_type_id\n" +
            "inner join good_classify gc on gc.pk_good_classify_id = g.pk_good_classify_id\n" +
            "inner join good_is_putaway_table gipt on gipt.pk_good_is_putaway_id = g.pk_good_is_putaway_id\n" +
            "where git.pk_good_type_id = \n" +
            "(select pk_good_type_id from good_img_type where good_img_type_name = '商品标题链接图片')",resultType = Long.class,type = SqlType.SELECT)
    Long getGoodCount();
}
