<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>首页</title>
</head>
<body>
<h1>首页</h1>
<span>${username}</span>
<p>
<a href="${pageContext.request.contextPath}/admin/logout">注销</a>
</p>
</body>
</html>