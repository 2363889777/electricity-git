package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @工能 衣服商品尺码(M.L.XL,2XL)表的实体类
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class GoodSizeDomain {
    /**
     * 衣服尺码编号
     */
    @ColName("pk_good_size_id")
    private int pkGoodSizeId;
    /**
     * 衣服尺码名称(M  L  XL 2XL)
     */
    @ColName("good_size_name")
    private String goodSizeName;
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
     * 得到衣服尺寸编码
     * @return 衣服尺寸编码
     */
    public int getPkGoodSizeId() {
        return pkGoodSizeId;
    }

    /**
     * 设置衣服尺寸编码
     * @param pkGoodSizeId 衣服尺寸编码
     */
    public void setPkGoodSizeId(int pkGoodSizeId) {
        this.pkGoodSizeId = pkGoodSizeId;
    }

    /**
     *  得到衣服尺寸名称
     * @return 衣服尺寸名称
     */
    public String getGoodSizeName() {
        return goodSizeName;
    }

    /**
     * 设置衣服尺寸名称
     * @param goodSizeName 衣服尺寸名称
     */
    public void setGoodSizeName(String goodSizeName) {
        this.goodSizeName = goodSizeName;
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
