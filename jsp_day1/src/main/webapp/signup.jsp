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
	
	<form action="sig"  method="post">
	<table>
		<tr>
			<td>first name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		<tr>
			<td>last name</td>
			<td><input type="text" name="lname"></td>
		</tr>
		<tr>
			<td>age</td>
			<td><input type="number" name="age"></td>
		</tr>
		<tr>
			<td>email</td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td>address</td>
			<td><input type="text" name="address"></td>
		</tr>
		<tr>
			<td>Phno</td>
			<td><input type="number" name="phno"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			
			<td rowspan="2"><input type="submit" value="signup"></td>
		</tr>	
	</table>
	</form>
</body>
</html>