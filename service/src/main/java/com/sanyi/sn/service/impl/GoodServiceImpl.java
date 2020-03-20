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

    private GoodServiceImpl(){}
    public static GoodServiceImpl newObj(){return new GoodServiceImpl();}

    public boolean insertGoodMessage(int goodClassifyId, int isPutAway, String goodName, double goodPrice, int goodSales, Map<String,Map<Integer, Integer>> colorSizeAndCount, String titleImgName, List<String> showImgNames, List<String> goodInformationImgNames) {
        //添加商品简单信息
        // 才创建时 销量为 0
        goodSales = 0;
        boolean isAddBaseSuccess =
                GOOD_DAO.insertGoodBaseMessage(goodClassifyId,isPutAway,goodName,goodPrice,goodSales) == 1?true:false;
        if(!isAddBaseSuccess){SqlSessionFactoryUits.rollback(); return false;}
        //添加商品详细规格信息

        //添加商品图片
        return false;
    }
}
