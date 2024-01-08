<!DOCTYPE html>
<%@page import="dto.Student"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
	table{
		position: absolute;
		top: 30%;
		left: 40%;
	}
</style>
</head>
<body>
<%Student student=(Student)request.getAttribute("stu"); %>
	
	<form action="edit"  method="post">
	<h1>edit page</h1>
	<table>
	<tr>
			<td>id :</td>
			<td><input type="text" name="id" value="<%=student.getId()%>"></td>
		</tr>
	
		<tr>
			<td>first name</td>
			<td><input type="text" name="fname" value="<%=student.getFirstName() %>"></td>
		</tr>
		<tr>
			<td>last name</td>
			<td><input type="text" name="lname" value="<%=student.getLastName() %>"></td>
		</tr>
		<tr>
			<td>age</td>
			<td><input type="number" name="age" value="<%= student.getAge()%>"></td>
		</tr>
		<tr>
			<td>email</td>
			<td><input type="email" name="email" value="<%= student.getEmail()%>"></td>
		</tr>
		<tr>
			<td>address</td>
			<td><input type="text" name="address" value="<%=student.getAddress() %>"></td>
		</tr>
		<tr>
			<td>Phno</td>
			<td><input type="number" name="phno" value="<%=student.getPhno() %>"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="<%=student.getPassword() %>"></td>
		</tr>
		<tr>
			
			<td rowspan="2"><input type="submit" value="update"></td>
		</tr>	
	</table>
	</form>
</body>
</html>