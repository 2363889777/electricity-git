<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/21 0021
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<div id="pageContent-sn">
    <div class="container-fluid bg-white order-sn">
        <div class="row pl-4 pr-4 pt-4" id="good-list-page-sn">
            <div class="container">
                <div class="headline">
                    <div class="input-group">
                        <span class="mess"></span>出售中的商品
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col">
                        <button type="button" class="btn btn-success text-white">新增</button>
                    </div>
                    <div class="form-group col">
                        <label for="sel1"></label>
                        <select class="form-control form-contro2" id="sel1">
                            <option>商品分类:</option>
                            <option>手机数码</option>
                            <option>加油电器</option>
                            <option>电脑办公</option>
                            <option>汽车用品</option>
                        </select>
                    </div>

                    <div class="form-group col">
                        <label for="sel1"></label>
                        <select class="form-control form-contro2" id="sel2">
                            <option>商品状态</option>
                            <option>上架</option>
                            <option>下架</option>
                        </select>
                    </div>

                </div>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>商品ID</th>
                        <th>商品图片</th>
                        <th>商品名称</th>
                        <th>商品分类</th>
                        <th>实际销量</th>
                        <th>商品状态</th>
                        <th>添加时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.goods}" var="good">
                        <tr>
                            <td>${good.goodId}</td>
                            <td>a</td>
                            <td>${good.goodName}</td>
                            <td>${good.goodClassifyName}</td>
                            <td>${good.goodSales}</td>
                            <td>10</td>
                            <td>
                                <div class="custom-control custom-switch">
                                    <input type="checkbox" class="custom-control-input" id="good-is-putAway-sn1">
                                    <label class="custom-control-label" for="good-is-putAway-sn1">上架</label>
                                </div>

                                <div class="custom-control custom-switch">
                                    <input type="checkbox" class="custom-control-input" id="good-recommend-sn1">
                                    <label class="custom-control-label" for="good-recommend-sn1">推荐</label>
                                </div>
                                <div class="custom-control custom-switch">
                                    <input type="checkbox" class="custom-control-input" id="good-hot-sn1">
                                    <label class="custom-control-label" for="good-hot-sn1">热销</label>
                                </div>

                                <div class="custom-control custom-switch">
                                    <input type="checkbox" class="custom-control-input" id="good-seasonal-sn1">
                                    <label class="custom-control-label" for="good-seasonal-sn1">应季</label>
                                </div>
                            </td>
                            <td>${good.goodCreateTime}</td>
                            <td>
                                <button type="button" class="btn btn-primary">编辑</button>
                                <button type="button" class="btn btn-primary">删除</button>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
