<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body bgcolor="green">
<center>
<form action="login.do" method="post">
<input name="action" value="login" type="hidden">
<input placeholder="Enter User Name" name="cname" type="text">
<input placeholder="Enter Password" name="cpass" type="password">
<input type="submit" value="login">
</form>
</center>
</body>
</html>
