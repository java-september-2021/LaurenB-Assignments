<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojo Details</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
<h1><c:out value="${dojo.name}"/>Location Ninjas</h1>
<table>
	<thead>
		<tr>
			<th>First Name:</th>
			<th>Last Name:</th>
			<th>Age:</th>
		</tr>
	</thead>
	<tbody>
		<tr>
		<c:forEach items="${dojo.ninjas }" var = "ninja">
		<td><c:out value="${ninja.firstName}"}/></td>
		<td><c:out value="${ninja.lastName}"}/></td>
		<td><c:out value="${ninja.age}"}/></td>
		</c:forEach>
		</tr>
	</tbody>
</table>
</body>
</html>