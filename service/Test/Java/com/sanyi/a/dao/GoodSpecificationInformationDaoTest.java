package com.sanyi.a.dao;

import com.sanyi.a.domain.GoodClassifyDomain;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class GoodSpecificationInformationDaoTest {
        GoodClassifyDao goodClassifyDomain = SqlSessionFactoryUits.getCurrentMapper(GoodClassifyDao.class);
        List<GoodClassifyDomain>  goodClassifyDomains ;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void selectAll() {

    }
}