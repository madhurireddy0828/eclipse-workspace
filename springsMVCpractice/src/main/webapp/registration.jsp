<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="./register" method="get">
<table>
				<tr>
					<td>Enter Employee ID :</td>
					<td><input type="text" name="employee_id" /></td>
				</tr>
				<tr>
					<td>Enter First Name :</td>
					<td><input type="text" name="first_name" /></td>
				</tr>
				<tr>
					<td>Enter Last Name :</td>
					<td><input type="text" name="last_name" /></td>
				</tr>
				<tr>
					<td>Enter Password :</td>
					<td><input type="text" name="password" /></td>
				</tr>
				<tr>
					<td>Enter Age :</td>
					<td><input type="text" name="age" /></td>
				</tr>
			</table>
			<input type="submit" name="Resister" value="Register" />
			</form>
</body>
</html>
<!-- </head>
<body>
 	<br/><br/>
	<h1>Registration Form</h1>
	<form action="./register" method="post">
	<br />
	Enter Employee ID :
	 <input type="text" name="userID"/>
	<br />
	Enter First Name :
	 <input type="text" name="userFName"/>
	<br />
	Enter Last Name :
	 <input type="text" name="userLName"/>
	<br />
	Enter Password :
	 <input type="password" name="password"/>
	<br />
	Enter Password :
	 <input type="password" name="password"/>
	<br />
	<input type="submit" name="Register" value="Register" />
 	</form>

</body>
</html>

 -->