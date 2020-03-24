<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/23 0023
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<h1>文件上传实例 - 菜鸟教程</h1>

    <form method="post" action="/UploadServlet" enctype="multipart/form-data">
        选择一个文件:
        <input type="file" name="uploadFile" />
        <br/><br/>
        <input type="button" value="上传" />
    </form>


<%@include file="/webapp/sn/layout/scripts.jsp" %>
<script>
    $('[type="button"]').on("click",function () {
        $.ajax({
            url:${pageContext.request.contextPath}"/UploadServlet",
            data:$('form').serialize(),
            type:"post",
            success:function (a) {
                alert(a)
            }
        })
    })
</script>
</body>
</html>
