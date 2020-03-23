package com.sanyi.a.service;

import com.sanyi.a.domain.UserDomain;

import java.util.List;

/**
 * @工能  后台员工管理业务处理接口
 * @作者 杜目杰
 * @时间 2020/3/20
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface StaffManagementService {
    /**
     *
     * @return
     */
    int getPages();
    List<UserDomain> getPagesDate(int pages);

    int deleteUser(String name);

    int addUser(String name, String realName, String pass);
}
