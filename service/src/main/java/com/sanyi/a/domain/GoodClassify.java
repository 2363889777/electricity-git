package com.sanyi.a.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @工能 商品分类表的实体类
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class GoodClassify {
    /**
     * 商品分类编号
     */
    @ColName("pk_good_classify_id")
    private int pkGoodClassifyId;
    /**
     * 商品分类名称(一级：女式上装，二级：卫衣)
     */
    @ColName("good_classify_name")
    private String goodClassifyName;
    /**
     * 上级分类编号(绑定商品分类编号)
     */
    @ColName("good_classify_parent_id")
    private int goodClassifyParentId;
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
     * 得到商品分类编号
     * @return 商品分类编号
     */
    public int getPkGoodClassifyId() {
        return pkGoodClassifyId;
    }

    /**
     * 设置商品分类编号
     * @param pkGoodClassifyId 商品分类编号
     */
    public void setPkGoodClassifyId(int pkGoodClassifyId) {
        this.pkGoodClassifyId = pkGoodClassifyId;
    }

    /**
     * 得到商品分类名称
     * @return 商品分类名称
     */
    public String getGoodClassifyName() {
        return goodClassifyName;
    }

    /**
     * 设置商品分类编号
     * @param goodClassifyName 商品分类编号
     */
    public void setGoodClassifyName(String goodClassifyName) {
        this.goodClassifyName = goodClassifyName;
    }

    /**
     * 得到上级分类编号
     * @return 上级分类编号
     */
    public int getGoodClassifyParentId() {
        return goodClassifyParentId;
    }

    /**
     * 设置上级分类编号
     * @param goodClassifyParentId 上级分类编号
     */
    public void setGoodClassifyParentId(int goodClassifyParentId) {
        this.goodClassifyParentId = goodClassifyParentId;
    }

    /**
     * 得到更新时间
     * @return 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置表的更新时间
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
