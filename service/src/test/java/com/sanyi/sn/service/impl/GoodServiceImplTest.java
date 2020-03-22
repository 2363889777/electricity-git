package com.sanyi.sn.service.impl;

import com.sanyi.sn.service.GoodService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * @author 十年
 * @function
 * @date 2020/3/21 0021
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class GoodServiceImplTest {
    GoodService goodService;
    @Before
    public void setUp() throws Exception {
        goodService = GoodServiceImpl.newObj();
    }

    @Test
    public void setGoodPutAway() {
        goodService.setGoodPutAway(1);
//        SqlSessionFactoryUits.commit();
    }

    @Test
    public void setGoodNotPutAway() {
        goodService.setGoodNotPutAway(1);
        SqlSessionFactoryUits.commit();
    }

    @Test
    public void addGood() {
        Map<Integer, Integer> a = new HashMap<Integer, Integer>();
        a.put(1,10);
        a.put(2,20);
        Map<String, Map<Integer, Integer>> b = new HashMap<String, Map<Integer, Integer>>();
        b.put("红色",a);
        List<String> imgNames = new ArrayList<String>();
        imgNames.add("test.jpg");
        goodService.insertGoodMessage(2, 1, "仙女裙", 12.1,
                0, b, "title.jpg", imgNames, imgNames);
        SqlSessionFactoryUits.commit();
    }
}