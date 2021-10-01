<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Create New License</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<h1>Create a New License</h1>
	<form:form method="POST" action="/newlicense" modelAttribute="license">
		<p>
			<form:label path="person">Select Person</form:label>
			<form:errors  path="person"/>
			<form:select path="person">
			<c:forEach items="${people}" var= "person">
				<option value="${person.id }">${person.firstName} ${person.lastName }</option>
			</c:forEach>
			</form:select>
		</p>
		
		<p>
			<form:label path="expirationDate">Expiration Date</form:label>
			<form:errors path="expirationDate" />
			<form:input type="date" path="expirationDate" />
		</p>
		<p>
			<form:label path="state">State</form:label>
			<form:errors path="state" />
			<form:input path="state" />
		</p>
		<button>Add License</button>
	</form:form>
</body>
</html>