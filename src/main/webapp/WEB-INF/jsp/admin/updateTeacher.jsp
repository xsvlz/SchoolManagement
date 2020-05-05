<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>更新教师信息</title>
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
                    <small>修改教师信息:${tno}(留空表示不修改)</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/admin/updateTeacher" method="post">
        <input type="text" name="tno" value="${tno}" style="display: none">
        姓名：<input type="text" name="tname"><br><br>
        性别：<input type="text" name="tsex"><br><br>
        教育背景：<input type="text" name="tbackground"><br><br>
        职称：<input type="text" name="tprofession"><br><br>
        部门：<input type="text" name="department"><br><br>
        密码：<input type="text" name="tpass"><br><br>
        <input type="submit" value="确认修改">
    </form>
</div>