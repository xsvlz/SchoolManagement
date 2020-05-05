<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>管理员控制台——班级管理</title>
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
                    <small>班级列表</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/toAddClass">添加班级</a>
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
                        <td>
                            <a href="<%=request.getContextPath()%>/admin/toUpdateClass/${clazz.cno}">更改</a> |
                            <a href="<%=request.getContextPath()%>/admin/delClass/${clazz.cno}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>