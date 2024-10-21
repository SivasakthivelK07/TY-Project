<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String password = (String) request.getAttribute("messageResponse");
	if (password != null) {
	%>
	<%=password%>
	<%
	}
	%>
	<fieldset>
		<form action="change-password" method="post">
			<table border="10">
				<tr>
					<td>Enter employee ID:</td>
					<td><input type="text" placeholder="example yy2u3h2793ry"
						name="id"></td>
				</tr>
				<tr>
					<td>Old password:</td>
					<td><input type="text" placeholder="example yy2u3h2793ry"
						name="password"></td>
				</tr>
				<tr>
					<td>Change password:</td>
					<td><input type="text" placeholder="example yy2u3h2793ry"
						name="changePassword"></td>
				</tr>
				<tr>
					<td>Re-enter password:</td>
					<td><input type="password" placeholder="example yy2u3h2793ry"
						name="changePassword_"></td>
				</tr>
				<tr>
					<td><button type="submit">CHANGE PASSWORD</button></td>
					<td></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>