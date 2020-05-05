<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>更新班级信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改班级信息:${cno}(留空表示不修改)</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/admin/updateClass" method="post">
        <input type="text" name="cno" value="${cno}" style="display: none">
        班级名：<input type="text" name="cname" ><br><br>
        院系：<input type="text" name="department" ><br><br>
        人数：<input type="text" name="number" ><br><br>
        班主任：<input type="text" name="mainteacher" ><br><br>
        <input type="submit" value="确认修改">
    </form>
</div>