<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/18
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />

    <%@include file="/webapp/c/layout_c/styles.jsp" %>
</head>

<body>
<div class="login">
    <div class="login-top">
        <h1>REGISTER</h1>
        <form>
            <input type="text" value="User Id" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Id';}">
            <input type="password" value="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}">
        </form>
        <div class="forgot">
            <input type="submit" value="Register" >
        </div>
    </div>
    <div class="login-bottom">
        <h3>switch to &nbsp;<a href="#">LOGIN</a>&nbsp Here</h3>
    </div>
</div>
<div class="copyright">
    <p>Copyright &copy; 2020.Company name All rights reserved. - More Templates</p>
</div>

<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
