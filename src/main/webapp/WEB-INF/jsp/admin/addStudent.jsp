<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>添加学生</title>
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
                    <small>添加学生</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/admin/addStudent" method="post">
        学号：<input type="text" name="sno" required><br><br>
        姓名：<input type="text" name="sname" required><br><br>
        性别：<input type="text" name="ssex" required><br><br>
        年龄：<input type="text" name="sage" required><br><br>
        班级：<input type="text" name="cno" required><br><br>
        密码：<input type="text" name="spass" required><br><br>
        <input type="submit" value="添加">
    </form>
</div>