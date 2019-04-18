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
<body class="hold-transition skin-blue sidebar-mini" onload=loadXMLDoc("${pageContext.request.contextPath}/category/queryCouponState.do")>
<div class="wrapper">
    <jsp:include page="../includes/nav.jsp" />
    <jsp:include page="../includes/menu.jsp" />

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                用户管理
                <input type="button" value="ajax" onclick="ajaxDemo()">
                <div id="resultff"></div>
                <div id="A1"></div>
                <small></small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li class="active">控制面板</li>
            </ol>
        </section>
        <!--在需要使用编辑器的地方插入textarea标签 -->


        <form:form id="inputForm" cssClass="form-horizontal" action="${pageContext.request.contextPath}/blog/add.do" method="post" >
            <div class="alert alert-danger alert-dismissible" ${baseResult == null ? "style='display:none;'" : ""}>
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                    ${baseResult.message}
            </div>

                <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Preference</label>
                <select class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref" name="pbCategorynum" class="option">
                    <option selected>Choose...</option>

                </select>





            <div class="form-group">
                <label>Text</label>
                <input type="text" name ="pbInfotitle" class="form-control" placeholder="Enter ...">
            </div>
            <textarea name="pbInfobody" id="description"/></textarea>
            <input type="submit"/>
        </form:form>
        <!--将相应的控件替换成编辑器代码 -->
        <script type="text/javascript">
            window.onload = function()
            {
                CKEDITOR.replace( 'description');
            };
        </script>
        <%--ajax查询一级标签--%>



                    </div>
                </div>
            </div>
        </section>
    </div>

    <jsp:include page="../includes/copyright.jsp" />
</div>

<jsp:include page="../includes/footer.jsp" />

<script>
    $(document).ready(function(){
        $.get("${pageContext.request.contextPath}/category/queryCouponState.do",
            function (data) {


                var item;
                $.each(data, function(i, result) {

                    item = "<option value="+result.pbCategoryid+">"+result.pbCategoryname+"</option>+"
                    ;
                    $('#inlineFormCustomSelectPref').append(item);
                });

            },
            "json")
    })


</script>
</body>
</html>