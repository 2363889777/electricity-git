<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>交易设置</title>
</head>
<%@include file="/webapp/allende/layout/styles.jsp" %>
<style>
    h4,
    .form-l{margin-left: 5%}
    input{
        border-top: none;
        border-left: none;
        border-right: none;
        border-bottom: 1px solid #0b2e13;
    }
    button{margin-left: 15%}
</style>
<body>
<h4>订单流程设置</h4>
<hr style="width: 80%; font-size: 1px; margin-left: 5%;">
<br>
<form>
<div class="form-l">
    <label>未支付订单:</label>
    <input type="text" width="80">
    <label>天后自动关闭</label><br>
    <label>未支付订单:</label>
    <input type="text" width="80">
    <label>天后自动确认收货</label><br>
    <label>未支付订单:</label>
    <input type="text" width="80">
    <label>天内允许申请售后</label>
</div>
<br>
<br>
<h4>运费设置</h4>
<hr style="width: 80%; font-size: 1px; margin-left: 5%;">
    <div class="form-l">
        <label><input type="radio" name="money" value="">叠加</label><br>
        <span>订单中的商品有多个运费模板时，将每个商品的运费之和订为订单总运费</span><br><br>
        <label><input type="radio" name="money" value="">以最低运费结算</label><br>
        <span>订单中的商品有多个运费模板时，取订单中运费最少的商品的运费计为订单总运费</span><br><br>
        <label><input type="radio" name="money" value="">以最高运费结算</label><br>
        <span>订单中的商品有多个运费模板时，取订单中运费最多的商品的运费计为订单总运费</span><br><br>
    </div><br>
    <button type="submit" class="btn btn-primary">提交</button>
</form>
</body>
</html>
