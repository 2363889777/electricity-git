<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/8 0008
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    html{
        height:100%
    }
    body {
        background-image: url("<%= request.getContextPath()%>/static/img/login/bg-login.jpg");
        background-position: center center;
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: cover;
        width: 100%;
        height:100%;
    }
    .card{

        /*位置设置/测试边框*/
        position:absolute;
        left:0;
        right:0;
        top:0;
        bottom:15%;
        /*显示和宽高设置*/
        width:400px;
        height:320px;
        /*样式设置*/
        background-color: rgba(255,255,255,0.8);
        /*盒子模型的属性*/
        margin:auto;
        /*文本字体*/
        /*动画特效*/
    }
    .card .error-place .error{
        color:red;
        font-size:12px
    }
    .card .error-place{
        padding:0;
        position:absolute
    }
    .card .error-spoce{
        padding:0;
    }
</style>
