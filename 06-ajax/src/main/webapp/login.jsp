<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
    <script>
        function checkName() {
            $.ajax({
                url: "${pageContext.request.contextPath}/checkUser",
                data: {"username": $("#name").val()},
                success: function(data) {
                    if (data.toString() === 'ok') {
                        $("#nameMsg").css("color", "green");
                    } else {
                        $("#nameMsg").css("color", "red");
                    }
                    $("#nameMsg").html(data);
                }
            })
        }
        function checkPwd() {
            $.ajax({
                url: "${pageContext.request.contextPath}/checkUser",
                data: {"password": $("#pwd").val()},
                success: function(data) {
                    if (data.toString() === 'ok') {
                        $("#pwdMsg").css("color", "green");
                    } else {
                        $("#nameMsg").css("color", "red");
                    }
                    $("#pwdMsg").html(data);
                }
            })
        }
    </script>
</head>
<body>
<p>
    用户名：<input type="text" id="name" onblur="checkName()">
    <span id="nameMsg"></span>
</p>
<p>
    密码：<input type="text" id="pwd" onblur="checkPwd()">
    <span id="pwdMsg"></span>
</p>
</body>
</html>