package com.sanyi.a.service;

import com.sanyi.a.domain.BackgroundConsumerDomain;
import com.sanyi.a.domain.UserDomain;

import java.util.List;

/**
 * @工能 后台人员管理接口
 * @作者 杜目杰
 * @时间 2020/3/21
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 */
public interface PersonnelManagementService {
    /**
     *  进行后台员工数据显示的分页
     * @return 页数
     */
    int getPages();

    /**
     * 得到某页对应的数据
     * @param pages 页数
     * @return 前台用户信息对象的集合
     */
    List<UserDomain> getPagesDate(int pages);

    /**
     * 根据后台用户名删除员工
     * @param name 后台用户名
     * @return 受影响的行数
     */
    int deleteUser(String name);

    /**
     * 添加员工
     * @param name 后端用户名
     * @param realName 员工真实姓名
     * @param pass 用户密码
     * @return 添加的个数
     */
    int addEmployee(String name, String realName, String pass);

    List<BackgroundConsumerDomain> inquireAll();
}
