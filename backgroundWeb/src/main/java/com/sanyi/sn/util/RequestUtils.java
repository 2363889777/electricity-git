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
}
