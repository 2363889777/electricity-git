package com.sanyi.sn.service;


import com.sanyi.sn.domain.BackgroundMenu;

import java.util.List;

/**
 * @author 十年
 * @function 后台菜单获取服务
 * @date 2020/3/14 0014
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public interface BackgroundMenuService {
    /**
     * 根据 输入的 菜单等级 获取相应的菜单内容
     * @param level 菜单等级
     * @return 相应的菜单内容
     */
    List<BackgroundMenu> getBackgroundMenuByLevel(int level);

    /**
     * 根据 输入的 父级菜单编号 获取相应的菜单内容
     * @param parentId 父级菜单编号
     * @return 父级菜单下的子级菜单
     */
    List<BackgroundMenu> getBackgroundMenuByParent(int parentId);

    /**
     * 根据输入的 父级菜单名称 获取相应的菜单内容
     * @param parentName 父级菜单名称
     * @return 父级菜单下的子级菜单
     */
    List<BackgroundMenu> getBackgroundMenuByParent(String parentName);

    /**
     * 通过输入 菜单的名字 获取 该菜单Id
     * @param menuName 菜单的名字
     * @return 该菜单Id (-1表示没找到)
     */
    int getBackgroundMenuId(String menuName);

    /**
     * 获得菜单等级
     * @param menuId 菜单的id
     * @return 菜单等级
     */
    int getLevel(int menuId);

    /**
     * 根据菜单Id获取 父级 id
     * @param menuId  菜单Id
     * @return 父级 id
     */
    int getParentId(int menuId);

    /**
     * 根据菜单Id 获取 默认 子级菜单 id
     * @param menuId 菜单Id
     * @return 子级菜单 id
     */
    int getDefaultChildMenuId(int menuId);

    /**
     * 根据菜单Id 获取同级 菜单（属于同一个父级菜单）
     * @param menuId 菜单ID
     * @return 同级 菜单（属于同一个父级菜单）
     */
    List<BackgroundMenu> getSameLevelMenus(int menuId);
}
