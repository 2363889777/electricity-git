package com.sanyi.a.service;

import com.sanyi.a.domain.UserDomain;

import java.util.List;

/**
 * @工能 登录页面业务处理接口
 * @作者 杜目杰
 * @时间 2020/3/18
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface LoginService {
    /**
     * 登录验证
     * @param name
     * @param password
     * @return 登录验证的结果
     */
    boolean loginCheck(String name, String password);
    /**
     *  进行用户数据显示的分页
     * @return 页数
     */
    int getPages();

    /**
     * 得到某页对应的数据
     * @param pages 页数
     * @return 前台用户信息对象的集合
     */
    List<UserDomain> getPagesDate(int pages);
}
