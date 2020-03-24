<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/24
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>确定订单</title>

    <%@include file="/webapp/c/layout_c/styles.jsp" %>
    <style>
        .rule >div{
            margin-top: 10px;
        }
    </style>
</head>
<body>
<!--导航-->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">xxx商城</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="datum.jsp">个人资料</a>
            </li>


            <li class="nav-item">
                <a class="nav-link" href="site.jsp">收货地址</a>
            </li>

        </ul>
    </div>
</nav>

<div class="container rule">

    <div class="card">
        <div class="card-body">
            确认收货地址
        </div>

        <div class="container">
            <label class="btn">
                <input type="radio" name="options" id="option1" autocomplete="off">四川省成都市<br>
                <input type="radio" name="options" id="option2" autocomplete="off">广东省广州市<br>
                <input type="radio" name="options" id="option3" autocomplete="off">东北省吉林市<br>
                <input type="radio" name="options" id="option4" autocomplete="off">浙江省杭州市<br>
            </label>
        </div>
    </div>

    <div class="card">
        <div class="card-body">
            确认订单信息
        </div>

        <table class="table">
            <thead>
            <tr>
                <th scope="col">商品名称</th>
                <th scope="col">商品属性</th>
                <th scope="col">单价</th>
                <th scope="col">数量</th>
                <th scope="col">小计</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>法式复古白衬衫女设计感小众洋气雪纺衬衣春</td>
                <td>米色/尺码：S</td>
                <td>189.00</td>
                <td>1</td>
                <td>189.00</td>
            </tr>
            </tbody>
        </table>
    </div>

    <div class="card" style="width: 184px;    margin-left: 926px;">
        <div class="card-body" style="margin-left: 10px">
            实付款：¥<span style="color: rgb(255, 80, 0); font-size: 20px">191.33</span>
        </div>

        <div class="container" style="margin: 5px 55px">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                提交订单
            </button>

            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">扫码支付</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <img src="/static/img/c/1.png">
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
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
