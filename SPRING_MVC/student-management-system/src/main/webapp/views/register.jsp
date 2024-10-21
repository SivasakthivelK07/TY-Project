<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

	<fieldset>
		<form action="register" method="post">
			<table border="10">
				<tr>
					<td>Enter Student ID:</td>
					<td><input type="text" placeholder="example TY01" name="id"></td>
				</tr>
				<tr>
					<td>Enter Student Name:</td>
					<td><input type="text" placeholder="example Example"
						name="name"></td>
				</tr>
				<tr>
					<td>Enter Student Email:</td>
					<td><input type="email"
						placeholder="example example@gmail.com" name="email"></td>
				</tr>
				<tr>
					<td>Enter Student Password:</td>
					<td><input type="password" placeholder="example TY01YdsT"
						name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="REGISTER"></td>
				</tr>
			</table>

		</form>
	</fieldset>


</body>
</html>