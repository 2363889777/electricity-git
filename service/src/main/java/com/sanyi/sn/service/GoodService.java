package com.sanyi.sn.service;

import com.sanyi.sn.vo.good.GoodClassifyVo;
import com.sanyi.sn.vo.good.GoodVo;

import java.util.List;
import java.util.Map;

/**
 * @author 十年
 * @function 商品服务接口
 * @date 2020/3/20 0020
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public interface GoodService {
    /**
     * 添加商品
     * @param goodClassifyId 商品分类ID
     * @param isPutAway 商品是否上架
     * @param goodName 商品名称
     * @param goodPrice 商品价格
     * @param goodSales 商品销量
     * @param colorSizeAndCount 商品颜色 对应的 商品尺寸 和 对应 商品库存
     * @param titleImgName 链接图片名称
     * @param showImgNames 商品展示图片
     * @param goodInformationImgNames 商品详细信息图片
     * @return
     */
    boolean insertGoodMessage(
            int goodClassifyId, int isPutAway, String goodName, double goodPrice, int goodSales,
            Map<String,Map<Integer, Integer>> colorSizeAndCount, String titleImgName, List<String> showImgNames, List<String> goodInformationImgNames
            );

    /**
     * 获取所有的商品数据
     * @param startNum 开始行
     * @param endNum 结束行
     * @return 获取区间内的商品数据
     */
    List<GoodVo> getGoods(int startNum,int endNum);

    /**
     * 设置商品为上架
     * @param goodId 商品ID
     * @return 成功返回true
     */
    boolean setGoodPutAway(int goodId);

    /**
     * 设置商品下架
     * @param goodId 商品ID
     * @return 成功返回true
     */
    boolean setGoodNotPutAway(int goodId);

    /**
     * 设置商品为热销
     * @param goodId 商品ID
     * @return 成功返回true
     */
    boolean setGoodHot(int goodId);

    /**
     * 取消商品热销
     * @param goodId 商品ID
     * @return 成功返回true
     */
    boolean setGoodNotHot(int goodId);

    /**
     * 设置商品为推荐
     * @param goodId 商品ID
     * @return 成功返回true
     */
    boolean setGoodRecommend(int goodId);

    /**
     * 取消商品推荐
     * @param goodId  商品ID
     * @return 成功返回true
     */
    boolean setGoodNotRecommend(int goodId);

    /**
     * 设置商品应季
     * @param goodId 商品ID
     * @return 成功返回true
     */
    boolean setGoodSeasonal(int goodId);

    /**
     * 取消商品应季
     * @param goodId 商品ID
     * @return 成功返回true
     */
    boolean setGoodNotSeasonal(int goodId);

    /**
     * 获取商品分类
     * @param startNum 开始行数
     * @param endNum 结束行数
     * @return  获取商品分类
     */
    List<GoodClassifyVo> getGoodClassifies(int startNum,int endNum);

}
