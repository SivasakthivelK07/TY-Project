<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<form action="register" method="post">
			<table border="10">
				<tr>
					<td>Enter employee id:</td>
					<td><input type="text" placeholder="example TY001" name="id"></td>
				</tr>
				<tr>
					<td>Enter age:</td>
					<td><input type="text" placeholder="example 24" name="age"></td>
				</tr>
				<tr>
					<td>Enter employee email id:</td>
					<td><input type="email" placeholder="example email@gmail.com"
						name="email"></td>
				</tr>
				<tr>
					<td>Enter password:</td>
					<td><input type="password" placeholder="example yy2u3h2793ry"
						name="password"></td>
				</tr>
				<tr>
					<td><button type="submit">REGISTER</button></td>
					<td></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>