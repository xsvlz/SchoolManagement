<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>管理员控制台</title>
    <style>
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
        h1 {
            text-align: center;
        }
        h3 {
            width: 180px;
            height: 38px;
            margin: 10px auto 10px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<h1>欢迎来到管理员控制台！</h1>
<h3>
    <a href="${pageContext.request.contextPath}/admin/allStudent">学生管理</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/admin/allTeacher">教师管理</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/admin/allCourse">课程管理</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/admin/allClass">班级管理</a>
</h3>

</body>
</html>
