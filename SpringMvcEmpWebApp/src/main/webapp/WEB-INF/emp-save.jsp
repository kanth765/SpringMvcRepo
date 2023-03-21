<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- modelAttribute="employee" -->
<form:errors path="employee.*"/>
	<form:form action="save" method="post" >
		EMP ID: <form:input type="text" path="id" />
		<br>
		<br>
		EMP NAME: <form:input type="text" path="name"
			style="margin-left:34px;" />
		<br>
		<br> 
		EMP SALARY: <form:input type="text" path="salary"
			style="margin-left:10px;" />
		<br>
		<br>

		<input type="submit" value="Register">
	</form:form>

</body>
</html>