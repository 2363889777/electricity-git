    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <!-- 放置所有要使用的通用样式 -->
        <!-- 引入Bootstrap的样式 -->
        <%--        <link rel="stylesheet" href="<%=request.getContextPath() %>/static/lib/bootstrap/css/bootstrap.css">--%>
        <link rel="stylesheet" href="<%=request.getContextPath() %>/static/lib/bootstrap/css/bootstrap.minDate.css">
        <link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css"
        rel="stylesheet">
        <!-- 引入bootstrap 上传插件 的样式 -->
        <link rel="stylesheet" href="<%= request.getContextPath() %>/static/lib/bootstrap-fileinput/css/fileinput.css">

        <!-- 引入Font Awesome字体图标的样式 -->
        <%--        <link rel="stylesheet" href="<%=request.getContextPath() %>/static/lib/fontawesome/css/all.css">--%>
        <link rel="stylesheet" href="<%=request.getContextPath() %>
        /static/lib/fontAwesome4.7.0/css/font-awesome.min.css">
        <%--订单  通用样式页面样式--%>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/sn/pageContentGeneral.css">
        <%--订单 全部订单信息--%>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/sn/OrderDetailedMessage.css">
        <%--商品列表样式--%>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/sn/goodList.css">
        <%--添加商品列表样式--%>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/sn/addGoodList.css">
        <%--商品分类样式--%>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/sn/goodClassifyList.css">
        <%--商品分类添加样式--%>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/sn/addGoodClassifyList.css">
