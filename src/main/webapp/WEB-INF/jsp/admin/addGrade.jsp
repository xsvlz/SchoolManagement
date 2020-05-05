<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>添加选课</title>
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
                    <small>为学生${sno}添加选课</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/admin/addGrade" method="post">
        <input type="text" name="sno" value="${sno}" style="display: none">
        课程号：<input type="text" name="cono" required><br><br>

        <input type="submit" value="添加">
    </form>
</div>