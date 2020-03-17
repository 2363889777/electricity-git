package com.sanyi.sn.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author 十年
 * @function 全局过滤器 进行编码 设置 关闭连接
 * @date 2020/3/14 0014
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */

@WebFilter("/sn/*")
public class AllFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("设置字符集");
        //设置字符集
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //放开请求
            chain.doFilter(request,response);
//        //关闭连接
//        SqlSessionFactoryUits.closeCurrentSession();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
