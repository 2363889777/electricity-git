<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/19
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品分类</title>
    <%@include file="/webapp/c/layout_c/styles.jsp"%>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

                    <div class="container">
                        <div class="headline">
                            <div class="input-group">
                                <span class="mess"></span>商品分类
                            </div>
                        </div>

                        <div class="form-group col">
                            <button type="button" class="btn btn-success"><a href="classify_add_c.jsp">新增</a></button>
                        </div>

                        <table class="table table-striped">
                            <thead>
                            <tr>
                                <th>分类ID</th>
                                <th>分类名称</th>
                                <th>分类排序</th>
                                <th>添加时间	</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>10001</td>
                                <td>手机数码</td>
                                <td>管理员</td>
                                <td>2018-06-25 19:32:28</td>
                                <td>
                                    <button type="button" class="btn btn-primary">编辑</button>
                                    <button type="button" class="btn btn-primary">删除</button>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>

<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
