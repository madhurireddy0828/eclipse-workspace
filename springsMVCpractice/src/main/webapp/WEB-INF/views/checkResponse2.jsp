<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!-- import the JavaServer Pages Standard Tag Library(jstl) tags -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>check2</title>
</head>
<body>
<h6>&nbsp;if condition check</h6>

<c:if test="${id >= 1000 && id <= 1010}">
		Valid Id...
</c:if><br>

<c:if test="${ age>=18 && age<=60  }">Valid Age</c:if><br>
<c:if test="${not empty name }">Name is not Empty</c:if><br>




<c:if test="${id <= 1000 || id >= 1010 }">
		Invalid Id, Id should be between 1000 to 1010.
</c:if><br>
<c:if test="${age<18 || age>60 }">Invalid Age</c:if><br>
<c:if test="${empty name }">Name is Empty</c:if><br>



</body>
</html>