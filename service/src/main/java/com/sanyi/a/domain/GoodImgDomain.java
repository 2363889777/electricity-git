package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @工能 商品图片表的实体类
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class GoodImgDomain {

    /**
     * 商品图片编号
     */
    @ColName("pk_good_img_id")
    private int pkGoodImgId;
    /**
     * 商品编号
     */
    @ColName("pk_good_id")
    private int pkGoodId;
    /**
     * 商品类型编号
     */
    @ColName("pk_good_type_id")
    private int pkGoodTypeId;
    /**
     * 图片名称,用来存放文件名（xx.png...）
     */
    @ColName("good_img_name")
    private String goodImgName;
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
     * 得到商品编号图片
     * @return 商品编号图片
     */

    public int getPkGoodImgId() {
        return pkGoodImgId;
    }

    /**
     * 设置商品编号图片
     * @param pkGoodImgId 商品编号图片
     */
    public void setPkGoodImgId(int pkGoodImgId) {
        this.pkGoodImgId = pkGoodImgId;
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
     * 得到商品类型编号
     * @return 商品类型编号
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
     * 得到图片名称
     * @return 图片名称
     */
    public String getGoodImgName() {
        return goodImgName;
    }

    /**
     * 设置图片名称
     * @param goodImgName 图片名称
     */
    public void setGoodImgName(String goodImgName) {
        this.goodImgName = goodImgName;
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
     *  设置创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
