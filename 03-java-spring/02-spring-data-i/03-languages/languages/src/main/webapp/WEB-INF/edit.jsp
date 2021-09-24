<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Edit</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<a href="/delete/${language.id}">Delete</a> | <a href="/">Dashboard</a>
	
	<form:form action="/edit/${language.id }" method="POST" modelAttribute="language">
		<p>
			<form:label path="name">Name:</form:label>
			<form:errors path="name" />
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="creator">Creator:</form:label>
			<form:errors path="creator" />
			<form:input path="creator"/>
		</p>
		<p>
			<form:label path="currentVersion">Current Version:</form:label>
			<form:errors path="currentVersion" />
			<form:input path="currentVersion"/>
		</p>
		<button type="submit">Submit</button>
	</form:form>


</body>
</html>