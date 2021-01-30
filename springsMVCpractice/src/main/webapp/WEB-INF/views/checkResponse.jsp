<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!-- import the JavaServer Pages Standard Tag Library(jstl) tags -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>check</title>
</head>
<body>
<h6>&nbsp;if condition check</h6>

<c:if test="${age lt 18 || age gt 60 }">
Age should be between 18 to 60
</c:if><br>

<c:if test="${age >=18 && age<=60 }">
Valid Age
</c:if><br>


<c:if test="${empty name}">
Name is empty
</c:if>

<c:if test="${not empty name}">
Name is not empty
</c:if>


</body>
</html>