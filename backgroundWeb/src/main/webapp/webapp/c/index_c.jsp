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
    <%@include file="/webapp/c/layout_c/styles.jsp"%>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

                    <div class="container">
                        <div class="headline">
                            <div class="input-group">
                                <span class="mess"></span>管理员列表
                            </div>
                        </div>
                        <div class="form-group col">
                            <button type="button" class="btn btn-success"><a href="webapp/c/administrators_add_c.jsp">新增</a></button>
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
                            <tbody>
                        <tr>
                            <td>10001</td>
                            <td>admin</td>
                            <td>管理员</td>
                            <td>2018-06-25 19:32:28</td>
                            <td></td>
                        </tr>
                        </tbody>
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

<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
