package com.sanyi.sn.service.impl;

import com.sanyi.sn.dao.GoodDao;
import com.sanyi.sn.domain.good.GoodSize;
import com.sanyi.sn.service.GoodService;
import com.sanyi.sn.vo.good.GoodClassifyVo;
import com.sanyi.sn.vo.good.GoodVo;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.*;

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

    public int getGoodCount() {
        if(GOOD_DAO.getGoodCount()==null){
            return 0;
        }
        return Integer.parseInt(GOOD_DAO.getGoodCount().toString());
    }

    private GoodServiceImpl() {
    }

    public static GoodServiceImpl newObj() {
        return new GoodServiceImpl();
    }

    public boolean addGoodClassify(String classifyName, int parentId) {
        return GOOD_DAO.addGoodClassify(classifyName, parentId) == 1;
    }

    public boolean insertGoodMessage(int goodClassifyId, boolean isPutAway, String goodName, double goodPrice, int goodSales, String goodColor, int goodSize, int goodCount, String titleImgName, List<String> showImgNames, List<String> goodInformationImgNames) {
        //获取上架/下架的id
        int isPutAwayId = -1;
        if(isPutAway){
            //上架
            int marketingId = getIsPutAwayId("上架");
            if (marketingId == -1) {
                throw new RuntimeException("上架没找到");
            } else {
                isPutAwayId = marketingId;
            }
        }else {
            //下架
            int marketingId = getIsPutAwayId("下架");
            if (marketingId == -1) {
                throw new RuntimeException("下架没找到");
            } else {
                isPutAwayId = marketingId;
            }
        }
        return  insertGoodMessage(goodClassifyId,isPutAwayId,goodName,goodPrice,goodSales,goodColor,goodSize,goodCount,titleImgName,showImgNames,goodInformationImgNames);
    }

    public int getGoodId(String goodName) {
        Long goodId = GOOD_DAO.getGoodId(goodName);
        if(goodId== null){
            return -1;
        }
        return Integer.parseInt(goodId.toString());
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
        isAddBaseSuccess = isAddBaseSuccess && insertSku(colorSizeAndCount, goodId, goodPrice, goodSales, isAddBaseSuccess);
        if (!isAddBaseSuccess) {
            return false;
        }
        //3. 添加商品图片
        isAddBaseSuccess = isAddBaseSuccess && insertImg(goodId, titleImgName, showImgNames, goodInformationImgNames, isAddBaseSuccess);
        //成功
        if (isAddBaseSuccess) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insertGoodMessage(int goodClassifyId, int isPutAway, String goodName, double goodPrice, int goodSales, String goodColor, int goodSize, int goodCount, String titleImgName, List<String> showImgNames, List<String> goodInformationImgNames) {
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
        isAddBaseSuccess = isAddBaseSuccess && insertSku(goodColor,goodSize,goodCount, goodId, goodPrice, goodSales, isAddBaseSuccess);
        if (!isAddBaseSuccess) {
            return false;
        }
        //3. 添加商品图片
        isAddBaseSuccess = isAddBaseSuccess && insertImg(goodId, titleImgName, showImgNames, goodInformationImgNames, isAddBaseSuccess);
        //成功
        if (isAddBaseSuccess) {
            return true;
        } else {
            return false;
        }
    }

    public List<GoodSize> getGoodSize(int startNum, int endNum) {
        return GOOD_DAO.getGoodSize(startNum,endNum);
    }

    /**
     * 根据输入的图片类型名称 返回图片对应的类型ID
     *
     * @param goodImgTypeName 图片类型名称 商品标题链接图片'),('商品展示内容图片'),('商品详细信息图片');
     * @return 图片对应的类型ID
     */
    private int getGoodImgTypeID(String goodImgTypeName) {
        return Integer.parseInt(GOOD_DAO.getGoodImgTypeId(goodImgTypeName).toString());
    }

    /**
     * 添加商品图片
     *
     * @param goodId                  商品Id
     * @param titleImgName            链接图片名称
     * @param showImgNames            展示图片名称
     * @param goodInformationImgNames 商品详细信息名称
     * @param isAddBaseSuccess        上一个环节是否添加成功
     * @return 成功 返回 true
     */
    private boolean insertImg(int goodId, String titleImgName, List<String> showImgNames, List<String> goodInformationImgNames, boolean isAddBaseSuccess) {
        if (!isAddBaseSuccess) {
            return false;
        }
        //3.1 添加链接图片
        isAddBaseSuccess = isAddBaseSuccess && GOOD_DAO.insertGoodImg(goodId, getGoodImgTypeID("商品标题链接图片"), titleImgName) == 1;
        //3.2 添加显示图片
        for (String imgName : showImgNames
        ) {
            isAddBaseSuccess = isAddBaseSuccess && GOOD_DAO.insertGoodImg(goodId, getGoodImgTypeID("商品展示内容图片"), imgName) == 1;
            //  添加失败
            if (!isAddBaseSuccess) {
                SqlSessionFactoryUits.rollback();
                return false;
            }
        }
        //3.3 添加详细信息图片
        for (String imgName : goodInformationImgNames
        ) {
            isAddBaseSuccess = isAddBaseSuccess && GOOD_DAO.insertGoodImg(goodId, getGoodImgTypeID("商品详细信息图片"), imgName) == 1;
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
     * @param goodColor 颜色
     * @param goodSizeId 尺码Id
     * @param goodCount 库存
     * @param goodId    商品ID
     * @param goodPrice  商品价格
     * @param goodSales  商品销量
     * @param isAddBaseSuccess 上一个环节是否插入成功
     * @return
     */
    private boolean insertSku(String goodColor, int goodSizeId, int goodCount, int goodId, double goodPrice, int goodSales, boolean isAddBaseSuccess) {
        if (!isAddBaseSuccess) {
            return false;
        }
        //遍历添加 商品sku信息
        //  2.添加
        isAddBaseSuccess = isAddBaseSuccess && GOOD_DAO.insertGoodSku(goodId, goodColor, goodSizeId, goodPrice, goodCount, goodSales) == 1;
        //  添加失败
        if (!isAddBaseSuccess) {
            SqlSessionFactoryUits.rollback();
            return false;
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
                isAddBaseSuccess = isAddBaseSuccess && GOOD_DAO.insertGoodSku(goodId, colorName, sizeAndCount.getKey(), goodPrice, sizeAndCount.getValue(), goodSales) == 1;
                //  添加失败
                if (!isAddBaseSuccess) {
                    SqlSessionFactoryUits.rollback();
                    return false;
                }
            }
        }
        return isAddBaseSuccess;
    }

    public List<GoodVo> getGoods(int startNum, int endNum) {
        List<GoodVo> goodVoList = GOOD_DAO.getSimpleGoodVos(startNum, endNum);
        if (goodVoList == null || goodVoList.size() == 0) {
            return null;
        } else {
            for (GoodVo good : goodVoList
            ) {
                addGoodVoMarketingState(good);
            }
            return goodVoList;
        }
    }

    /**
     * 根据传入的商品信息 更新 该商品的营销状态 热销，推荐，应季
     *
     * @param goodVo 商品信息
     */
    private void addGoodVoMarketingState(GoodVo goodVo) {
        // 获取商品id
        int goodId = goodVo.getGoodId();
        // 获取该商品的营销状态GOOD_DAO.getGoodMarketingName(goodId)
        String goodMarketingNames = GOOD_DAO.getGoodMarketingName(goodId);
        if (goodMarketingNames == null || goodMarketingNames.length() == 0) {
            return;
        } else {
            List<String> goodMarketingName = Arrays.asList(goodMarketingNames.split(","));
            if (goodMarketingName == null || goodMarketingName.size() == 0) {
                return;
            }
            // 设置相关信息
            for (String stateName : goodMarketingName
            ) {
                if (stateName.equals("热销")) {
                    goodVo.setGoodIsHot(true);
                }
                if (stateName.equals("推荐")) {
                    goodVo.setGoodIsRecommend(true);
                }
                if (stateName.equals("应季")) {
                    goodVo.setGoodIsSeasonal(true);
                }
            }
        }

    }

    public boolean setGoodPutAway(int goodId) {
        int marketingId = getIsPutAwayId("上架");
        if (marketingId == -1) {
            throw new RuntimeException("上架没找到");
        } else {
            return GOOD_DAO.updateGoodIsPutAway(goodId, marketingId) == 1;
        }
    }

    public boolean setGoodNotPutAway(int goodId) {
        int marketingId = getIsPutAwayId("下架");
        if (marketingId == -1) {
            throw new RuntimeException("下架没找到");
        } else {
            return GOOD_DAO.updateGoodIsPutAway(goodId, marketingId) == 1;
        }
    }

    public boolean setGoodHot(int goodId) {
        int marketingId = getMarketingId("热销");
        if (marketingId == -1) {
            throw new RuntimeException("热销没找到");
        } else {
            return GOOD_DAO.insertGoodMarketing(goodId, marketingId) == 1;
        }
    }

    public boolean setGoodNotHot(int goodId) {
        int marketingId = getMarketingId("热销");
        if (marketingId == -1) {
            throw new RuntimeException("热销没找到");
        } else {
            return GOOD_DAO.deleteGoodMarketing(goodId, marketingId) == 1;
        }
    }

    public boolean setGoodRecommend(int goodId) {
        int marketingId = getMarketingId("推荐");
        if (marketingId == -1) {
            throw new RuntimeException("推荐没找到");
        } else {
            return GOOD_DAO.insertGoodMarketing(goodId, marketingId) == 1;
        }
    }

    public boolean setGoodNotRecommend(int goodId) {
        int marketingId = getMarketingId("推荐");
        if (marketingId == -1) {
            throw new RuntimeException("推荐没找到");
        } else {
            return GOOD_DAO.deleteGoodMarketing(goodId, marketingId) == 1;
        }
    }

    public boolean setGoodSeasonal(int goodId) {
        int marketingId = getMarketingId("应季");
        if (marketingId == -1) {
            throw new RuntimeException("应季没找到");
        } else {
            return GOOD_DAO.insertGoodMarketing(goodId, marketingId) == 1;
        }
    }

    public boolean setGoodNotSeasonal(int goodId) {
        int marketingId = getMarketingId("应季");
        if (marketingId == -1) {
            throw new RuntimeException("应季没找到");
        } else {
            return GOOD_DAO.deleteGoodMarketing(goodId, marketingId) == 1;
        }
    }

    /**
     * 根据营销类型名称 返回对应的 营销ID
     *
     * @param marketingName 营销类型名称
     * @return 营销ID
     */
    private int getMarketingId(String marketingName) {
        Long id = GOOD_DAO.getGoodMarketingId(marketingName);
        if (id == null) {
            return -1;
        } else {
            return Integer.parseInt(id.toString());
        }
    }

    /**
     * 根据上架 下架名称 返回相应的Id
     *
     * @param putAwayName 上架 下架名称
     * @return 相应的Id
     */
    private int getIsPutAwayId(String putAwayName) {
        Long id = GOOD_DAO.getGoodIsPutAwayId(putAwayName);
        if (id == null) {
            return -1;
        } else {
            return Integer.parseInt(id.toString());
        }
    }

    public List<GoodClassifyVo> getGoodClassifies(int startNum, int endNum) {
        return GOOD_DAO.getGoodClassifies(startNum, endNum);
    }
}
