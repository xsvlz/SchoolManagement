<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>更新信息</title>
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
                    <small>修改学生信息:${sno}(留空表示不修改)</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/admin/updateStudent" method="post">
        <input type="text" name="sno" value="${sno}" style="display: none">
        姓名：<input type="text" name="sname"><br><br>
        性别：<input type="text" name="ssex"><br><br>
        年龄：<input type="text" name="sage"><br><br>
        班级：<input type="text" name="cno"><br><br>
        密码：<input type="text" name="spass"><br><br>
        <input type="submit" value="确认修改">
    </form>
</div>