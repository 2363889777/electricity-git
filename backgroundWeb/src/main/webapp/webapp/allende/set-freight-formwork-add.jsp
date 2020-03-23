<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>模板新增</title>
</head>
<%@include file="/webapp/allende/layout/styles.jsp" %>
<style>
    .col-w{
        width: 75%;
    }
</style>
<body>
<h4>新增运费模板</h4><br>
<form>
    <div class="col-w">
        <label>模板名称: </label>
        <input class="form-control" type="text">
    </div><br>

    <div>
        <label>计费方式: </label>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
            <label class="form-check-label" for="exampleRadios1">
                按件数
            </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option1" checked>
            <label class="form-check-label" for="exampleRadios2">
                按重量
            </label>
        </div>
    </div>

    <div>
        <label>配送区域及运费: </label>
        <table class="table table-striped" style="width: 75%">
            <thead>
            <tr>
                <th>可配送区域</th>
                <th>首件(个)</th>
                <th>运费(元)</th>
                <th>续件(个)</th>
                <th>续费(元)</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th>
                    <button type="button" class="btn btn-light">点击添加配送区域运费</button>
                </th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            </tbody>
        </table>
    </div>



    <div class="col-w">
        <label>排序: </label>
        <input class="form-control" type="text" placeholder="100">
    </div>

    <button type="submit" class="btn btn-primary">提交</button>
</form>
</body>
</html>
