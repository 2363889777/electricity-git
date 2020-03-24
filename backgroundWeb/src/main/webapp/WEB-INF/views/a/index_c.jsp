<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/16
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员</title>
    <%@include file="/webapp/a/layout/styles.jsp"%>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div id="pageContent-sn">
<div class="container-fluid bg-white order-sn">
    <div class="row pl-4 pr-4 pt-4" id="PersonnelManagement-a">

                    <div class="container">
                        <div class="headline">
                            <div class="input-group">
                                <span class="mess"></span>管理员列表
                            </div>
                        </div>
                        <div class="form-group col">
                            <button id="button-add-a" type="button" class="btn btn-success">新增</button>
                        </div>
                        <table class="table table-striped">
                            <thead>
                            <tr>
                                <th>管理员ID</th>
                                <th>用户名</th>
                                <th>姓名</th>
                                <th>添加时间	</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <c:forEach items="${values}" var="value" >
                                <tbody>
                                    <tr>
                                        <td>${value.pkCustomerBgId}</td>
                                        <td>${value.pkCustomerName}</td>
                                        <td>管理员</td>
                                        <td>${value.createTime}</td>
                                        <td></td>
                                    </tr>
                                </tbody>
                            </c:forEach>

                        </table>
                    </div>
    </div>
</div>
</div>
<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
