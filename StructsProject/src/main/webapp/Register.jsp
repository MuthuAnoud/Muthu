<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<body bgcolor="orange">
<center>
<form action="register.do" method="post">
<input name="action" value="register" type="hidden">
<input placeholder="Enter User Name" name="cname" type="text">
<input placeholder="Enter Password" name="cpass" type="password">
<input type="submit" value="register">
</form>
</center>
</body>
</html>
