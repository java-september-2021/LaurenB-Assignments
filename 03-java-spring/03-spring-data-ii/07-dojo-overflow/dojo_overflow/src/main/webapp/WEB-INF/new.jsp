<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Question</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<form:form method="POST" action="/newQuestion" modelAttribute="question">
	<p>
		<form:label path="question">Question</form:label>
		<form:errors path="question" />
		<form:textarea path="question" />
	</p>
	<p>
		<form:label path="tagsFromFront">tags</form:label>
		<form:errors path="tagsFromFront" />
		<form:input path="tagsFromFront" />
	</p>
	<button>Submit Question</button>
	</form:form>
</body>
</html>