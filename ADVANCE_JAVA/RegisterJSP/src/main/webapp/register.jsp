<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:blue;">Register</h1>
	<form action="register" method="post">
		Name:<input type="text" name="name"><br><br>
		Email:<input type="text" name="email"><br><br>
		Password:<input type="password" name="password"><br><br>
		Gender:<input type="radio" name="gender" value="Male">Male<input type="radio" name="gender" value="Female">Female<br><br>
		<select name="State" >
			<option>Select</option>
			<option>TamilNadu</option>
			<option>Karnataka</option>
			<option>Pune</option>
		</select><br><br>
		<input type="submit" value="REGISTER">
	</form>


</body>
</html>