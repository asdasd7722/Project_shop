<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2022-12-28
  Time: 오후 4:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<form action="login" method="post">
    <label>ID </label> <br>
    <input name="account" type="text"> <br>

    <label>PW </label> <br>
    <input name="pw" type="text"> <br>
    <input type="submit" value="로그인">
    <input onclick="location.href='/signup'" type="button" value="회원가입">
</form>
</body>
</html>
