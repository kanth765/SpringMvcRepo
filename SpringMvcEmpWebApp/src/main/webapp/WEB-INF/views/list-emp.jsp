<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<h1>Employee Management System</h1>
	<h2>
		<a href="new">RegisterEmployee</a>
	</h2>

	<table id="customers">
		<tr>
			<th>EMPID</th>
			<th>EMPNAME</th>
			<th>SALARY</th>
			<!-- 			<th>email</th> -->
			<th>Actions</th>
		</tr>

		<c:forEach var="employee" items="${emps}">

			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.salary}</td>
				<td><a href="deleteEmp?id=${employee.id}">delete</a> <a
					href="updateEmp?id=${employee.id}">update</a></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>