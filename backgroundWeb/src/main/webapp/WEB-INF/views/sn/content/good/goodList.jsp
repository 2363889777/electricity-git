<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/21 0021
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        <button type="button" class="btn btn-success text-white" id="good-list-add-button-sn">新增
                        </button>
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
                            <td>
                                <img class="mr-3"
                                     src="${pageContext.request.contextPath}/static/img/sn/good${good.goodId}/${good.imgName}"
                                     alt="Generic placeholder image"
                                     width="75px" height="75px">
                            </td>
                            <td>${good.goodName}</td>
                            <td>${good.goodClassifyName}</td>
                            <td>${good.goodSales}</td>
                            <td>
                                <div class="custom-control custom-switch">
                                    <c:choose>
                                        <c:when test="${good.goodIsPutAwayName eq '上架'}">
                                            <input type="checkbox" class="custom-control-input" checked="true"
                                                   id="good-is-putAway-sn-good${good.goodId}"
                                                   data-good="${good.goodId}">
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" class="custom-control-input"
                                                   id="good-is-putAway-sn-good${good.goodId}"
                                                   data-good="${good.goodId}">
                                        </c:otherwise>
                                    </c:choose>
                                    <label class="custom-control-label"
                                           for="good-is-putAway-sn-good${good.goodId}">上架</label>
                                </div>

                                <div class="custom-control custom-switch">
                                    <c:choose>
                                        <c:when test="${good.goodIsRecommend}">
                                            <input type="checkbox" class="custom-control-input" checked="checked"
                                                   id="good-recommend-sn-good${good.goodId}" data-good="${good.goodId}">
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" class="custom-control-input"
                                                   id="good-recommend-sn-good${good.goodId}" data-good="${good.goodId}">
                                        </c:otherwise>
                                    </c:choose>
                                    <label class="custom-control-label"
                                           for="good-recommend-sn-good${good.goodId}">推荐</label>
                                </div>
                                <div class="custom-control custom-switch">
                                    <c:choose>
                                        <c:when test="${good.goodIsHot}">
                                            <input type="checkbox"
                                                   class="custom-control-input"
                                                   checked="checked"
                                                   id="good-hot-sn-good${good.goodId}" data-good="${good.goodId}">
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" class="custom-control-input"
                                                   id="good-hot-sn-good${good.goodId}" data-good="${good.goodId}">
                                        </c:otherwise>
                                    </c:choose>
                                    <label class="custom-control-label" for="good-hot-sn-good${good.goodId}">热销</label>
                                </div>

                                <div class="custom-control custom-switch">
                                    <c:choose>
                                        <c:when test="${good.goodIsSeasonal}">
                                            <input type="checkbox"
                                                   class="custom-control-input"
                                                   checked="checked"
                                                   id="good-seasonal-sn-good${good.goodId}" data-good="${good.goodId}">
                                        </c:when>
                                        <c:otherwise><input type="checkbox" class="custom-control-input"
                                                            id="good-seasonal-sn-good${good.goodId}" data-good="${good.goodId}"></c:otherwise>
                                    </c:choose>
                                    <label class="custom-control-label"
                                           for="good-seasonal-sn-good${good.goodId}">应季</label>
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
