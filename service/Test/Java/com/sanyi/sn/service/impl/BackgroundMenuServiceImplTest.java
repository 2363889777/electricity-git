package com.sanyi.sn.service.impl;

import com.sanyi.sn.service.BackgroundMenuService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/17
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class BackgroundMenuServiceImplTest {
    BackgroundMenuService backgroundMenuService;
    @Before
    public void setUp() throws Exception {
        backgroundMenuService = BackgroundMenuServiceImpl.newInstance();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newInstance() {

    }
    @Test
    public void getBackgroundMenuByLevel() {
        System.out.println(backgroundMenuService.getBackgroundMenuByLevel(1));
    }

    @Test
    public void getParentMenu() {
        System.out.println(backgroundMenuService.getParentMenu(9));
    }

    @Test
    public void getParentMenuName() {
        System.out.println(backgroundMenuService.getParentMenuName(9));
    }

    @Test
    public void getMenu() {
        System.out.println(backgroundMenuService.getMenu(1));
    }

    @Test
    public void getDefaultChildMenu() {
        System.out.println(backgroundMenuService.getDefaultChildMenu(2));
    }
}