  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
 <jsp:include page="header.jsp"/>
 
 <a href="changePassword">Change Password</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <a href="UpdateProfile">Update Profile</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 
 <h2>Profile Details</h2>
<br/><br/>
<font color="red"> ${msg}</font>

<jsp:include page="emp.jsp"/>

 </body>
 </html>
 <!--  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
 
 <h2>Profile Details</h2>
<br/><br/>
<font color="red"> ${msg}</font>

 <table border="1" width="30%">
		<tr>
			<td width="15%"><label id="idLbl">ID</label></td> 
			<td width="15%"> ${emp.id}</td>
		</tr>
		
		<tr>
			<td><label id="fNameLbl">First Name</label></td> <td> ${emp.name}</td>
		</tr>
		
		<tr>
			<td><label id="lNameLbl">Last Name</label></td> <td> ${emp.lName}</td>
		</tr>
		
		<tr>
			<td><label id="lNameLbl">Age</label></td> <td> ${emp.age}</td>
		</tr>
		
		<tr>
			<td><label id="salLbl">Salary</label> </td> <td> ${emp.salary}</td>
		</tr>
		
		<tr>
			<td><label id="loginLbl">Login Name</label> </td> <td> ${emp.loginName}</td>
		</tr>
		
		<tr>
			<td><label id="loginLbl">Email</label> </td> <td> ${emp.email}</td>
		</tr>
		
  	</table>

 </body>
 </html>
-->

    
    