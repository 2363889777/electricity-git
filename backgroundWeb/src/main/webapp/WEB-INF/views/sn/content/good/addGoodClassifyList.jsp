<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/22 0022
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加商品分类</title>
</head>
<body>
<div id="pageContent-sn">
    <div class="container-fluid bg-white order-sn">
        <div class="row pl-4 pr-4 pt-4" id="add-good-classify-list-page-sn">
            <div class="container">
                <form>
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
        </div>
    </div>
</div>

</body>
</html>
