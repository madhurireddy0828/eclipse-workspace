<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee details</title>
</head>
<body>
<h5>${message }</h5>
<table border="1" cellpadding="10">
<tr>
<th>ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
<th>Salary</th>
</tr>

<c:forEach items="${eList }" var="emps1">
<tr>
<td>${emps1.id }</td>
<td>${emps1.fname }</td>
<td>${emps1.lname }</td>
<td>${emps1.age }</td>
<td>${emps1.salary }</td>
</tr>
</c:forEach>


</table>
</body>
</html>