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
	String message = (String) request.getAttribute("message");
	%>
	<%
	if (message != null) {
	%>
	<%=message%>
	<%
	}
	%>
	<fieldset>
		<form action="delete" method="post">
			<table border="10">
				<tr>
					<td>Enter employee ID:</td>
					<td><input type="text" placeholder="example yy2u3h2793ry"
						name="id"></td>
				</tr>
				<tr>
					<td><button type="submit">DELETE</button></td>
					<td></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>