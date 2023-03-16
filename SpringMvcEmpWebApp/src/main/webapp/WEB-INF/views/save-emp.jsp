<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Employeee</h1>
	<form action="save" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			 
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="salary"></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"></td>
			</tr>


		</table>
		</form>
</body>
</html>