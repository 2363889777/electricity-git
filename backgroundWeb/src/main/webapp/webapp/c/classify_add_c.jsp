<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/19
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品分类</title>
    <%@include file="/webapp/c/layout_c/styles.jsp"%>
</head>
<body>
<div class="container-fluid h-100">
    <div class="row h-100">
        <%--左侧导航条--%>
        <div class="col-1 bg-primary" id="left_nav_sn"></div>
        <%--右侧内容--%>
        <div class="col">
            <%--头部通用条--%>
            <div class="row bg-danger" style="height: 8%" id="header_nav_sn"></div>
            <div class="row" style="height: 92%">
                <%--左侧二级菜单导航条--%>
                <div class="col-1 bg-secondary" id="left_second_nav_sn"></div>
                <%--主体网页--%>
                <div class="col">
                    <div class="container">
                        <form>
                            <div class="input-group">
                                <h5 class="col-md-12">添加商品分类</h5><br>
                                <div class="form-group col-md-12">
                                    <label>分类名称 </label>
                                    <input type="text">
                                </div>

                                <div class="form-group col-md-12">
                                    <label>上级分类 </label>
                                    <select class="form-control" id="sort">
                                        <option>顶级分类</option>
                                        <option>手机数码</option>
                                        <option>家用电器</option>
                                    </select>
                                </div>

                                <div class="form-group col-md-12">
                                    <label for="import_file" class="control-label">分类图片</label>
                                    <input type="file" name="files" class="file-loading" id="import_file" multiple/>
                                </div>

                                <div class="form-group col-md-12">
                                    <label>分类排序 </label>
                                    <input type="text">
                                </div>
                            </div>

                            <button type="submit">提交</button>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
