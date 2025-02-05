<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="lightpink">
	<div align="center">
		<font color="green">${SUCCESS}</font> <font color="red">${saveFail}</font>
	</div>
	<marquee> Welcome to Bikkad IT</marquee>
	<h1>User Management</h1>
	<form:form action="saveUser" modelAttribute="user" method="POST">
		<div align="center">
			<table>
				<tr>
					<td>UserName</td>
					<td><form:input path="userName" /></td>
				</tr>


				<tr>
					<td>UserEmail</td>
					<td><form:input path="userEmail" /></td>
				</tr>




				<tr>
					<td>UserContact</td>
					<td><form:input path="userPhone" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="save" /></td>
				</tr>



			</table>
		</div>
	</form:form>
</body>
</html>