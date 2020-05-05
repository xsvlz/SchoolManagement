<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>添加班级</title>
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
                    <small>添加班级</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/admin/addClass" method="post">
        班级号：<input type="text" name="cno" required><br><br>
        班级名：<input type="text" name="cname" required><br><br>
        院系：<input type="text" name="department" required><br><br>
        人数：<input type="text" name="number" required><br><br>
        班主任：<input type="text" name="mainteacher" required><br><br>
        <input type="submit" value="添加">
    </form>
</div>