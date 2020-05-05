<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>修改分数</title>
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
                    <small>修改分数:${sno}-${cono}</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/teacher/updateScore/${tno}" method="post">
        <input type="text" name="sno" value="${sno}" style="display: none">
        <input type="text" name="cono" value="${cono}" style="display: none">
        分数：<input type="text" name="grade"><br><br>
        <input type="submit" value="确认修改">
    </form>
</div>