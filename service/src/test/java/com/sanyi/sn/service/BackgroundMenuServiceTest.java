package com.sanyi.sn.service;

import com.sanyi.sn.service.impl.BackgroundMenuServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 十年
 * @function
 * @date 2020/3/17 0017
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class BackgroundMenuServiceTest {
    BackgroundMenuService backgroundMenuService;
    @Before
    public void setUp() throws Exception {
        backgroundMenuService = BackgroundMenuServiceImpl.newInstance();
    }

    @Test
    public void getBackgroundMenuByLevel() {
        System.out.println(backgroundMenuService.getBackgroundMenuByLevel(1));
    }

    @Test
    public void getBackgroundMenuByParent() {
    }

    @Test
    public void testGetBackgroundMenuByParent() {
    }

    @Test
    public void getBackgroundMenuId() {
    }

    @Test
    public void getLevel() {
    }

    @Test
    public void getParentId() {
    }

    @Test
    public void getDefaultChildMenuId() {
    }

    @Test
    public void getSameLevelMenus() {
    }
}