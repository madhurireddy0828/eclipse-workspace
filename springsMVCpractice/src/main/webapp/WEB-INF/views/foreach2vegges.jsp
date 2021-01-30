<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!-- import the JavaServer Pages Standard Tag Library(jstl) tags -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vegetables</title>
</head>
<body>
${message }:<br>
<ol>
<c:forEach items="${liVeg }" var="vegItems">
<li>${vegItems}</li>
</c:forEach>
</ol>
<ul><c:forEach items="${liVeg }" var="vegItems"><li>${vegItems }</li></c:forEach></ul>
</body>
</html>