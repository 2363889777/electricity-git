<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
    <%@include file="/webapp/allende/layout/styles.jsp" %>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h4>管理员列表</h4>
    <button>新增</button>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>用户ID</th>
            <th>微信头像</th>
            <th>微信昵称</th>
            <th>用户余额</th>
            <th>可用积分</th>
            <th>会员等级</th>
            <th>实际消费金额</th>
            <th>性别</th>
            <th>国家</th>
            <th>省份</th>
            <th>城市</th>
            <th>注册时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>19547</td>
            <td><img src="static/img/snow.png" width="35px" height="35px"></td>
            <td>allende</td>
            <td>0.00</td>
            <td>0</td>
            <td>--</td>
            <td>0.00</td>
            <td>男</td>
            <td>中国</td>
            <td>北京</td>
            <td>海淀</td>
            <td>2020-03-16 12:09:36</td>
            <td style="width: 280px;height: 25px">
                <button type="button" class="btn btn-light btn-sm">充值</button>
                <button type="button" class="btn btn-light btn-sm">会员等级</button>
                <button type="button" class="btn btn-light btn-sm">删除</button>
                <button class="btn btn-sm btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    更多
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a class="dropdown-item" href="#">用户订单</a>
                    <a class="dropdown-item" href="#">充值记录</a>
                    <a class="dropdown-item" href="#">余额明细</a>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<%@include file="/webapp/allende/layout/scripts.jsp" %>
</body>
</html>
