<!DOCTYPE html>
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
	<% String m=(String)request.getAttribute("message");
	if(m!=null){ %>
	<h3><%= m %></h3>
	<% } %>
	<form action="log" method="post">
	<table>
			<tr>
			<td>mail</td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="LogIn"></td>
		</tr>
	</table>
	</form>
</body>
</html>