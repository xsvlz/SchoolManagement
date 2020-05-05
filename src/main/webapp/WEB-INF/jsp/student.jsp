<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>学生控制台</title>
    <style>
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
        h2 {
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
<h2>${sno}, 欢迎使用学生信息控制台</h2>
<h3>
    <a href="${pageContext.request.contextPath}/student/info/${sno}">个人信息</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/student/courses/${sno}">选课信息</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/student/class/${sno}">班级信息</a>
</h3>

</body>
</html>
