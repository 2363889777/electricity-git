<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/14 0014
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
    <%@include file="/webapp/sn/layout/styles.jsp" %>
    <style>
        /**** 左侧一级菜单条
 *******************************************/
        #left_nav_sn .nav-link.active {
            background: #007bff;
            color: white;
        }
        #left_nav_sn .nav-link{
            color: #bdbdc0;
            font-size: 14px;
        }
        #left_nav_sn .nav-link:hover{
            color: #f5f5f5;
        }
        #left_nav_sn .nav-item:hover{
            /*位置设置/测试边框*/
            /*显示和宽高设置*/
            /*样式设置*/
            border-left: 3px solid #007bff;
            /*盒子模型的属性*/
            /*文本字体*/
            /*动画特效*/
        }
        /**** 左侧二级菜单条
 *******************************************/
        #left_second_nav_sn .nav-link{
            color: black;
            font-size: 13px;
        }
        #left_second_nav_sn .nav-link.active{
            background: #f5f5f5;
        }
        #left_second_nav_sn .nav-link:hover{
            background: #f5f5f5;
        }
        /****菜单的消失
 *******************************************/
        #left_nav_sn{
            overflow: hidden;
            transition: all 2s linear 0s;
        }

        .show-sn{
            width: 100%;
        }

        .disappear-sn{
            width: 0%;
        }

        /****头部菜单 控制按钮
 *******************************************/
        #header_nav_sn div:first-child a{
            color: black;
            font-weight: initial;
        }

        #header_nav_sn div:first-child a:hover{
            color: #f5f5f5;
        }

    </style>
</head>
<body>
<div class="container-fluid h-100">
    <div class="row h-100">
        <%--左侧导航条--%>
        <div class="col-1 p-0 h-100">
            <div id="left_nav_sn" class="collapse show">
                <ul class="nav navbar-dark bg-dark flex-column h-100 shadow-lg">
                    <a class="navbar-brand" href="#">Navbar</a>
                    <c:forEach items="${sessionScope.oneLevelMenu}" var="menu">
                        <li class="nav-item m-1">
                            <c:choose>
                                <c:when test="${menu.id == requestScope.oneLevelActive}">
                                    <a class="nav-link active"
                                       href="${pageContext.request.contextPath}/sn/back/other?menuId=${menu.id}"><i class="fa ${menu.icon}"></i>  ${menu.name}</a>
                                </c:when>
                                <c:otherwise>
                                    <a class="nav-link"
                                       href="${pageContext.request.contextPath}/sn/back/other?menuId=${menu.id}"><i class="fa ${menu.icon}"></i>  ${menu.name}</a>
                                </c:otherwise>
                            </c:choose>

                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>

        <%--右侧内容--%>
        <div class="col">
            <%--头部通用条--%>
            <div class="row bg-white justify-content-between shadow-lg position-relative" style="height: 8%" id="header_nav_sn">
                <div class="col-1">
                    <div class="row align-items-center h-100 justify-content-start">
                        <div class="col-2">
                            <a href="#left_nav_sn"><i class="fa fa-outdent"></i></a>
                        </div>
                        <div class="col-2">
                            <a href="#"><i class="fa fa-refresh"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-3">
                    <div class="row h-100 justify-content-end align-items-center">
                        <div class="col-6 text-center text-justify"><span class="align-middle">欢迎你，admin</span></div>
                        <div class="col-3 text-center text-justify align-middle"><i class="fa fa-sign-out-alt"></i>退出</div>
                    </div>
                </div>
            </div>
            <div class="row position-relative" style="height: 91%">
                <c:if test="${!empty requestScope.twoLevelMenus}">
                    <%--左侧二级菜单导航条--%>
                    <div class="col-1 p-0 shadow-sm" style="width: 100px;top: 0px;" id="left_second_nav_sn">
                        <c:if test="${!empty requestScope.twoLevelMenus}">
                            <ul class="nav navbar-light bg-white h-100 flex-column shadow-sm mt-1">
                                <li class="navbar-text">
                                    <span>${requestScope.parentMenuName}</span>
                                </li>
                                <c:forEach items="${requestScope.twoLevelMenus}" var="menu">
                                    <li class="nav-item  w-100">
                                        <c:choose>
                                            <c:when test="${menu.id == requestScope.towLevelActive}">
                                                <a class="nav-link active"
                                                   href="${pageContext.request.contextPath}/sn/back/other?menuId=${menu.id}">${menu.name}</a>
                                            </c:when>
                                            <c:otherwise>
                                                <a class="nav-link"
                                                   href="${pageContext.request.contextPath}/sn/back/other?menuId=${menu.id}">${menu.name}</a>
                                            </c:otherwise>
                                        </c:choose>
                                    </li>
                                </c:forEach>
                            </ul>
                        </c:if>
                    </div>
                </c:if>
                <%--主体网页--%>
                <div class="col bg-light p-1 overflow-auto h-100 p-4" id="web-page-main-body">
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<%@include file="/webapp/sn/layout/scripts.jsp" %>
<script>
    var address = '${pageContext.request.contextPath}';
    !function () {
        $('#web-page-main-body').load('${pageContext.request.contextPath}${requestScope.currentMenu.url} #pageContent-sn',function () {
            $.getScript("${requestScope.currentMenu.jsUrl}");
        });
    }();
</script>
</body>
</html>
