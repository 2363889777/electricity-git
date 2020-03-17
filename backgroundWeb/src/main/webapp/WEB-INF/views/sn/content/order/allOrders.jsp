<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/17 0017
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有订单</title>
    <%@include file="/webapp/sn/layout/styles.jsp" %>
</head>
<body>
    <div id="pageContent-sn">
        <div class="container-fluid bg-white">
            <div class="row">
                全部订单
                <button id="all-order-button">按钮</button>
                <button id="batch-send-goods-button">批量发货</button>
            </div>
            <div class="row"></div>
            <div class="row"></div>
        </div>
    </div>
    <%@include file="/webapp/sn/layout/scripts.jsp" %>
</body>
</html>
