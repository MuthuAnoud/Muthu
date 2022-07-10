<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>Fruit Shop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="FruitShop">
<input type="radio" name="apple" value="rs50">Apple
<input type="radio" name="mango" value="rs30">Mango
<input type="radio" name="banana" value="rs20">Banana
<input type="submit" value="Next">
</form>
</center>
</body>
</html>