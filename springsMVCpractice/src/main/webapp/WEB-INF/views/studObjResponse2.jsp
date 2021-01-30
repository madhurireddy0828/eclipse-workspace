<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multi-student</title>
</head>
<body>
<h4>${message }</h4>
<table border="1" cellpadding="5">
<tr>
<th>Roll Number</th>
<th>First Name</th>
<th>Last Name</th>
<th>Department</th>
<th>Semester</th>
</tr>

<c:forEach items="${student }" var="stud">
<tr>

<td>${stud.roll }</td>
<td>${stud.fname }</td>
<td>${stud.lname }</td>
<td>${stud.dep }</td>
<td>${stud.sem }</td>
</tr>
</c:forEach>

</table>
</body>
</html>