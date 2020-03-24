<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/24
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人资料</title>
    <%@include file="/webapp/c/layout_c/styles.jsp" %>
</head>
<body>

<!--导航-->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">xxx商城</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="datum.jsp">个人资料</a>
            </li>


            <li class="nav-item">
                <a class="nav-link" href="site.jsp">收货地址</a>
            </li>
        </ul>
    </div>
</nav>


<div class="container">
    <form>
        <div class="form-group row">
            <label for="colFormLabelSm" class="col-sm-1 col-form-label col-form-label-sm">昵称:</label>
            <div class="col-sm-11">
                <input type="text" class="form-control" id="colFormLabelSm">
            </div>
        </div>


        <div class="form-group row">
            <label for="colFormLabelSm1" class="col-sm-1 col-form-label col-form-label-sm">性别:</label>
            <div class="col-sm-11">
                <input type="text" class="form-control" id="colFormLabelSm1">
            </div>
        </div>


        <div class="form-group row">
            <label for="colFormLabelSm2" class="col-sm-1 col-form-label col-form-label-sm">手机:</label>
            <div class="col-sm-11">
                <input type="text" class="form-control" id="colFormLabelSm2">
            </div>
        </div>

        <button type="submit" class="btn btn-primary">修改</button>
    </form>
</div>

<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
