<%@taglib 
uri="http://www.springframework.org/tags/form" 
prefix="form"%>

<html>
<body>
<jsp:include page="header.jsp"/>
	
	<h1>Change Password Page</h1>
	<font color="Red">${msg}</font>    
		<form:form action="changePassword" method = "POST" >
		<table>
		
		<tr>
			<td><label id="passwordOLbl">Old password:</label></td>
			<td><input type="password" name="password"><td/>
		</tr>
		<tr>
			<td><label id="passwordNLbl">New password:</label></td>
			<td><input type="password" name="password"><td/> 
		</tr>
		<tr>
			<td><label id="passwordCLbl">Confirm password:</</label></td>
			<td><input type="password" name="password"><td/> 
		</tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
	 		<tr>	    
			<td colspan="2" align="center">
			<input type="submit" value="Change password"></td>	
		</tr>
		</table>
		</form:form>
</body>
</html>