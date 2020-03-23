package com.sanyi.a.service.impl;

import com.sanyi.a.service.LoginService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/18
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public class LoginServiceImplTest {
    LoginService loginService = new LoginServiceImpl();
    String name = "1";
    String pass = "1";
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void loginCheck() {
        System.out.println(loginService.loginCheck(name,pass));  ;
    }
}