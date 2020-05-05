<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>添加教师</title>
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
                    <small>添加教师</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/admin/addTeacher" method="post">
        教师号：<input type="text" name="tno" required><br><br>
        姓名：<input type="text" name="tname" required><br><br>
        性别：<input type="text" name="tsex" required><br><br>
        教育背景：<input type="text" name="tbackground" required><br><br>
        职称：<input type="text" name="tprofession" required><br><br>
        部门：<input type="text" name="department" required><br><br>
        密码：<input type="text" name="tpass" required><br><br>
        <input type="submit" value="添加">
    </form>
</div>