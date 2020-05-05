<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>教师控制台——个人信息</title>
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
                    <small>${teacher.tname}, 欢迎您</small>
                </h1>
            </div>
        </div>
    </div>



    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>教师号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>教育背景</th>
                    <th>职称</th>
                    <th>部门</th>
                </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>${teacher.tno}</td>
                        <td>${teacher.tname}</td>
                        <td>${teacher.tsex}</td>
                        <td>${teacher.tbackground}</td>
                        <td>${teacher.tprofession}</td>
                        <td>${teacher.department}</td>
                        <td>
                            <a href="<%=request.getContextPath()%>/teacher/toUpdatePassword/${teacher.tno}">修改密码</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>