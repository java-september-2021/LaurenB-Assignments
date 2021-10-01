<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Person and License</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<h1>Person and License</h1>
	<hr>
	<a href="/persons/new">Create a Person</a> | <a href="/licenses/create">Create License</a>
	<hr>
	<table class="table table bordered">
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${persons}" var="person">
			<tr>
				<td>${person.id}</td>
				<td>${person.firstName}</td>
				<td>${person.lastName}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>