<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/17 0017
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有订单</title>
    <%@include file="/webapp/sn/layout/styles.jsp" %>
</head>
<body>
<div id="pageContent-sn">
    <%--头部页面标题--%>
    <div class="container-fluid bg-white">
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
                                        <input name="start-time" type="text" class="form-control datetimepicker-input my-1 mr-sm-2" id="start-date" data-toggle="datetimepicker" data-target="#datetimepicker5"
                                         placeholder="请选择起始日期"/>
                                    </div>
                                    <div class="col-3 form-group">
                                        <input name="end-time" type="text" class="form-control datetimepicker-input my-1 mr-sm-2" id="end-date" data-toggle="datetimepicker" data-target="#datetimepicker5"
                                               placeholder="请选择截止日期"/>
                                    </div>
                                    <div class="col-5 form-group">
                                        <div class="input-group mb-3">
                                            <input name="search-condition" type="text" class="form-control" placeholder="请输入订单号/用户昵称">
                                            <div class="input-group-append">
                                                <button class="btn btn-outline-secondary" type="button" id="order-filter-search-button-sn"><i class="fa fa-search"></i></button>
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
                            <tr class="row">
                                <th class="col-3">商品信息</th>
                                <th class="col-1">单价/数量</th>
                                <th class="col-2">实付款</th>
                                <th class="col-1">买家</th>
                                <th class="col-1">支付方式</th>
                                <th class="col-1">配送方式</th>
                                <th class="col-2">交易状态</th>
                                <th class="col-1">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr></tr>
                            <tr>
                                <td></td>
                            </tr>
                            </tbody>
                            <tfoot></tfoot>
                        </table>
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
