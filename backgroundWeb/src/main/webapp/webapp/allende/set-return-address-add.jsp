<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加退货地址</title>
</head>
<%@include file="/webapp/allende/layout/styles.jsp" %>
<style>
    .form-1{
        margin-left: 5%;
    }
    input{
        border-top: none;
        border-left: none;
        border-right: none;
        border-bottom: 1px solid #0b2e13;
    }
    .btn{
        margin-left: 15%;
    }

</style>
<body>
<h4>新增退货地址</h4>
<form>
    <div class="form-1">
        <label>收货人姓名:</label>
        <input type="text" style="width: 600px"><br>
        <label>联系电话:</label>
        <input type="text" style="width: 600px"><br>
        <label>详细地址:</label>
        <input type="text" style="width: 600px"><br>
        <label>排 &nbsp;&nbsp; 序 &nbsp;&nbsp;:</label>
        <input type="text" style="width: 600px">
    </div>
    <button type="submit" class="btn btn-primary">提交</button>
</form>
</body>
</html>
