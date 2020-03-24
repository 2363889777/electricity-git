<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/22 0022
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品分类</title>
</head>
<body>
<div id="pageContent-sn">
    <div class="container-fluid bg-white order-sn">
        <div class="row pl-4 pr-4 pt-4" id="good-classify-list-page-sn">
            <div class="container">
                <div class="headline">
                    <div class="input-group">
                        <span class="mess"></span>商品分类
                    </div>
                </div>

                <div class="form-group col">
                    <button type="button" class="btn btn-success text-white" id="good-classify-list-add-button-sn">新增</button>
                </div>

                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>分类ID</th>
                        <th>分类名称</th>
                        <th>分类排序</th>
                        <th>添加时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.goodClassifies}" var="goodClassify">
                    <tr>
                        <td>${goodClassify.id}</td>
                        <td>${goodClassify.name}</td>
                        <td>${goodClassify.parentName}</td>
                        <td>${goodClassify.create_time}</td>
                        <td>
                            <button type="button" class="btn btn-primary" data-goodClassigy="${goodClassify.id}">编辑
                            </button>
                            <button type="button" class="btn btn-primary" data-goodClassigy="${goodClassify.id}">删除</button>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

</body>
</html>
