package com.sanyi.sn.service.impl;

import com.sanyi.sn.dao.GoodDao;
import com.sanyi.sn.service.GoodService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;
import java.util.Map;

/**
 * @author 十年
 * @function 商品服务实现类
 * @date 2020/3/20 0020
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class GoodServiceImpl implements GoodService {

    private final GoodDao GOOD_DAO = SqlSessionFactoryUits.getCurrentSqlSession().getMapper(GoodDao.class);

    private GoodServiceImpl() {
    }

    public static GoodServiceImpl newObj() {
        return new GoodServiceImpl();
    }

    public boolean insertGoodMessage(int goodClassifyId, int isPutAway, String goodName, double goodPrice, int goodSales, Map<String, Map<Integer, Integer>> colorSizeAndCount, String titleImgName, List<String> showImgNames, List<String> goodInformationImgNames) {
        //1. 添加商品简单信息
        // 才创建时 销量为 0
        goodSales = 0;
        boolean isAddBaseSuccess =
                GOOD_DAO.insertGoodBaseMessage(goodClassifyId, isPutAway, goodName, goodPrice, goodSales) == 1 ? true : false;
        //  添加失败
        if (!isAddBaseSuccess) {
            SqlSessionFactoryUits.rollback();
            return false;
        }
        int goodId = Integer.parseInt(GOOD_DAO.getRecentlyId().toString());
        //2. 添加商品详细规格信息
        isAddBaseSuccess = isAddBaseSuccess || insertSku(colorSizeAndCount, goodId, goodPrice, goodSales, isAddBaseSuccess);
        if (!isAddBaseSuccess) {
            return false;
        }
        //3. 添加商品图片
        isAddBaseSuccess = isAddBaseSuccess || insertImg(goodId, titleImgName, showImgNames, goodInformationImgNames, isAddBaseSuccess);
        //成功
        if (isAddBaseSuccess) {
            SqlSessionFactoryUits.commit();
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据输入的图片类型名称 返回图片对应的类型ID
     * @param goodImgTypeName 图片类型名称 商品标题链接图片'),('商品展示内容图片'),('商品详细信息图片');
     * @return 图片对应的类型ID
     */
    private int getGoodImgTypeID(String goodImgTypeName){
        return  Integer.parseInt(GOOD_DAO.getGoodImgTypeId(goodImgTypeName).toString());
    }

    /**
     * 添加商品图片
     * @param goodId 商品Id
     * @param titleImgName 链接图片名称
     * @param showImgNames 展示图片名称
     * @param goodInformationImgNames 商品详细信息名称
     * @param isAddBaseSuccess 上一个环节是否添加成功
     * @return 成功 返回 true
     */
    private boolean insertImg(int goodId, String titleImgName, List<String> showImgNames, List<String> goodInformationImgNames, boolean isAddBaseSuccess) {
        if (!isAddBaseSuccess) {
            return false;
        }
        //3.1 添加链接图片
        isAddBaseSuccess = isAddBaseSuccess || GOOD_DAO.insertGoodImg(goodId, getGoodImgTypeID("商品标题链接图片"), titleImgName) == 1;
        //3.2 添加显示图片
        for (String imgName : showImgNames
        ) {
            isAddBaseSuccess = isAddBaseSuccess || GOOD_DAO.insertGoodImg(goodId, getGoodImgTypeID("商品展示内容图片"), imgName) == 1;
            //  添加失败
            if (!isAddBaseSuccess) {
                SqlSessionFactoryUits.rollback();
                return false;
            }
        }
        //3.3 添加详细信息图片
        for (String imgName : goodInformationImgNames
        ) {
            isAddBaseSuccess = isAddBaseSuccess || GOOD_DAO.insertGoodImg(goodId, getGoodImgTypeID("商品详细信息图片"), imgName) == 1;
            //  添加失败
            if (!isAddBaseSuccess) {
                SqlSessionFactoryUits.rollback();
                return false;
            }
        }
        return isAddBaseSuccess;
    }

    /**
     * 添加商品详细规格信息
     *
     * @param colorSizeAndCount 颜色 和 （样式 和库存的对应）
     * @param goodId            商品ID
     * @param goodPrice         商品价格
     * @param goodSales         商品销量
     * @param isAddBaseSuccess  上一个环节是否插入成功
     * @return 成功返回 true
     */
    private boolean insertSku(Map<String, Map<Integer, Integer>> colorSizeAndCount, int goodId, double goodPrice, int goodSales, boolean isAddBaseSuccess) {
        if (!isAddBaseSuccess) {
            return false;
        }
        //遍历添加 商品sku信息
        //  2.1遍历颜色
        for (Map.Entry<String, Map<Integer, Integer>> color : colorSizeAndCount.entrySet()
        ) {
            String colorName = color.getKey();
            //2.2 遍历尺寸
            for (Map.Entry<Integer, Integer> sizeAndCount : color.getValue().entrySet()
            ) {
//                添加
                isAddBaseSuccess = isAddBaseSuccess || GOOD_DAO.insertGoodSku(goodId, colorName, sizeAndCount.getKey(), goodPrice, sizeAndCount.getValue(), goodSales) == 1;
                //  添加失败
                if (!isAddBaseSuccess) {
                    SqlSessionFactoryUits.rollback();
                    return false;
                }
            }
        }
        return isAddBaseSuccess;
    }
}
