package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @工能 商品规格信息表的实体类
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class GoodSpecificationInformationDomain {

    /**
     * 商品规格信息编号
     */
    @ColName("pk_good_specification_id")
    private int pkGoodSpecificationId;
    /**
     * 商品编号
     */
    @ColName("pk_good_id")
    private int pkGoodId;
    /**
     * 衣服颜色名称
     */
    @ColName("good_color_name")
    private String goodColorName;
    /**
     * 衣服尺码编号
     */
    @ColName("pk_good_size_id")
    private int pkGoodSizeId;
    /**
     * 该规格具体价格
     */
    @ColName("good_specification_price")
    private double goodSpecificationPrice;
    /**
     * 该规格库存
     */
    @ColName("good_specification_inventory")
    private int goodSpecificationInventory;
    /**
     * 该规格销量
     */
    @ColName("good_specification_sales")
    private int goodSpecificationSales;
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
     * 得到商品规格信息编号
     * @return 商品规格信息编号
     */
    public int getPkGoodSpecificationId() {
        return pkGoodSpecificationId;
    }

    /**
     * 设置商品规格信息编号
     * @param pkGoodSpecificationId 商品规格信息编号
     */
    public void setPkGoodSpecificationId(int pkGoodSpecificationId) {
        this.pkGoodSpecificationId = pkGoodSpecificationId;
    }

    /**
     * 得到商品编号
     * @return 商品编号
     */
    public int getPkGoodId() {
        return pkGoodId;
    }

    /**
     * 设置商品编号
     * @param pkGoodId 商品编号
     */
    public void setPkGoodId(int pkGoodId) {
        this.pkGoodId = pkGoodId;
    }

    /**
     *  得到商品编号
     * @return 衣服颜色名称
     */
    public String getGoodColorName() {
        return goodColorName;
    }

    /**
     * 设置商品编号
     * @param goodColorName 商品编号
     */
    public void setGoodColorName(String goodColorName) {
        this.goodColorName = goodColorName;
    }

    /**
     * 得到衣服尺码编号
     * @return 衣服尺码编号
     */
    public int getPkGoodSizeId() {
        return pkGoodSizeId;
    }

    /**
     * 设置衣服尺码编号
     * @param pkGoodSizeId 衣服尺码编号
     */
    public void setPkGoodSizeId(int pkGoodSizeId) {
        this.pkGoodSizeId = pkGoodSizeId;
    }

    /**
     * 得到该规格具体价格
     * @return 该规格具体价格
     */
    public double getGoodSpecificationPrice() {
        return goodSpecificationPrice;
    }

    /**
     * 设置该规格具体价格
     * @param goodSpecificationPrice 该规格具体价格
     */
    public void setGoodSpecificationPrice(double goodSpecificationPrice) {
        this.goodSpecificationPrice = goodSpecificationPrice;
    }

    /**
     * 得到该规格库存
     * @return 该规格库存
     */
    public int getGoodSpecificationInventory() {
        return goodSpecificationInventory;
    }

    /**
     * 设置该规格库存
     * @param goodSpecificationInventory 该规格库存
     */
    public void setGoodSpecificationInventory(int goodSpecificationInventory) {
        this.goodSpecificationInventory = goodSpecificationInventory;
    }

    /**
     * 得到该规格数量
     * @return  该规格数量
     */
    public int getGoodSpecificationSales() {
        return goodSpecificationSales;
    }

    /**
     * 设置该规格数量
     * @param goodSpecificationSales 该规格数量
     */
    public void setGoodSpecificationSales(int goodSpecificationSales) {
        this.goodSpecificationSales = goodSpecificationSales;
    }

    /**
     * 得到更新时间
     * @return 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     * @param updateTime 设置
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
     * 设置创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
