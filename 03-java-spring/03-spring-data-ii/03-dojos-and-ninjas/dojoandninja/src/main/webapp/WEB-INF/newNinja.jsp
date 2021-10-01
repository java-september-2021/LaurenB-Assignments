<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Create New Ninja</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<form:form method="POST" action="/ninja/createNinja" modelAttribute="ninja">
		<p>
		<form:label path="dojo"></form:label>
		<form:errors path="dojo"/>
		<form:select path="dojo"/>
		<c:forEach items="${allDojos}" var="dojo">
			<option value="${dojo.id}">${dojo.name}</option>
		</c:forEach>
		<p>
		<form:label path="firstName">First Name:</form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>
		</p>
		<p>
		<form:label path="lastName">Last Name:</form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
		</p>
		<p>
		<form:label path="age">Age:</form:label>
		<form:errors path="age"/>
		<form:input path="age"/>
		</p>
		<p>
		<button>Create Ninja</button>
		</p>
	</form:form>
</body>
</html>