<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/24
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品详情页</title>
    <%@include file="/webapp/c/layout_c/styles.jsp" %>
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
                <a class="nav-link" href="#">个人资料</a>
            </li>


            <li class="nav-item">
                <a class="nav-link" href="#">收货地址</a>
            </li>

        </ul>
    </div>
</nav>

<div class="container">
    <!--轮播图-->
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators draw">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active">
                <div>
                    <img src="//gd1.alicdn.com/imgextra/i1/0/TB17AL0KXXXXXaDXpXXXXXXXXXX_!!0-item_pic.jpg_50x50.jpg_.webp"
                         class="d-block w-186" alt="...">
                </div>
            </li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1">
                <div>
                    <img src="//gd1.alicdn.com/imgextra/i1/888074210/TB2ZXQuoXuWBuNjSspnXXX1NVXa_!!888074210.jpg_50x50.jpg"
                         class="d-block w-186" alt="...">
                </div>
            </li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2">
                <img src="//gd4.alicdn.com/imgextra/i4/888074210/TB23BNwnTtYBeNjy1XdXXXXyVXa_!!888074210.jpg_50x50.jpg"
                     class="d-block w-186" alt="...">
            </li>
            <li data-target="#carouselExampleIndicators" data-slide-to="3">
                <img src="//gd2.alicdn.com/imgextra/i2/888074210/TB2NRvjnr5YBuNjSspoXXbeNFXa_!!888074210.jpg_50x50.jpg_.webp"
                     class="d-block w-186" alt="...">
            </li>
            <li data-target="#carouselExampleIndicators" data-slide-to="4">
                <img src="//gd4.alicdn.com/imgextra/i4/888074210/TB2kTaicbAaBuNjt_igXXb5ApXa_!!888074210.jpg_50x50.jpg_.webp"
                     class="d-block w-186" alt="...">
            </li>
        </ol>
        <div class="carousel-inner mpa">
            <div class="carousel-item active">
                <img src="https://gd1.alicdn.com/imgextra/i1/0/TB17AL0KXXXXXaDXpXXXXXXXXXX_!!0-item_pic.jpg_400x400.jpg"
                     class="" alt="...">
            </div>
            <div class="carousel-item">
                <img src="https://gd1.alicdn.com/imgextra/i1/888074210/TB2ZXQuoXuWBuNjSspnXXX1NVXa_!!888074210.jpg_400x400.jpg"
                     class="" alt="...">
            </div>
            <div class="carousel-item">
                <img src="https://gd4.alicdn.com/imgextra/i4/888074210/TB23BNwnTtYBeNjy1XdXXXXyVXa_!!888074210.jpg_400x400.jpg"
                     class="" alt="...">
            </div>
            <div class="carousel-item">
                <img src="https://gd2.alicdn.com/imgextra/i2/888074210/TB2NRvjnr5YBuNjSspoXXbeNFXa_!!888074210.jpg_400x400.jpg"
                     class="" alt="...">
            </div>
            <div class="carousel-item">
                <img src="https://gd4.alicdn.com/imgextra/i4/888074210/TB2kTaicbAaBuNjt_igXXb5ApXa_!!888074210.jpg_400x400.jpg"
                     class="" alt="...">
            </div>
        </div>
    </div>


    <div class="input-group grue">
        <p>法国小众条纹雪纺绿色连衣裙夏小清新法式桔梗裙系带衬衫裙中长款</p>
        <div class="input-group">
            <label class="">价格</label>
            <span style="color: red ;text-indent: 20px">￥199</span>
        </div>
        <div class="input-group">
            <div class="bookNum btn-group" role="group" aria-label="Basic example">
                <label>数量</label>
                <a id="sub" style="text-indent: 20px" href="javascript:void(0);">
                    <button class="btn btn-secondary">-</button>
                </a>
                <input type="text" value="1" id="bookNum">
                <a id="add" href="javascript:void(0);">
                    <button class="btn btn-secondary">+</button>
                </a>
            </div>
        </div>
        <div class="input-group">
            <label class="">商品详情</label>
            <p style="color: #0f6674">
                <br>适用年龄: 18-24周岁<br>
                质地: 涤纶<br>
                尺码: S M<br>
                图案: 条纹<br>
                风格: 街头<br>
                领型: 西装领<br>
                颜色分类: 绿色 黄色<br>
                袖型: 插肩袖<br>
                成分含量: 81%(含)-90%(含)<br>
                年份季节: 2019年夏季<br>
                袖长: 短袖<br>
                衣长: 中长款<br>
                服装款式细节: 系带 口袋 不对称 绑带<br>
            </p>
        </div>
        <div>
            <button type="button" class="btn btn-warning">立即购买</button>
            <button type="button" class="btn btn-danger">加入购物车</button>
        </div>
    </div>

</div>

<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
