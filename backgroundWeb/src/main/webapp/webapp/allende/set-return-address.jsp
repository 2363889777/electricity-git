<%@ page import="java.util.List" %>
<%@ page import="com.sanyi.allende.service.ReturnAddressListService" %>
<%@ page import="com.sanyi.allende.domain.ReturnAddressList" %>
<%@ page import="com.sanyi.allende.service.impl.ReturnAddressListServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>退货地址列表</title>
</head>
<%@include file="/webapp/allende/layout/styles.jsp" %>
<body>
<div class="container">
    <h4>退货地址列表</h4>
    <button type="submit" class="btn btn-primary">添加</button>

<%--    调用服务层--%>
    <%
        ReturnAddressListService returnAddressListService=new ReturnAddressListServiceImpl();
        List<ReturnAddressList> returnAddressLists=returnAddressListService.getAllReturnAddressList();
    %>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>模板ID</th>
            <th>模板名称</th>
            <th>计费方式</th>
            <th>排序</th>
            <th>添加时间</th>
            <th>更新时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>

            <tr>
                <th>10001</th>
                <th>全国包邮</th>
                <th>按件计</th>
                <th>100</th>
                <th>2020-03-20 12:30:01</th>
                <th>2020-03-20 12:30:11</th>
                <th>
                    <button type="button" class="btn btn-primary btn-sm"><a href="set-freight-formwork-add.jsp">编辑</a></button>
                    <button type="button" class="btn btn-secondary btn-sm">删除</button>
                </th>
            </tr>

            <%
                for(ReturnAddressList rdl:returnAddressLists){
            %>

            <tr>
                <td><%= rdl.getPkReturnAddressId()%></td>
                <td><%= rdl.getReturnConsigneeName()%></td>
                <td><%= rdl.getReturnPhone()%></td>
                <td><%= rdl.getReturnAddressLocation()%></td>
                <td><%= rdl.getReturnAddressShows()%></td>
                <td><%= rdl.getCreateTime()%></td>
                <td><%= rdl.getUpdateTime()%></td>
                <td> <button type="button" class="btn btn-primary btn-sm"><a href="set-freight-formwork-add.jsp">编辑</a></button>
                    <button type="button" class="btn btn-secondary btn-sm">删除</button>
                </td>
            </tr>

            <%
                }
            %>

        </tbody>
    </table>
</div>
</body>
</html>
