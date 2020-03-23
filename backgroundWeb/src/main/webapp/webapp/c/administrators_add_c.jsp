<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/16
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加管理员</title>
    <%@include file="/webapp/c/layout_c/styles.jsp" %>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>


<div class="container">
    <div class="headline">
        <div class="input-group">
            <span class="mess"></span>添加管理员
        </div>
    </div>

    <form action="/addUser">
        <div class="am-form-group">
            <label class="des">用户名<span class="spa">*</span></label>
            <div class=""><input name="name" type="text" class="tpl-form-input "></div>
        </div>

        <div class="am-form-group">
            <label class="des">商品分类 <span class="spa">*</span></label>
            <div class="form-group">
                <label for="sel1"></label>
                <select class="form-control" id="sel1">
                    <option>点击选择</option>
                    <option>系统管理员</option>
                    <option>商城客服</option>
                    <option>大单人员</option>
                </select>
            </div>
        </div>


        <div class="am-form-group">
            <label class="des">登录密码<span class="spa">*</span></label>
            <div class=""><input name="pass" type="text" class="tpl-form-input "></div>
        </div>

        <div class="am-form-group">
            <label class="des">确认密码<span class="spa">*</span></label>
            <div class=""><input name="verifyPass" type="text" class="tpl-form-input "></div>
        </div>

        <div class="am-form-group">
            <label class="des">姓名<span class="spa">*</span></label>
            <div class=""><input name="realName" type="text" class="tpl-form-input "></div>
        </div>

        <div class="am-form-group" style="text-align: center">
            <button type="submit" class="am-btn-secondary">提交</button>
        </div>
    </form>


</div>

<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
