<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>学生控制台——查询所有课程</title>
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
                    <small>课程列表</small>
                </h1>
            </div>
        </div>
    </div>

    <%--
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/toAddCourse">添加课程</a>
        </div>
    </div>
    --%>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>课程号</th>
                    <th>课程名</th>
                    <th>教师号</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="course" items="${courses}">
                    <tr>
                        <td>${course.cono}</td>
                        <td>${course.coname}</td>
                        <td>${course.tno}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>