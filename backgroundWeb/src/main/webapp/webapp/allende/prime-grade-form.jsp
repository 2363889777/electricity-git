
<%@ page import="java.util.List" %>
<%@ page import="com.sanyi.allende.service.PrimeListFormService" %>
<%@ page import="com.sanyi.allende.domain.PrimeListForm" %>
<%@ page import="com.sanyi.allende.service.impl.PrimeListFormServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 设置编码
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
%>
<html>
<head>
    <title>会员等级</title>
</head>
<%@include file="/webapp/allende/layout/styles.jsp" %>
<body>


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
        PrimeListFormService primeListFormService=new PrimeListFormServiceImpl();
        List<PrimeListForm> primeListForms=primeListFormService.getAllPrimeForm();
    %>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>信息编号</th>
            <th>编号</th>
            <th>昵称</th>
            <th>电话</th>
            <th>创建时间</th>
            <th>更新时间</th>
        </tr>
        </thead>
        <tbody>
        <%
            for(PrimeListForm plf:primeListForms){
        %>
            <tr>
                <td><%= plf.getPkUserMessageId() %></td>
                <td><%= plf.getPkUserId() %></td>
                <td><%= plf.getUserName() %></td>
                <td><%= plf.getUserPhone() %></td>
                <td><%= plf.getCreateTime() %></td>
                <td><%= plf.getUpdateTime() %></td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
