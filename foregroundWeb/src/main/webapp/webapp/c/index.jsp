<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/24
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>首页</title>
    <%@include file="/webapp/c/layout_c/styles.jsp" %>
</head>
<body>

<!--导航-->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">xxx商城</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="#">登录</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="输入要搜索的商品" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
        </form>
    </div>
</nav>

<!--轮播图-->
<div class="container">
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="https://tse1-mm.cn.bing.net/th/id/OIP.MOPRXg78Ha1dk5eCP1HzaQHaCg?w=290&h=101&c=7&o=5&dpr=1.25&pid=1.7" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="https://tse2-mm.cn.bing.net/th/id/OIP.VDcZacZvsBXuhjoOeDWi_wHaCU?w=290&h=93&c=7&o=5&dpr=1.25&pid=1.7" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="https://tse3-mm.cn.bing.net/th/id/OIP.IPkUijnA_qa7rttIHvvoLQHaCZ?w=281&h=96&c=7&o=5&dpr=1.25&pid=1.7" class="d-block w-100" alt="...">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>

<div class="container">
    <!--  热卖单品  -->
    <div class="headline">
        <div class="input-group">
            <span class="mess"></span>热卖单品
        </div>
    </div>
    <div class="input-group recommend">
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i3/TB1PYJ3PXXXXXcQXXXXXXXXXXXX_!!0-item_pic.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i1/59135199/TB2wOQ3dhrI8KJjy0FpXXb5hVXa_!!59135199.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i1/2776214491/TB2syfPnC_I8KJjy0FoXXaFnVXa_!!2776214491.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i2/205131802/TB2SPm8hbRkpuFjSspmXXc.9XXa_!!205131802.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>

        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i3/TB1PYJ3PXXXXXcQXXXXXXXXXXXX_!!0-item_pic.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i1/59135199/TB2wOQ3dhrI8KJjy0FpXXb5hVXa_!!59135199.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i1/2776214491/TB2syfPnC_I8KJjy0FoXXaFnVXa_!!2776214491.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i2/205131802/TB2SPm8hbRkpuFjSspmXXc.9XXa_!!205131802.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
    </div>

    <!--  经典推荐  -->
    <div class="headline">
        <div class="input-group">
            <span class="mess"></span>经典推荐
        </div>
    </div>
    <div class="input-group recommend">
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i1/2776214491/TB2syfPnC_I8KJjy0FoXXaFnVXa_!!2776214491.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i2/205131802/TB2SPm8hbRkpuFjSspmXXc.9XXa_!!205131802.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i3/TB1PYJ3PXXXXXcQXXXXXXXXXXXX_!!0-item_pic.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i1/59135199/TB2wOQ3dhrI8KJjy0FpXXb5hVXa_!!59135199.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>


        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i1/2776214491/TB2syfPnC_I8KJjy0FoXXaFnVXa_!!2776214491.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i2/205131802/TB2SPm8hbRkpuFjSspmXXc.9XXa_!!205131802.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i3/TB1PYJ3PXXXXXcQXXXXXXXXXXXX_!!0-item_pic.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
        <div class="card" style="width: 16rem;">
            <img class="card-img-top"
                 src="https://img.alicdn.com/bao/uploaded/i1/59135199/TB2wOQ3dhrI8KJjy0FpXXb5hVXa_!!59135199.jpg_200x200q90.jpg_.webp">
            <div class="card-body">
                <p class="card-text">2020春装新款长袖t恤女韩版宽松潮条纹大码连帽宽松学生上衣帽衫</p>
                <p class="card-link" style="color: red">￥399</p>
            </div>
        </div>
    </div>

</div>


<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
