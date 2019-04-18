<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sys" tagdir="/WEB-INF/tags/sys" %>

<!DOCTYPE html>
<html>
<head>
    <title>我的博客 | 博客管理</title>
    <jsp:include page="../includes/header.jsp"/>
    <script src = "${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">


    </script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="../includes/nav.jsp"/>
    <jsp:include page="../includes/menu.jsp"/>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                博客管理

                <small></small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li class="active">控制面板</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-xs-12">


                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">博客管理</h3>
                        </div>

                        <div class="box-body">
                            <a href="${pageContext.request.contextPath}/blog/form.do" type="button"
                               class="btn btn-sm btn-default"><i class="fa fa-plus"></i> 新增</a>&nbsp;&nbsp;&nbsp;
                            <button type="button" class="btn btn-sm btn-default"
                                    onclick="App.deleteMulti('/user/delete')"><i class="fa fa-trash-o"></i> 删除
                            </button>&nbsp;&nbsp;&nbsp;
                            <a href="#" type="button" class="btn btn-sm btn-default"><i class="fa fa-download"></i>
                                导入</a>&nbsp;&nbsp;&nbsp;
                            <a href="#" type="button" class="btn btn-sm btn-default"><i class="fa fa-upload"></i> 导出</a>&nbsp;&nbsp;&nbsp;
                            <button type="button" class="btn btn-sm btn-primary"
                                    onclick="$('.box-info-search').css('display') == 'none' ? $('.box-info-search').show('fast') : $('.box-info-search').hide('fast')">
                                <i class="fa fa-search"></i> 搜索
                            </button>
                        </div>

                        <!-- /.box-header -->
                        <div class="box-body table-responsive">

                            <table id="dataTable" class="table table-hover" class="table">
                                <thead>
                                <tr>

                                    <th>ID</th>
                                    <th>博客名</th>
                                    <th>内容</th>
                                    <th>删除</th>
                                    <th>修改</th>

                                </tr>
                                </thead>
                                <div class="alert alert-danger alert-dismissible" ${message == null ? "style='display:none;'" : ""}>
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    ${message}
                                </div>
                                <tbody  class="table">

                                </tbody>
                            </table>
                        </div>
                        <!-- /.box-body -->


                    </div>
                    <!-- /.box -->
                </div>
            </div>
        </section>
    </div>

    <jsp:include page="../includes/copyright.jsp"/>
</div>

<jsp:include page="../includes/footer.jsp"/>

<!-- 自定义模态框 -->
<sys:modal/>

<script>


    $(document).ready(function(){
        $.get("${pageContext.request.contextPath}/blog/list.do",
            function (data) {
                var item;
                $.each(data, function(i, result) {
                    item = "<tr><td>" + result['pbInfoid'] + "</td>" +
                        "<td>" + result['pbInfotitle'] + "</td>" +
                        "<td>...</td>" +
                        "<td><a href=\"${pageContext.request.contextPath}/blog/find.do?pbInfokey="+result['pbInfoid']+"\" type=\"button\" class=\"btn btn-sm btn-primary\"><i class=\"fa fa-edit\"></i> 编辑</a>&nbsp</td>" +
                        "<td><a href=\"${pageContext.request.contextPath}/blog/delete.do?pbInfokey="+result['pbInfoid']+"\" type=\"button\" class=\"btn btn-sm btn-danger\"><i class=\"fa fa-edit\"></i> 编辑</a>&nbsp; </td>" +

                     "</tr>";
                    $('.table').append(item);
                });

            },
            "json")
    })



    function search() {
        var username = $("#username").val();
        var phone = $("#phone").val();
        var email = $("#email").val();

        var param = {
            "username": username,
            "phone": phone,
            "email": email
        };

        _dataTable.settings()[0].ajax.data = param;
        _dataTable.ajax.reload();
    }
</script>
</body>
</html>