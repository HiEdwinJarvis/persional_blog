<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>我的博客 | 项目添加</title>
    <jsp:include page="../includes/header.jsp" />

    <script src="${pageContext.request.contextPath}/static/ckeditor/ckeditor.js"></script>
    <%--<script src = "${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>--%>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <%--Dropzone所需要的组件--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/plugins/dropzone/min/dropzone.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/plugins/dropzone/min/basic.min.css" />
    <script src="${pageContext.request.contextPath}/static/assets/plugins/dropzone/min/dropzone.min.js"></script>
    <script src = "${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $.get("${pageContext.request.contextPath}/ProjectTech/techlist.do",
                function (data) {
                console.log(data);
                         alert("dd");
                        alert(data[0].pbProjecttechnoname);

                    },
                    "json")
        })

    </script>
</head>
<body class="hold-transition skin-blue sidebar-mini" onload="initData()">
<div class="wrapper">
    <jsp:include page="../includes/nav.jsp" />
    <jsp:include page="../includes/menu.jsp" />

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                项目管理
                <div id="kkk"></div>

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

            <div class="box box-success">
                <div class="box-header with-border">
                    <h3 class="box-title">Different Height</h3>
                </div>
                <%--多选--%>
                <div class="box-body">
                   项目名称
                    <input class="form-control input-lg" type="text" placeholder=".input-lg">
                    <br>


                    <div class="box box-success">
                        <div class="box-header">
                            <h3 class="box-title">iCheck - Checkbox &amp; Radio Inputs</h3>
                        </div>
                        <div class="box-body">
                            <!-- Minimal style -->

                            <!-- checkbox -->


                            <!-- radio -->
                            <div class="form-group">
                                <label>
                                    <input type="radio" name="r3" class="flat-red" checked>技术1
                                </label>
                                <label>
                                    <input type="radio" name="r3" class="flat-red">技术2
                                </label>
                                <label>
                                    <input type="radio" name="r3" class="flat-red" disabled>技术3
                                </label>
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            Many more skins available. <a href="http://fronteed.com/iCheck/">Documentation</a>
                        </div>
                    </div>

                    <div id="dropz" class="dropzone"></div>
                    <h3>项目描述</h3>
                    <textarea name="pbInfobody" id="description"/></textarea>
                </div>
                <!-- /.box-body -->
            </div>



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
<script>

    var myDropzone = new Dropzone("#dropz", {
        url: "${pageContext.request.contextPath}/upload.do",
        dictDefaultMessage: '拖动文件至此或者点击上传', // 设置默认的提示语句
        paramName: "dropzFile", // 传到后台的参数名称
        init: function () {
            this.on("success", function (file, data) {
                // 上传成功触发的事件
            });
        }
    });

    $(function(){
        $("#button1").click(function(){
            $.get(
                "${pageContext.request.contextPath}/category/queryCouponState.do",

                function (data) {

                    alert(data[0].pbCategoryname)


                },
                'json'

            )


        })

    })

</script>

<jsp:include page="../includes/footer.jsp" />
</body>
</html>