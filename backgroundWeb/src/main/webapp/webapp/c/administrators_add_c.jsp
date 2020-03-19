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
                        <h4>添加管理员</h4>
                        <form>
                            <div class="input-group">
                                <label>用户名</label>
                                <input type="text" class="form-control" placeholder="请输入用户名">
                            </div>

                            <div class="form-group">
                                <label for="role">所属角色</label>
                                <select class="form-control" id="role">
                                    <option>系统管理员</option>
                                    <option>商城客服</option>
                                    <option>打单人员</option>
                                </select>
                            </div>


                            <div class="input-group">
                                <label>登录密码</label>
                                <input type="text" class="form-control" placeholder="请输入登录密码">
                            </div>


                            <div class="input-group">
                                <label>确认密码</label>
                                <input type="text" class="form-control" placeholder="请输入确认密码">
                            </div>


                            <div class="input-group">
                                <label>姓名</label>
                                <input type="text" class="form-control">
                            </div>
                            <input type="submit" class="but" value="提交">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
