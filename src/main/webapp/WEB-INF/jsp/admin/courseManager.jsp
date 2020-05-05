<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>管理员控制台——学生选课</title>
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
                    <small>学生${sno}的所有课程:</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/toAddGrade/${sno}">添加选课</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>课程号</th>
                    <th>课程名</th>
                    <th>分数</th>

                </tr>
                </thead>

                <tbody>
                <c:forEach var="grade" items="${grades}">
                    <tr>
                        <td>${grade.cono}</td>
                        <td>${grade.coname}</td>
                        <td>${grade.grade}</td>
                        <td>
                            <a href="<%=request.getContextPath()%>/admin/toUpdateScore/${grade.sno}/${grade.cono}">修改成绩</a> |
                            <a href="<%=request.getContextPath()%>/admin/delScore/${grade.sno}/${grade.cono}">删除选课</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>