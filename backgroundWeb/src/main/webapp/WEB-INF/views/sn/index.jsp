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
        #left_nav_sn .nav-link.active {
            background: #f8f9fa;
        }
    </style>
</head>
<body>
<div class="container-fluid h-100">
    <div class="row h-100">
        <%--左侧导航条--%>
        <div class="col-1 p-0 h-100" id="left_nav_sn">
            <ul class="nav navbar-dark bg-dark flex-column h-100">
                <a class="navbar-brand" href="#">Navbar</a>
                <c:forEach items="${sessionScope.oneLevelMenu}" var="menu">
                    <li class="nav-item">
                        <c:choose>
                            <c:when test="${menu.id == requestScope.oneLevelActive}">
                                <a class="nav-link active"
                                   href="${pageContext.request.contextPath}${menu.url}?menuId=${menu.id}">${menu.name}</a>
                            </c:when>
                            <c:otherwise>
                                <a class="nav-link"
                                   href="${pageContext.request.contextPath}${menu.url}?menuId=${menu.id}">${menu.name}</a>
                            </c:otherwise>
                        </c:choose>

                    </li>
                </c:forEach>
            </ul>
        </div>

        <%--右侧内容--%>
        <div class="col">
            <%--头部通用条--%>
            <div class="row bg-danger" style="height: 8%" id="header_nav_sn"></div>
            <div class="row" style="height: 92%">
                <c:if test="${!empty requestScope.twoLevelMenus}">
                    <%--左侧二级菜单导航条--%>
                    <div style="border: 1px solid black;" class="col-1" id="left_second_nav_sn">
                        <c:if test="${!empty requestScope.twoLevelMenus}">
                            <ul class="nav navbar-dark bg-primary">

                                <c:forEach items="${requestScope.twoLevelMenus}" var="menu">
                                    <li class="nav-item">
                                        <c:choose>
                                            <c:when test="${menu.id == requestScope.towLevelActive}">
                                                <a class="nav-link active"
                                                   href="${pageContext.request.contextPath}${menu.url}?menuId=${menu.id}">${menu.name}</a>
                                            </c:when>
                                            <c:otherwise>
                                                <a class="nav-link"
                                                   href="${pageContext.request.contextPath}${menu.url}?menuId=${menu.id}">${menu.name}</a>
                                            </c:otherwise>
                                        </c:choose>
                                    </li>
                                </c:forEach>
                            </ul>
                        </c:if>
                    </div>
                </c:if>
                <%--主体网页--%>
                <div class="col">

                </div>
            </div>
        </div>
    </div>
</div>
</div>
<%@include file="/webapp/sn/layout/scripts.jsp" %>
</body>
</html>
