package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;
/**
 * @工能 商品信息表的实体类
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class GoodDomain{
    /**
     * 商品编号
     */
    @ColName("pk_good_id")
    private int goodId;
    /**
     * 商品分类编号
     */
    @ColName("pk_good_classify_id")
    private int classifyId;
    /**
     * 商品名称
     */
    @ColName("good_name")
    private String goodName;
    /**
     * 商品价格
     */
    @ColName("good_price")
    private double goodPrice;
    /**
     * 商品销量
     */
    @ColName("good_sales")
    private int goodSales;
    /**
     * 创建时间
     */
    @ColName("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @ColName("update_time")
    private Date updateTime;

    /**
     * 得到商品信息表的最近更新时间
     * @return 表的更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置商品信息表的最近更新时间
     * @param updateTime 更新时的时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  得到商品编号
     * @return 商品编号
     */
    public int getGoodId() {
        return goodId;
    }

    /**
     * 设置商品编号
     * @param goodId 商品编号
     */
    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    /**
     * 得到商品分类编号
     * @return 商品分类编号
     */
    public int getClassifyId() {
        return classifyId;
    }

    /**
     * 设置商品分类编号
     * @param classifyId 商品分类编号
     */
    public void setClassifyId(int classifyId) {
        this.classifyId = classifyId;
    }

    /**
     * 得到商品名称
     * @return 商品名称
     */
    public String getGoodName() {
        return goodName;
    }

    /**
     * 设置商品名称
     * @param goodName 商品名称
     */
    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    /**
     * 得到商品价格
     * @return 商品价格
     */
    public double getGoodPrice() {
        return goodPrice;
    }

    /**
     * 设置商品价格
     * @param goodPrice 商品价格
     */
    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    /**
     * 得到商品销量
     * @return 商品销量
     */
    public int getGoodSales() {
        return goodSales;
    }

    /**
     * 设置商品销量
     * @param goodSales 商品销量
     */
    public void setGoodSales(int goodSales) {
        this.goodSales = goodSales;
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
