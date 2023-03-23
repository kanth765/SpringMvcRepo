<form action="update" method="post" modelAttribute="employee">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" readonly="readonly" 
					value="${employee.id}"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="${employee.name}"></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="salary" value="${employee.salary}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>


		</table>

	</form>
</body>
</html>