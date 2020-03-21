<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/18
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表</title>
    <%@include file="/webapp/c/layout_c/styles.jsp" %>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div id="pageContent-sn">
    <div class="container-fluid bg-white">
        <div class="container">
            <h4>出售中的商品</h4>
            <button id="good-list-add-button-sn">新增</button>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>商品ID</th>
                    <th>商品图片</th>
                    <th>商品名称</th>
                    <th>商品分类</th>
                    <th>实际销量</th>
                    <th>商品排序</th>
                    <th>商品状态</th>
                    <th>添加时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${requestScope.goods}" var="good">
                    <tr>
                        <td>${good.goodId}</td>
                        <td></td>
                        <td>${good.goodName}</td>
                        <td>${good.goodClassifyName}</td>
                        <td>${good.goodSales}</td>
                        <td>20</td>
                        <td>${good.goodIsPutAwayName}</td>
                        <td>${good.goodCreateTime}</td>
                        <td>
                            <button>编辑</button>
                            <button>删除</button>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
