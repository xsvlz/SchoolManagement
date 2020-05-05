<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>修改密码</title>
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
                    <small>修改${sno}的密码:</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/student/updatePassword" method="post">
        <input type="text" name="sno" value="${sno}" style="display: none">
        新密码：<input type="text" name="spass"><br><br>
        <input type="submit" value="确认修改">
    </form>
</div>