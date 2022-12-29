<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2022-12-28
  Time: 오후 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>
<h1>Sign Up</h1>
<form action="signup", method="post">
    <label>ID : </label> <br>
    <input name="account" type="text"> <br>
    <label>PW : </label> <br>
    <input name="pw" type="text"> <br>
    <label>Email : </label> <br>
    <input name="email" type="text"> <br>
    <input type="submit" value="회원가입">
</form>
</body>
</html>
