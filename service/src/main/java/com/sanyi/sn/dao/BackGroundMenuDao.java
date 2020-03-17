package com.sanyi.sn.dao;

import com.sanyi.sn.domain.BackgroundMenu;
import com.sanyi.sn.domain.BackgroundMenuLevel;
import com.xuetang9.jdbc.frame.annotation.Param;
import com.xuetang9.jdbc.frame.annotation.SQL;
import com.xuetang9.jdbc.frame.annotation.SqlType;

import java.util.List;

/**
 * @author 十年
 * @function
 * @date 2020/3/13 0013
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public interface BackGroundMenuDao {
    /**
     * 获取所有的菜单等级
     * @return 所有的菜单等级
     */
    @SQL(value = "select * from background_menu_level;",resultType = BackgroundMenuLevel.class,type = SqlType.SELECT)
    List<BackgroundMenuLevel> getBackGroundLevel();

    /**
     * 根据菜单级别 查询菜单
     * @param level 菜单级别
     * @return 菜单
     */
    @SQL(value = "select pk_background_menu_id,pk_level_id_bg,background_menu_name,background_url,background_menu_font_icon,parent_id_background_menu,create_time,update_time\n" +
            "from background_menu where pk_level_id_bg = #{menu_level};",resultType = BackgroundMenu.class,type = SqlType.SELECT)
    List<BackgroundMenu> getBackgroundMenuByLevel(@Param("menu_level") int level);

    /**
     * 根据父级菜单编号 获取 其子级菜单
     * @param parentId  父级菜单编号
     * @return 子级菜单
     */
    @SQL(value = "select pk_background_menu_id,pk_level_id_bg,background_menu_name,background_url,background_menu_font_icon,parent_id_background_menu,create_time,update_time\n" +
            "from background_menu where parent_id_background_menu = #{parent_id};",resultType = BackgroundMenu.class,type = SqlType.SELECT)
    List<BackgroundMenu> getBackgroundMenuByParentId(@Param("parent_id") int parentId);

    /**
     * 根据菜单名字获取 菜单的编号
     * @param menuName 菜单名字
     * @return 菜单的编号
     */
    @SQL(value = "select pk_background_menu_id from background_menu where background_menu_name like #{menu_name}"
    ,resultType=Long.class,type = SqlType.SELECT)
    Long getBackgroundMenuId(@Param("menu_name") String menuName);

    /**
     * 根据 菜单id  获取菜单的等级
     * @param menuId 菜单id
     * @return 菜单的等级
     */
    @SQL(value = "select pk_level_id_bg from background_menu where pk_background_menu_id = #{id};"
    ,resultType = int.class,type = SqlType.SELECT)
    int getLevel(@Param("id") int menuId);

    /**
     * 根据 菜单id 获取 父级菜单id
     * @param menuId 菜单id
     * @return  父级菜单id
     */
    @SQL(value = "select parent_id_background_menu from background_menu where pk_background_menu_id = #{id};"
    ,resultType = Long.class,type = SqlType.SELECT)
    Long getParentId(@Param("id") int menuId);

    /**
     * 根据 菜单id 获取 默认子级菜单id
     * @param menuId 菜单id
     * @return 默认子级菜单id
     */
    @SQL(value = "select pk_background_menu_id  from background_menu where parent_id_background_menu = #{id} limit 1;"
    ,resultType = Long.class,type = SqlType.SELECT)
    Long getDefaultChildId(@Param("id") int menuId);

    /**
     * 根据 菜单id 获取 同级子级菜单
     * @param menuId 菜单id
     * @return 同级子级菜单
     */
    @SQL(value = "select pk_background_menu_id,pk_level_id_bg,background_menu_name,background_url,background_menu_font_icon,parent_id_background_menu,create_time,update_time\n" +
            "from background_menu where parent_id_background_menu = (select parent_id_background_menu from background_menu where pk_background_menu_id = #{id});"
    ,resultType = BackgroundMenu.class ,type = SqlType.SELECT)
    List<BackgroundMenu> getSameLevelMenus(@Param("id") int menuId);
}
