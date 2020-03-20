package com.sanyi.sn.dao;

import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 十年
 * @function
 * @date 2020/3/20 0020
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class GoodDaoTest {
    GoodDao goodDao;
    @Before
    public void setUp() throws Exception {
        goodDao = SqlSessionFactoryUits.getCurrentSqlSession().getMapper(GoodDao.class);
    }

    @After
    public void tearDown() throws Exception {
        SqlSessionFactoryUits.closeCurrentSession();
    }

    @Test
    public void insertGoodClassify() {
        System.out.println(goodDao.insertGoodClassify("男装",0));
        SqlSessionFactoryUits.commit();
    }

    @Test
    public void insertGoodMarketing() {
        System.out.println(goodDao.insertGoodMarketing(1,1));
        System.out.println(Integer.parseInt(goodDao.getRecentlyId().toString()));
        SqlSessionFactoryUits.commit();
    }

    @Test
    public void deleteGoodMarketing() {
        System.out.println(goodDao.deleteGoodMarketing(1,2));
    }

    @Test
    public void insertGoodBaseMessage() {
        System.out.println(goodDao.insertGoodBaseMessage(1,1,"测试",1999.50,0));
        SqlSessionFactoryUits.commit();
    }

    @Test
    public void insertGoodSize() {
        System.out.println(goodDao.insertGoodSize("S"));
    }

    @Test
    public void insertGoodSku() {
        System.out.println(goodDao.insertGoodSku(1,"黑色",5,1505.5,66,0));
    }

    @Test
    public void insertGoodImg() {
        System.out.println(goodDao.insertGoodImg(1,1,"55"));
    }

    @Test
    public void getSimpleGoodVos() {
        System.out.println(goodDao.getSimpleGoodVos(0,6));
    }

    @Test
    public void getGoodImgTypeId() {
        System.out.println(goodDao.getGoodImgTypeId("商品标题链接图片"));
        System.out.println(goodDao.getGoodImgTypeId("商品展示内容图片"));
        System.out.println(goodDao.getGoodImgTypeId("商品详细信息图片"));
    }
}