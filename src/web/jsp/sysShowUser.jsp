<%--
  Created by IntelliJ IDEA.
  User: Xug
  Date: 2016/7/5
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showUser</title>
</head>
<body>
<h2>注册激活${user.userName}</h2>
<form action="user/register?action=register" method="post">
    Email:<input type="text" id="email" name="email" value="" >
    <input type="submit" value="提交">
</form>
</body>
</html>