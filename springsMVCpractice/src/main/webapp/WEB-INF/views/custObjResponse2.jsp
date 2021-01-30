<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer response</title>
</head>
<body>

<table border="3" cellpadding="10">
<tr>
<th>Name</th>
<th>Ph.No</th>
<th>City</th>
<th>State</th>
</tr>

<c:forEach items="${cus }" var="cust1">
<tr>
<td>${cust1.name }</td>
<td>${cust1.phno }</td>
<td>${cust1.city }</td>
<td>${cust1.state }</td>
</tr>
</c:forEach>
</table>

</body>
</html>