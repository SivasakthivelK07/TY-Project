<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<%
	String message = (String) request.getAttribute("message");
	%>
	<%
	if (message == null) {
	%>
	<%=message%>
	<%
	}
	%>
	<fieldset>
		<form action="login" method="post">
			<table border="10">
				<tr>
					<td>Enter Student ID:</td>
					<td><input type="text" placeholder="example TY01" name="id"></td>
				</tr>
				<tr>
					<td>Enter Student Password:</td>
					<td><input type="password" placeholder="example TY01YdsT"
						name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="LOGIN"></td>
				</tr>

			</table>
			Don't have account <a href="register.jsp">Register</a> here.
		</form>
	</fieldset>

</body>
</html>