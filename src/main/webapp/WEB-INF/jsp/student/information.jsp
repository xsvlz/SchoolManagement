<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>学生控制台——信息查看</title>
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
                    <small>${student.sname},欢迎您</small>
                </h1>
            </div>
        </div>
    </div>

    <%--
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/toAddStudent">新增</a>
        </div>
    </div>
    --%>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>班级</th>
                </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>${student.sno}</td>
                        <td>${student.sname}</td>
                        <td>${student.ssex}</td>
                        <td>${student.sage}</td>
                        <td>${student.cno}</td>
                        <td>
                            <a href="<%=request.getContextPath()%>/student/toUpdatePassword/${student.sno}">修改密码</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>