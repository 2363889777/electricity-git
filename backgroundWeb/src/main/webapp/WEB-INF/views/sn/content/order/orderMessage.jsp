<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/18 0018
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单详细信息</title>
    <%@include file="/webapp/sn/layout/styles.jsp" %>
</head>
<body>
<div id="pageContent-sn">
    <div class="container-fluid bg-white order-sn" id="order-detailed-message-sn">
        <div class="container">
            <%--订单时间表--%>
            <div class="row">
                <table class="state-time-table-sn">
                    <thead>
                    <tr>
                        <th>下单时间</th>
                        <th>付款</th>
                        <th>发货</th>
                        <th>收货</th>
                        <th>完成</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            2018-08-02 17:43:39
                        </td>
                        <td>
                            付款于 2018-08-02 17:43:45
                        </td>
                        <td>
                            发货于 2018-10-28 13:09:01
                        </td>
                        <td>
                            收货于 2018-11-12 13:40:51
                        </td>
                        <td>
                            完成于 2018-11-12 13:40:51
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <%--基本信息标题--%>
            <div class="row pt-4">
                <div class="pageContent-title-sn">
                    <span class="ml-4">基本信息</span>
                </div>
            </div>
            <%--基本信息表--%>
            <div class="row mt-3">
                <table class="table-bordered order-base-message-table-sn">
                    <thead class="">
                    <tr>
                        <th>订单号</th>
                        <th>买家</th>
                        <th>订单金额</th>
                        <th>支付方式</th>
                        <th>配送方式</th>
                        <th>交易状态</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <span>2018080298545157</span>
                        </td>
                        <td>
                            <span>下一个自己</span><br>
                            <span>(用户id：10226)</span>
                        </td>
                        <td>
                            <dl>
                                <dd>订单总额：￥1.00</dd>
                                <dd>运费金额：+￥0.00</dd>
                                <dd>实付款金额：￥1.00</dd>
                            </dl>
                        </td>
                        <td><span class="bg-primary text-white pl-1 pr-1">微信支付</span></td>
                        <td><span class="bg-primary text-white pl-1 pr-1">快递配送</span></td>
                        <td>
                            <dl>
                                <dd><span>付款状态：</span><span class="bg-success m-1 pl-1 pr-1 text-white">已付款</span></dd>
                                <dd><span>发货状态：</span><span class="bg-success m-1 pl-1 pr-1 text-white">已发货</span></dd>
                                <dd><span>收货状态：</span><span class="bg-success m-1 pl-1 pr-1 text-white">已收货</span></dd>
                            </dl>
                        </td>
                    </tr>

                    </tbody>
                </table>
            </div>

            <%--商品信息标题--%>
            <div class="row pt-4">
                <div class="pageContent-title-sn">
                    <span class="ml-4">商品信息</span>
                </div>
            </div>
            <%--商品信息表--%>
            <div class="row mt-3">
                <table class="table-bordered order-goods-message-table-sn">
                    <thead>
                    <tr>
                        <th class="w-25">商品名称</th>
                        <th>商品编码</th>
                        <th>重量(Kg)</th>
                        <th>单价</th>
                        <th>购买数量</th>
                        <th>商品总价</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <div class="media">
                                <img class="mr-3" src="${pageContext.request.contextPath}/static/img/sn/goodtest.jpg"
                                     alt="Generic placeholder image">
                                <div class="media-body">
                                    <h5 class="mt-0">Media heading</h5>
                                </div>
                            </div>
                        </td>
                        <td>
                            <span>---</span>
                        </td>
                        <td>
                            <span>1</span>
                        </td>
                        <td>
                            <span>￥1.00</span>
                        </td>
                        <td>
                            <span>×1</span>
                        </td>
                        <td>
                            <span>￥1.00</span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="6">
                            <div class="row justify-content-between">
                                <div class="col text-left ml-2">买家留言：无</div>
                                <div class="col-2 text-left">
                                    总计金额：￥1.00
                                </div>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <%--收货信息标题--%>
            <div class="row pt-4">
                <div class="pageContent-title-sn">
                    <span class="ml-4">收货信息</span>
                </div>
            </div>
            <%--收货信息表--%>
            <div class="row mt-3">
                <table class="table-bordered order-get-goods-address-table-sn">
                    <thead>
                    <tr>
                        <th>收货人</th>
                        <th>收货电话</th>
                        <th>收货地址</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <span>付费</span>
                        </td>
                        <td>
                            <span>13471121121</span>
                        </td>
                        <td>
                            <span>北京市 北京市 东城区 发发发</span>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <%--付款信息标题--%>
            <div class="row pt-4">
                <div class="pageContent-title-sn">
                    <span class="ml-4">付款信息</span>
                </div>
            </div>
            <%--付款信息表--%>
            <div class="row mt-3">
                <table class="table-bordered order-payment-message-table-sn">
                    <thead>
                    <tr>
                        <th>应付款金额</th>
                        <th>支付方式</th>
                        <th>支付流水号</th>
                        <th>付款状态</th>
                        <th>付款时间</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <span>￥1.00</span>
                        </td>
                        <td>
                            <span><span class="bg-primary text-white pl-1 pr-1">微信支付</span></span>
                        </td>
                        <td>
                            <span>4200000135201808020290121628</span>
                        </td>
                        <td>
                            <span><span class="bg-success m-1 pl-1 pr-1 text-white">已付款</span></span>
                        </td>
                        <td>
                            <span>2018-08-02 17:43:45</span>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <%--发货信息标题--%>
            <div class="row pt-4">
                <div class="pageContent-title-sn">
                    <span class="ml-4">发货信息</span>
                </div>
            </div>
            <%--发货信息标题--%>
            <div class="row mt-3">
                <table class="table-bordered order-payment-message-table-sn">
                    <thead>
                    <tr>
                        <th>物流公司</th>
                        <th>物流单号</th>
                        <th>发货状态</th>
                        <th>发货时间</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <span>韵达快递</span>
                        </td>
                        <td>
                            <span>4200000135201808020290121628</span>
                        </td>
                        <td>
                            <span><span class="bg-success m-1 pl-1 pr-1 text-white">已发货</span></span>
                        </td>
                        <td>
                            <span>2018-08-02 17:43:45</span>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="row mt-6">
            <div class="col" style="height: 80px"></div>
        </div>
    </div>
</div>

<%@include file="/webapp/sn/layout/scripts.jsp" %>
</body>
</html>
