<%@ page import="java.util.List" %>
<%@ page import="com.sanyi.allende.service.PrimeListService" %>
<%@ page import="com.sanyi.allende.domain.PrimeList" %>
<%@ page import="com.sanyi.allende.service.impl.PrimeListServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员等级</title>
</head>
<%@include file="/webapp/allende/layout/styles.jsp" %>
<style>
    .sf{
        float: right;
    }
</style>
<body>
<div id="pageContent-sn">
    <div class="container-fluid bg-white order-sn">
        <div class="row pl-4 pr-4 pt-4" id="add-good-list-page-sn">
<div class="container">
    <h4>会员等级列表</h4>
    <div class="form-group col-2">
        <%--            <label for="exampleFormControlSelect1"></label>--%>
        <select class="form-control" id="exampleFormControlSelect1">
            <option>充值方式</option>
            <option>全部</option>
            <option>自定义金额</option>
            <option>套餐充值</option>
        </select>
    </div>
    <div class="form-group col-3">
        <%--            <label for="exampleFormControlSelect1"></label>--%>
        <select class="form-control" id="exampleFormControlSelect1">
            <option>付款状态</option>
            <option>全部</option>
            <option>未支付</option>
            <option>已支付</option>
        </select>
    </div>
    <form class="form-inline">
        <div class="form-group mx-sm-3 mb-2">
            <input type="text" class="form-control" id="inputPassword2" placeholder="输入用户昵称/订单号">
        </div>
        <button type="submit" class="btn btn-primary mb-2">搜索</button>
    </form>

    <%
        PrimeListService primeListService=new PrimeListServiceImpl();
        List<PrimeList> primeLists=primeListService.getAllPrime();
    %>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>用户ID</th>
            <th>用户昵称</th>
            <th>可用积分</th>
            <th>地址</th>
            <th>创建时间</th>
        </tr>
        </thead>
        <tbody>
            <%
                for(PrimeList primeList:primeLists){
            %>
            <tr>
                <td><%= primeList.getPkUserId()%></td>
                <td><%= primeList.getUserName()%></td>
                <td><%= primeList.getUserIntegral()%></td>
                <td><%= primeList.getUserAddressMessage()%></td>
                <td><%= primeList.getCreateTime()%>

            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</div>
</div>
</div>
</body>
</html>
