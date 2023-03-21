<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>ID:</td>
			<td>${employee.id}</td>
		</tr>
		<tr>
			<td>Name:</td>
			<td>${employee.name}</td>
		</tr>

		<tr>
			<td>Salary:</td>
			<td>${employee.salary}</td>
		</tr>
			<tr>
			<td>Bonous:</td>
			<td>${employee.bonous}</td>
		</tr>
		<tr>
			<td>JoiningDate:</td>
			<td>${employee.joiningDate}</td>
		</tr>
	</table>
</body>
</html>