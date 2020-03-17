package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @工能 衣服商品营销类型(热销，推荐，应季。。。。)表的实体类
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class GoodMarketingTypeDomain {

    /**
     *衣服商品营销类型编号
     */
    @ColName("pk_good_marketing_type_id")
    private int pkGoodMarketingTypeId;
    /**
     * 衣服商品营销类型名称(热销，推荐，应季。。。)
     */
    @ColName("good_marketing_type_name")
    private String goodMarketingTypeName;
    /**
     * 更新时间
     */
    @ColName("update_time")
    private Date updateTime;
    /**
     * 创建时间
     */
    @ColName("create_time")
    private Date createTime;

    /**
     * 得到衣服商品营销类型编号
     * @return 衣服商品营销类型编号
     */
    public int getPkGoodMarketingTypeId() {
        return pkGoodMarketingTypeId;
    }

    /**
     * 设置衣服商品营销类型编号
     * @param pkGoodMarketingTypeId 衣服商品营销类型编号
     */
    public void setPkGoodMarketingTypeId(int pkGoodMarketingTypeId) {
        this.pkGoodMarketingTypeId = pkGoodMarketingTypeId;
    }

    /**
     * 得到衣服商品营销类型名称
     * @return 衣服商品营销类型名称
     */
    public String getGoodMarketingTypeName() {
        return goodMarketingTypeName;
    }

    /**
     * 设置衣服商品营销类型名称
     * @param goodMarketingTypeName 衣服商品营销类型名称
     */
    public void setGoodMarketingTypeName(String goodMarketingTypeName) {
        this.goodMarketingTypeName = goodMarketingTypeName;
    }

    /**
     *  得到更新时间
     * @return 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  设置更新时间
     * @param updateTime  更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 得到创建时间
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  设置创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
