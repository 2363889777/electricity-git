package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @工能 商品图片类型(商品链接图片，商品展示图片。。。)表的实体类
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class GoodImgTypeDomain {

    /**
     * 商品类型编号
     */
    @ColName("pk_good_type_id")
    private int pkGoodTypeId;
    /**
     * 商品图片类型名称
     */
    @ColName("good_img_type_name")
    private String goodImgTypeName;
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
     * 得到商品类型编号
     * @return  商品类型编号
     */

    public int getPkGoodTypeId() {
        return pkGoodTypeId;
    }

    /**
     * 设置商品类型编号
     * @param pkGoodTypeId 商品类型编号
     */
    public void setPkGoodTypeId(int pkGoodTypeId) {
        this.pkGoodTypeId = pkGoodTypeId;
    }

    /**
     * 的到商品图片类型名称
     * @return 商品图片类型名称
     */
    public String getGoodImgTypeName() {
        return goodImgTypeName;
    }

    /**
     * 设置商品图片类型名称
     * @param goodImgTypeName 商品图片类型名称
     */
    public void setGoodImgTypeName(String goodImgTypeName) {
        this.goodImgTypeName = goodImgTypeName;
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
     * @param updateTime 更新时间
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
