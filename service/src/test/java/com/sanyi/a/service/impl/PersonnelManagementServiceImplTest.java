package com.sanyi.a.service.impl;

import com.sanyi.a.domain.BackgroundConsumerDomain;
import com.sanyi.a.service.PersonnelManagementService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/22
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class PersonnelManagementServiceImplTest {
    PersonnelManagementService personnelManagementService = new PersonnelManagementServiceImpl();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void inquireAll() {
       List<BackgroundConsumerDomain> backgroundConsumerDomains = personnelManagementService.inquireAll();
        System.out.println(backgroundConsumerDomains.get(0).getCreateTime() ); ;


        for (BackgroundConsumerDomain backgroundConsumerDomain :backgroundConsumerDomains
             ) {
            System.out.println(backgroundConsumerDomain);
        }
    }
}