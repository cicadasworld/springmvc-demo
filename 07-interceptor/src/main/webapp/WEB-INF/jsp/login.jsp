<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>登录</title>
</head>
<body>
<h1>登录页面</h1>
<form action="${pageContext.request.contextPath}/admin/login" method="">
用户名：<input type="text" name="username">
密码：<input type="text" name="password">
<input type="submit" value="登录">
</form>
</body>
</html>