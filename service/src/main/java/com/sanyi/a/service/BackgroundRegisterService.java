package com.sanyi.a.service;

/**
 * @工能
 * @作者 杜目杰
 * @时间 2020/3/20
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface BackgroundRegisterService {
    /**
     * 后端注册接口
     * @param name 后台用户名
     * @param realName 员工真实姓名
     * @param pass 用户密码
     * @return 注册员工的个数
     */
    int registerByNameAndPass(String name, String realName, String pass);



}
