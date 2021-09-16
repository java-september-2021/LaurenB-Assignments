<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<h1>Submitted Info</h1>
	<p>Name: <c:out value="${name }"/></p>
	<p>Location: <c:out value="${location}"/></p>
	<p>Language: <c:out value="${language}"/></p>
	<p>Comment: <c:out value="${comment}"/></p>
	<a href="/">Go Back</a>
</body>
</html>