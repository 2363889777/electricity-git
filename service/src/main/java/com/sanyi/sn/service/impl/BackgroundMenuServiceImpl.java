package com.sanyi.sn.service.impl;

import com.sanyi.sn.dao.BackGroundMenuDao;
import com.sanyi.sn.domain.BackgroundMenu;
import com.sanyi.sn.service.BackgroundMenuService;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import java.util.List;

/**
 * @author 十年
 * @function 后台菜单服务实现类
 * @date 2020/3/14 0014
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class BackgroundMenuServiceImpl implements BackgroundMenuService {
    /**
     * 后台菜单Dao代理对象
     */
    private static final BackGroundMenuDao BACK_GROUND_MENU_DAO = SqlSessionFactoryUits.getCurrentSqlSession().getMapper(BackGroundMenuDao.class);

    private BackgroundMenuServiceImpl(){};

    private static final class One{
        private final static BackgroundMenuServiceImpl BSI = new BackgroundMenuServiceImpl();
    }

    /**
     * 获取 后台菜单服务实现对象
     * @return 后台菜单服务实现对象
     */
    public static synchronized BackgroundMenuServiceImpl newInstance() { return  One.BSI;}

    public List<BackgroundMenu> getBackgroundMenuByLevel(int level) {
        return BACK_GROUND_MENU_DAO.getBackgroundMenuByLevel(level);
    }

    public List<BackgroundMenu> getBackgroundMenuByParent(int parentId) {
        return BACK_GROUND_MENU_DAO.getBackgroundMenuByParentId(parentId);
    }

    public List<BackgroundMenu> getBackgroundMenuByParent(String parentName) {
        int menuId = getBackgroundMenuId(parentName);
        if(menuId != -1){
            // 获取该菜单下的子级菜单并返回
            return BACK_GROUND_MENU_DAO.getBackgroundMenuByParentId(menuId);
        }
        return null;
    }

    public int getBackgroundMenuId(String menuName) {
        //获取菜单编号
        String realMenuName = menuName.trim();
        Object resultId = BACK_GROUND_MENU_DAO.getBackgroundMenuId(menuName);
        if(resultId != null){
            int menuId = Integer.parseInt(resultId.toString());
            return menuId;
        }
        return -1;
    }

    public int getLevel(int menuId) {
        return BACK_GROUND_MENU_DAO.getLevel(menuId);
    }

    public int getParentId(int menuId) {
        return Integer.parseInt(BACK_GROUND_MENU_DAO.getParentId(menuId).toString());
    }

    public int getDefaultChildMenuId(int menuId) {
        return Integer.parseInt(BACK_GROUND_MENU_DAO.getDefaultChildId(menuId).toString());
    }

    public List<BackgroundMenu> getSameLevelMenus(int menuId) {
        return BACK_GROUND_MENU_DAO.getSameLevelMenus(menuId);
    }
}
