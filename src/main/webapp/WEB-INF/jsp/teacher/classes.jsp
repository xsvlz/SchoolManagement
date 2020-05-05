<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>教师控制台——班级信息</title>
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
                    <small>${tno}, 您管理的班级如下</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>班级号</th>
                    <th>班级名</th>
                    <th>学院</th>
                    <th>班级人数</th>
                    <th>班主任</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="clazz" items="${classes}">
                    <tr>
                        <td>${clazz.cno}</td>
                        <td>${clazz.cname}</td>
                        <td>${clazz.department}</td>
                        <td>${clazz.number}</td>
                        <td>${clazz.mainteacher}</td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>