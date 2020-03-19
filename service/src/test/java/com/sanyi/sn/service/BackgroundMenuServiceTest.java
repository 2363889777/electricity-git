package com.sanyi.sn.service;

import com.sanyi.sn.service.impl.BackgroundMenuServiceImpl;
import org.junit.Before;
import org.junit.Test;

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

    /**
     * 测试  backgroundMenuService.getBackgroundMenuByLevel(1)
     */
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

    @Test
    public void getMenuLevel() {
        System.out.println(backgroundMenuService.getBackgroundMenuByLevel(1));
    }
}