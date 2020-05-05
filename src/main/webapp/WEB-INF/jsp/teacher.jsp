<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>教师控制台</title>
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
<h2>${tno}, 欢迎使用教师信息控制台</h2>
<h3>
    <a href="${pageContext.request.contextPath}/teacher/info/${tno}">个人信息</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/teacher/students/${tno}">学生信息</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/teacher/courses/${tno}">课程信息</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/teacher/class/${tno}">班级信息</a>
</h3>

</body>
</html>
