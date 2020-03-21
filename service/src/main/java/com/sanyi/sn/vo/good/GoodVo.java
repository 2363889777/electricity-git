package com.sanyi.sn.vo.good;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @author 十年
 * @function 商品展示简易数据
 * @date 2020/3/20 0020
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class GoodVo {
//    -- 商品Id 商品图片 商品名称 商品分类 商品销量 商品状态（上架，下架） 商品营销（热销，推荐，应季） 商品创建时间
//    g.pk_good_id,g.good_name,g.good_sales,g.create_time,
    /**
     * 商品Id
     */
    @ColName("g.pk_good_id")
    private int goodId;
    /**
     * 商品名称
     */
    @ColName("g.good_name")
    private String goodName;
    /**
     * 商品销量
     */
    @ColName("g.good_sales")
    private int goodSales;
    /**
     * 商品创建时间
     */
    @ColName("g.create_time")
    private Date goodCreateTime;
//    gi.good_img_name,
    /**
     * 商品图片
     */
    @ColName("gi.good_img_name")
    private String imgName;
//    gc.good_classify_name,
    /**
     * 商品分类名称
     */
    @ColName("gc.good_classify_name")
    private String goodClassifyName;
//    gipt.good_is_putaway_name
    /**
     * 商品状态（上架，下架）
     */
    @ColName("gipt.good_is_putaway_name")
    private String goodIsPutAwayName;

    /**
     * 商品是否热销
     */
    @ColName("")
    private boolean goodIsHot;

    /**
     * 商品是否推荐
     */
    @ColName("")
    private boolean goodIsRecommend;

    /**
     * 商品是否应季
     */
    @ColName("")
    private boolean goodIsSeasonal;

    @Override
    public String toString() {
        return "GoodVo{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodSales=" + goodSales +
                ", goodCreateTime=" + goodCreateTime +
                ", imgName='" + imgName + '\'' +
                ", goodClassifyName='" + goodClassifyName + '\'' +
                ", goodIsPutAwayName='" + goodIsPutAwayName + '\'' +
                '}';
    }

    public boolean isGoodIsHot() {
        return goodIsHot;
    }

    public void setGoodIsHot(boolean goodIsHot) {
        this.goodIsHot = goodIsHot;
    }

    public boolean isGoodIsRecommend() {
        return goodIsRecommend;
    }

    public void setGoodIsRecommend(boolean goodIsRecommend) {
        this.goodIsRecommend = goodIsRecommend;
    }

    public boolean isGoodIsSeasonal() {
        return goodIsSeasonal;
    }

    public void setGoodIsSeasonal(boolean goodIsSeasonal) {
        this.goodIsSeasonal = goodIsSeasonal;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getGoodSales() {
        return goodSales;
    }

    public void setGoodSales(int goodSales) {
        this.goodSales = goodSales;
    }

    public Date getGoodCreateTime() {
        return goodCreateTime;
    }

    public void setGoodCreateTime(Date goodCreateTime) {
        this.goodCreateTime = goodCreateTime;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getGoodClassifyName() {
        return goodClassifyName;
    }

    public void setGoodClassifyName(String goodClassifyName) {
        this.goodClassifyName = goodClassifyName;
    }

    public String getGoodIsPutAwayName() {
        return goodIsPutAwayName;
    }

    public void setGoodIsPutAwayName(String goodIsPutAwayName) {
        this.goodIsPutAwayName = goodIsPutAwayName;
    }
}
