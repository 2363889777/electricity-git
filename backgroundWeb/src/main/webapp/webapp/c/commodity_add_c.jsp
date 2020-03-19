<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/18
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品添加</title>
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
                               <h5 class="col-md-12">基本信息</h5>
                                   <div class="form-group col-md-12">
                                       <label>商品名称</label>
                                       <input class="text" class="form-control">
                                   </div>

                                    <div class="form-group col-md-12">
                                        <label>商品分类</label>
                                        <select class="form-control" id="role">
                                            <option>请选择商品分类</option>
                                            <option>手机数码</option>
                                            <option>家用电器</option>
                                        </select>
                                    </div>

                               <div class="form-group col-md-12">
                                   <label for="import_file" class="control-label">商品图片</label>
                                   <input type="file" name="files" class="file-loading" id="import_file" multiple/>
                               </div>

                               <div class="form-group col-md-12">
                                   <label>商品卖点</label>
                                   <input class="text" class="form-control">
                               </div>
                           </div>
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
