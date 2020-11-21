<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>首页</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
    <script>
        function checkUsername() {
            $.post({
                url: "${pageContext.request.contextPath}/checkUsername",
                data: {"name":$("#username").val()},
                success: function(data, status) {
                    console.log(data);
                    console.log(status);
                }
            })
        }
    </script>
</head>
<body>
    username: <input type="text" id="username" onblur="checkUsername()">
</body>
</html>