<%@page import="dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
		table {
	position: absolute;
	top: 250px;
	left: 300px;
	
}
</style>
</head>
<body>
<%List<Student> list=(List)request.getAttribute("stu"); %>
<table border="2px solid red">
	<tr>
		<th>Id</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Age</th>
		<th>Address</th>
		<th>Phone number</th>
		<th>Email</th>
		<th>Password</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<%for(Student s:list) {%>
	<tr>
	
		<td><%=s.getId() %></td>
		<td><%= s.getFirstName()%></td>
		<td><%=s.getLastName() %></td>
		<td><%= s.getAge()%></td>
		<td><%=s.getAddress() %></td>
		<td><%=s.getPhno() %></td>
		<td><%=s.getEmail() %></td>
		<td><%=s.getPassword() %></td>
		<td><a href="update?id=<%=s.getId()%>"><button>update</button></a></td>
		<td><a href="delete?id=<%=s.getId()%>"><button>Delete</button></a></td>
	</tr>
	<%} %>
</table>
</body>
</html>