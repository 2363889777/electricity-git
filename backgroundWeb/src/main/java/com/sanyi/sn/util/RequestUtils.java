package com.sanyi.sn.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 十年
 * @function 处理请求工具类
 * @date 2020/3/15 0015
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public final class RequestUtils {
    /**
     * 如果用请求 获取其 记录的ID值 没有 返回-1
     * @param request 请求
     * @return 有 记录的ID值 没有 返回-1
     */
    public static int getRequestBackgroundMenuId(HttpServletRequest request){
        return StringUtilsSN.isNullOrWhiteSpace(request.getParameter("menuId"))?-1:
                Integer.parseInt(request.getParameter("menuId"))==1?-1:Integer.parseInt(request.getParameter("menuId"));
    }

    /**
     * 获取字符串 放置为空 空指针异常
     * @param request 请求对象
     * @param key 请求的键名
     * @return 空字符串 或者 请求的值
     */
    public static String getParameter(HttpServletRequest request,String key){
        return request.getParameter(key) == null ? "" : request.getParameter(key);
    }

    /**
     * 获取数字 自动设置了默认值
     * @param request 请求
     * @param key 键
     * @return
     */
    public static String getParameterNumber(HttpServletRequest request,String key){
        return request.getParameter(key) == null || request.getParameter(key) == "" ? "-1" : request.getParameter(key);
    }

    /**
     * 获取请求值，如果为空，就返回默认值
     * @param request 请求
     * @param key 键
     * @param defaultContent 默认值
     * @return 不为空 返回值 为空 返回默认值
     */
    public static String getParameter(HttpServletRequest request,String key,String defaultContent){
        return request.getParameter(key)==null?defaultContent:request.getParameter(key).trim().length()==0?defaultContent:request.getParameter(key);
    }
}
