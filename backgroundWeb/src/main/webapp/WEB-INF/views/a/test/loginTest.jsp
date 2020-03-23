<%--
  Created by IntelliJ IDEA.
  User: 25743
  Date: 2020/3/18
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form id="login-form" action= "/loginHandle">
       <div>账号 <input name="account"></div>
        <div>密码<input name="password" type="password"></div>
        <button type="submit" >登录</button>
    </form>
</body>
</html>
