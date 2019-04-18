<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>我的博客 | 用户管理</title>
    <jsp:include page="../includes/header.jsp" />

    <script src="${pageContext.request.contextPath}/static/ckeditor/ckeditor.js"></script>


    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="../includes/nav.jsp" />
    <jsp:include page="../includes/menu.jsp" />

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                用户管理
                <small></small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li class="active">控制面板</li>
            </ol>
        </section>
        <!--在需要使用编辑器的地方插入textarea标签 -->


        <form:form id="inputForm" cssClass="form-horizontal" action="${pageContext.request.contextPath}/blog/update.do" method="post" >
            <input type="hidden" value="${pbInfo.pbInfoid}" name="pbInfoid">

                <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Preference</label>
            <select class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref" name="pbCategorynum">

                <c:forEach items="${categoryList}" var="category">
                    <option value="${category.pbCategoryid}" >${category.pbCategoryname}</option>
                </c:forEach>
            </select>





            <div class="form-group">
                <label>Text</label>
                <input type="text" id="edid_title" name ="pbInfotitle" class="form-control" value="${pbInfo.pbInfotitle}" placeholder="Enter ...">
            </div>
            <textarea name="pbInfobody" id="description"/> <c:out value="${pbInfo.pbInfobody}" escapeXml="false"/></textarea>
            <input type="submit"/>
        </form:form>
        <!--将相应的控件替换成编辑器代码 -->
        <script type="text/javascript">
            window.onload = function()
            {
                CKEDITOR.replace( 'description');
            };
        </script>



                    </div>
                </div>
            </div>
        </section>
    </div>

    <jsp:include page="../includes/copyright.jsp" />
</div>

<jsp:include page="../includes/footer.jsp" />
</body>
</html>