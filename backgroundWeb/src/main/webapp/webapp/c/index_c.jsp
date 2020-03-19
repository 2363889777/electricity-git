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
<div class="container-fluid h-100">
    <div class="row h-100">
        <%--左侧导航条--%>
        <div class="col-1 bg-primary" id="left_nav_sn"></div>
        <%--右侧内容--%>
        <div class="col">
            <%--头部通用条--%>
            <div class="row bg-danger" style="height: 8%" id="header_nav_sn"></div>
            <div class="row" style="height: 92%">
                <%--左侧二级菜单导航条--%>
                <div class="col-1 bg-secondary" id="left_second_nav_sn"></div>
                <%--主体网页--%>
                <div class="col">
                    <div class="container">
                        <h4>管理员列表</h4>
                        <a href="administrators_add_c.jsp">新增</a>
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
                        </table>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</div>
<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
