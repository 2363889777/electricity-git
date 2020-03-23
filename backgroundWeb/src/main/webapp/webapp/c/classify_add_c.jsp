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

                    <div class="container">
                        <form action="/addUser">
                                <div class="headline">
                                    <div class="input-group">
                                        <span class="mess"></span>添加商品分类
                                    </div>
                                </div>


                                <div class="am-form-group">
                                    <label class="des">分类名称<span class="spa">*</span></label>
                                    <div class=""><input type="text" class="tpl-form-input "></div>
                                </div>

                                <div class="am-form-group">
                                    <label class="des">上级分类 <span class="spa">*</span></label>
                                    <div class="form-group">
                                        <label for="sel1"></label>
                                        <select class="form-control" id="sel1">
                                            <option>顶级分类</option>
                                            <option>手机数码</option>
                                            <option>加油电器</option>
                                            <option>电脑办公</option>
                                            <option>汽车用品</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label class="des">商品图片 <span class="spa">*</span></label>
                                    <input type="file" name="files" class="file-loading" id="import_file" multiple/>
                                </div>

                                <div class="am-form-group">
                                    <label class="des">分类排序<span class="spa">*</span></label>
                                    <div class=""><input type="text" class="tpl-form-input " placeholder="10"></div>
                                </div>

                            <div class="am-form-group" style="text-align: center">
                                <button type="submit" class="am-btn-secondary">提交</button>
                            </div>
                        </form>
                    </div>


<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
