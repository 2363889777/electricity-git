<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/24
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>地址管理</title>

    <%@include file="/webapp/c/layout_c/styles.jsp" %>
</head>
<body>

<!--导航-->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">xxx商城</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">首页</a>
            </li>
        </ul>
    </div>
</nav>


<form>
    <h5>新建收货地址</h5>
    <div class="form-group row">
        <label for="colFormLabelSm" class="col-sm-1 col-form-label col-form-label-sm">收货人:</label>
        <div class="col-sm-11">
            <input type="text" class="form-control" id="colFormLabelSm">
        </div>
    </div>

    <div class="form-group row">
        <label for="colFormLabelSm3" class="col-sm-1 col-form-label col-form-label-sm">所在地区:</label>
        <div class="col-sm-11">
            <input type="text" class="form-control" id="colFormLabelSm3">
        </div>
    </div>

    <div class="form-group row">
        <label for="colFormLabelSm1" class="col-sm-1 col-form-label col-form-label-sm">详细地址:</label>
        <div class="col-sm-11">
            <input type="text" class="form-control" id="colFormLabelSm1">
        </div>
    </div>


    <div class="form-group row">
        <label for="colFormLabelSm2" class="col-sm-1 col-form-label col-form-label-sm">手机号码:</label>
        <div class="col-sm-11">
            <input type="text" class="form-control" id="colFormLabelSm2">
        </div>
    </div>

    <label class="btn">
        <input type="checkbox" autocomplete="off">设为默认收货地址
    </label><br>

    <button type="submit" class="btn btn-primary">保存</button><br>
</form>
<br>
<table class="table">
    <thead>
    <tr>
        <th scope="col">收货人</th>
        <th scope="col">所在地区</th>
        <th scope="col">详细地址</th>
        <th scope="col">电话/手机</th>
        <th scope="col">操作</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">陈先生</th>
        <td>四川省 成都市 锦江区</td>
        <td>天仙桥北路2号金海岸公寓</td>
        <td>134444237888</td>
        <td>
            <a>修改</a>
            <a>|</a>
            <a>删除</a>
        </td>
    </tr>
    </tbody>
</table>


<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
