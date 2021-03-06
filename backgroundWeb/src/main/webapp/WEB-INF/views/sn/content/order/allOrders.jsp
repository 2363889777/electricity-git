<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/17 0017
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有订单</title>
    <%@include file="/webapp/sn/layout/styles.jsp" %>
</head>
<body>
<div id="pageContent-sn">

    <div class="container-fluid bg-white order-sn" id="order-page-sn">
        <%--头部页面标题--%>
        <div class="row pl-4 pr-4 pt-4">
            <div class="pageContent-title-sn">
                <span class="ml-4">全部订单列表</span>
            </div>
            <%--                <button id="all-order-button">按钮</button>--%>
            <%--                <button id="batch-send-goods-button">批量发货</button>--%>
        </div>
        <%--页面身体--%>
        <div class="row p-4">
            <div class="container pageContent-body-sn">
                <%--页面通用筛选，操作--%>
                <div class="row">
                    <div class="col-4 pageContent-body-header-sn">
                        <button class="btn btn-success" type="button"><i class="fa fa-download"></i>订单导出</button>
                        <button class="btn btn-primary" type="button"><i class="fa fa-upload"></i>批量发货</button>
                    </div>
                    <div class="col-8">
                        <form id="order-filter-form-sn" action="sss">
                            <div class="form-row">
                                <div class="col-3 form-group">
                                    <select class="my-1 mr-sm-2 form-control" name="way-of-distribution-sn">
                                        <option value="1">全部</option>
                                        <option value="2" selected>快递配送</option>
                                        <option value="3">上门自提</option>
                                    </select>
                                </div>
                                <div class="col-3 form-group">
                                    <select class="my-1 mr-sm-2 form-control" name="stores-sn">
                                        <option value="1" selected>全部</option>
                                    </select>
                                </div>
                                <div class="col-3 form-group">
                                    <input name="start-time" type="text"
                                           class="form-control datetimepicker-input my-1 mr-sm-2" id="start-date"
                                           data-toggle="datetimepicker" data-target="#datetimepicker5"
                                           placeholder="请选择起始日期"/>
                                </div>
                                <div class="col-3 form-group">
                                    <input name="end-time" type="text"
                                           class="form-control datetimepicker-input my-1 mr-sm-2" id="end-date"
                                           data-toggle="datetimepicker" data-target="#datetimepicker5"
                                           placeholder="请选择截止日期"/>
                                </div>
                                <div class="col-5 form-group">
                                    <div class="input-group mb-3">
                                        <input name="search-condition" type="text" class="form-control"
                                               placeholder="请输入订单号/用户昵称">
                                        <div class="input-group-append">
                                            <button class="btn btn-outline-secondary" type="button"
                                                    id="order-filter-search-button-sn"><i class="fa fa-search"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <%--主体数据显示区域--%>
                <div class="row">
                    <table class="col" id="order-list-table-sn">
                        <thead>
                        <tr>
                            <th class="w-25">商品信息</th>
                            <th style="width: 15%">单价/数量</th>
                            <th style="width: 10%">实付款</th>
                            <th>买家</th>
                            <th>支付方式</th>
                            <th>配送方式</th>
                            <th>交易状态</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${requestScope.orders}" var="order">
                            <tr class="interval"></tr>
                            <tr class="order-header-sn">
                                <td colspan="8">
                                    <span>${order.createTime}</span>
                                    <span>订单号：${order.orderNumber}</span>
                                </td>
                            </tr>
                            <tr class="order-body-sn">
                                <td>
                                    <div class="media">
                                        <img class="mr-3"
                                             src="${pageContext.request.contextPath}/static/img/sn/good${order.goodId}/title/${order.goodTitleImg}"
                                             alt="Generic placeholder image"
                                        width="75px" height="75px">
                                        <div class="media-body">
                                            <h5 class="mt-0">${order.goodName}</h5>
                                            <span>颜色：${order.goodColor}</span>
                                            <span>型号：${order.goodSize}</span>
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <span>￥${order.goodPrice}</span><br>
                                    <span>x${order.orderGoodNumber}</span>
                                </td>
                                <td>
                                    <span>￥${order.goodPrice}</span><br>
                                    <span class="text-secondary">(含运费：￥${order.orderFreight})</span>
                                </td>
                                <td><span>${order.userName}</span><br><span class="text-secondary">(用户id：${order.userId})</span></td>
                                <td><span class="bg-primary text-white pl-1 pr-1">${order.paymentName}</span></td>
                                <td><span class="bg-primary text-white pl-1 pr-1">${order.orderDistribution}</span></td>
                                <td>
                                    <div class="mt-3 mb-3">
                                        <c:choose>
                                            <c:when test="${order.orderStateName=='待付款'}">
                                                <p><span>付款状态：</span><span class="bg-secondary  m-1 pl-1 pr-1 text-white">待付款</span>
                                                </p>
                                                <p><span>发货状态：</span><span class="bg-secondary  m-1 pl-1 pr-1 text-white">待发货</span>
                                                </p>
                                                <p><span>收货状态：</span><span class="bg-secondary m-1 pl-1 pr-1 text-white">待收货</span>
                                                </p>
                                            </c:when>
                                            <c:when test="${order.orderStateName=='待发货'}">
                                                <p><span>付款状态：</span><span class="bg-success  m-1 pl-1 pr-1 text-white">已付款</span>
                                                </p>
                                                <p><span>发货状态：</span><span class="bg-secondary  m-1 pl-1 pr-1 text-white">待发货</span>
                                                </p>
                                                <p><span>收货状态：</span><span class="bg-secondary m-1 pl-1 pr-1 text-white">待收货</span>
                                                </p>
                                            </c:when>
                                            <c:when test="${order.orderStateName=='待收货'}">
                                                <p><span>付款状态：</span><span class="bg-success  m-1 pl-1 pr-1 text-white">已付款</span>
                                                </p>
                                                <p><span>发货状态：</span><span class="bg-success  m-1 pl-1 pr-1 text-white">已发货</span>
                                                </p>
                                                <p><span>收货状态：</span><span class="bg-secondary m-1 pl-1 pr-1 text-white">待收货</span>
                                                </p>
                                            </c:when>
                                            <c:otherwise>
                                                <p><span>付款状态：</span><span class="bg-success  m-1 pl-1 pr-1 text-white">已付款</span>
                                                </p>
                                                <p><span>发货状态：</span><span class="bg-success  m-1 pl-1 pr-1 text-white">已发货</span>
                                                </p>
                                                <p><span>收货状态：</span><span class="bg-success m-1 pl-1 pr-1 text-white">已收货</span>
                                                </p>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                </td>
                                <td>
                                    <button name="detailed-order-button" class="btn-outline-success btn p-1" style="font-size: 13px" data-order="${order.orderNumber}">订单详情</button>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                        <tfoot></tfoot>
                    </table>
                </div>
                <%--页面底部--%>
                <div class="row justify-content-end p-4">
                    <div class="col-2">
                        <span>总订单数：100</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="/webapp/sn/layout/scripts.jsp" %>
<script type="text/javascript">

</script>
</body>
</html>
