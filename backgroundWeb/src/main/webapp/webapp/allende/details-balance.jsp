<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>余额明细</title>
</head>
<%@include file="/webapp/allende/layout/styles.jsp" %>
<body>
<div class="container">
    <h4>余额明细</h4>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>头像</th>
            <th>昵称</th>
            <th>余额变动场景</th>
            <th>变动金额</th>
            <th>描述说明</th>
            <th>管理员备注</th>
            <th>创建时间</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>19547</td>
            <td><img src="static/img/snow.png" width="35px" height="35px"></td>
            <td>allende</td>
            <td>购买商品</td>
            <td>10.0</td>
            <td>订单号</td>
            <td>--</td>
            <td>2020--03-16 20:32:34</td>
        </tr>
        </tbody>
    </table>
</div>
<%@include file="/webapp/allende/layout/scripts.jsp" %>
</body>
</html>
