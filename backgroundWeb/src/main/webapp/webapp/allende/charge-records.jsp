<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>消费记录</title>
</head>
<%@include file="/webapp/allende/layout/styles.jsp" %>
<%@include file="/webapp/allende/layout/scripts.jsp" %>

<body>
    <div class="container">
        <h4>管理员列表</h4>
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

        <table class="table table-striped">
            <thead>
            <tr>
                <th>订单ID</th>
                <th>微信头像</th>
                <th>微信昵称</th>
                <th>订单号</th>
                <th>充值方式</th>
                <th>套餐名称</th>
                <th>支付金额</th>
                <th>赠送时间</th>
                <th>支付状态</th>
                <th>付款时间</th>
                <th>创建时间</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>19547123</td>
                <td><img src="static/img/snow.png" width="35px" height="35px"></td>
                <td>allende</td>
                <td>1234567</td>
                <td>支付宝</td>
                <td>0</td>
                <td>122.00</td>
                <td>0.00</td>
                <td>已支付</td>
                <td>2020-03-12 12:43:21</td>
                <td>2020-03-12 12:43:19</td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
