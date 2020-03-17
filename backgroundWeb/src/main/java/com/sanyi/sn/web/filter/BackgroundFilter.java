package com.sanyi.sn.web.filter;

import com.sanyi.sn.domain.BackgroundMenu;
import com.sanyi.sn.service.BackgroundMenuService;
import com.sanyi.sn.service.impl.BackgroundMenuServiceImpl;
import com.sanyi.sn.util.RequestUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * @author 十年
 * @function 后台菜单数据过滤器
 * @date 2020/3/15 0015
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebFilter("/sn/back/*")
public class BackgroundFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("动态菜单数据更新");
        setActive(request, response);
        //放行
        chain.doFilter(request,response);
//        //关闭连接
//        SqlSessionFactoryUits.closeCurrentSession();
    }

    public void setActive(ServletRequest request, ServletResponse response){
        //强转类型
        HttpServletRequest req = (HttpServletRequest)request;
        //1. 根据获取二级菜单
            //1 先获取请求菜单编号
        int menuId = RequestUtils.getRequestBackgroundMenuId(req);
        BackgroundMenuService backgroundMenuService = BackgroundMenuServiceImpl.newInstance();
        if(menuId == -1){
            List<BackgroundMenu> twoLevelMenus = backgroundMenuService.getBackgroundMenuByParent(menuId);
            //设置进req中
            request.setAttribute("twoLevelMenus",twoLevelMenus);
        }else {
            //判断点击的是一级菜单还是二级菜单
            int menuLevel = backgroundMenuService.getLevel(menuId);
            if(menuLevel == 1){
                List<BackgroundMenu> twoLevelMenus = backgroundMenuService.getBackgroundMenuByParent(menuId);
                //设置进req中
                request.setAttribute("twoLevelMenus",twoLevelMenus);
            }else{
                List<BackgroundMenu> twoLevelMenus = backgroundMenuService.getSameLevelMenus(menuId);
                //设置进req中
                request.setAttribute("twoLevelMenus",twoLevelMenus);
            }
        }
        //2. 设置激活
        //2.1 如果没有菜单id,激活首页,二级菜单不激活
        if(menuId == -1){
            request.setAttribute("oneLevelActive",1);
            request.setAttribute("towLevelActive",-1);
        }else{
            //判断点击的是一级菜单还是二级菜单
            int menuLevel = backgroundMenuService.getLevel(menuId);
            int childMenuId = -1;
            //如果是一级 激活该菜单 和 二级菜单的第一个
            if(menuLevel == 1){
                request.setAttribute("oneLevelActive",menuId);
                childMenuId = backgroundMenuService.getDefaultChildMenuId(menuId);
                request.setAttribute("towLevelActive",childMenuId);
            }else{
                //如果是二级菜单 激活其父级菜单 和 该菜单
                request.setAttribute("oneLevelActive",backgroundMenuService.getParentId(menuId));
                request.setAttribute("towLevelActive",menuId);
            }
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
