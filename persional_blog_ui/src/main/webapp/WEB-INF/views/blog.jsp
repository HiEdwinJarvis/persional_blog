<%--
  Created by IntelliJ IDEA.
  User: 张琦
  Date: 2019/4/7
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <jsp:include page="title.jsp"/>
</head>
<body>
<div class="templatemo-logo visible-xs-block">
    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 black-bg logo-left-container">
        <h1 class="logo-left">Black</h1>
    </div>
    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 white-bg logo-right-container">
        <h1 class="logo-right">White</h1>
    </div>
</div>
<!--导航-->
<jsp:include page="nav.jsp"/>

<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 white-bg right-container">
    <h1 class="logo-right hidden-xs margin-bottom-60">White</h1>
    <div class="tm-right-inner-container">
        <h1 class="templatemo-header">blog</h1>
        表格


        <%--footer--%>
        <jsp:include page="footer.jsp"/>
    </div>
</div> <!-- right section -->
</div>
</body>
</html>
