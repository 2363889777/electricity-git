<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/18
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
    <%@include file="/webapp/c/layout_c/styles.jsp" %>
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
                    <div id="pageContent-sn">
                        <div class="container-fluid bg-white">
                            <div class="container">
                                <h4>出售中的商品</h4>
                                <a href="">新增</a>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>商品ID</th>
                                        <th>商品图片</th>
                                        <th>商品名称</th>
                                        <th>商品分类</th>
                                        <th>实际销量</th>
                                        <th>商品排序</th>
                                        <th>商品状态</th>
                                        <th>添加时间</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>10001</td>
                                        <td></td>
                                        <td>Apple iPhone X移动联通4G手机</td>
                                        <td>Iphone</td>
                                        <td>10</td>
                                        <td>20</td>
                                        <td>上架</td>
                                        <td>2018-06-25 19:32:28</td>
                                        <td>
                                            <button>编辑</button>
                                            <button>删除</button>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
