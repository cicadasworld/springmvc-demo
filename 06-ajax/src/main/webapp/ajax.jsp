<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>首页</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
    <script>
        function load() {
            $.post("${pageContext.request.contextPath}/getUsers", function(data) {
                //console.log(data);
                var html = "";
                for (let i = 0; i < data.length; i++) {
                    html += "<tr>" +
                        "<td>" + data[i].name + "</td>" +
                        "<td>" + data[i].age + "</td>" +
                        "<td>" + data[i].sex + "</td>" +
                        "</tr>";
                }
                $("#content").html(html);
            })
        }
    </script>
</head>
<body>
<input type="button" value="加载" id="btn" onclick="load()">
<table>
    <thead>
        <tr>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
        </tr>
    </thead>
    <tbody id="content">
    </tbody>
</table>
</body>
</html>