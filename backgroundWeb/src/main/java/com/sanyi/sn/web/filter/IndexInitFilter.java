package com.sanyi.sn.web.filter;


import com.sanyi.sn.service.BackgroundMenuService;
import com.sanyi.sn.service.impl.BackgroundMenuServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * @author 十年
 * @function 登录首页初始化 过滤器 加载菜单信息
 * @date 2020/3/15 0015
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebFilter("/sn/back/index")
public class IndexInitFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行菜单数据初始化");
        List backgroundMenus = (List)((HttpServletRequest)request).getSession().getAttribute("oneLevelMenu");
        if(backgroundMenus == null ){
            BackgroundMenuService backgroundMenuService = BackgroundMenuServiceImpl.newInstance();
            ((HttpServletRequest)request).getSession().setAttribute("oneLevelMenu",backgroundMenuService.getBackgroundMenuByLevel(1));
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
