<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Create a Dojo</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<h1>Create Dojo</h1>
	<form:form method="POST" action="/dojo/createDojo" modelAttribute="dojo">
		<p>
		<form:label path="name"></form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
		<button>Create Dojo</button>
		</p>
	</form:form>
</body>
</html>