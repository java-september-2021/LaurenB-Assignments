<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Details</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<a href="/">Dashboard</a>
	
	<p><c:out value="${thisLang.name }" /></p>
	<p><c:out value="${thisLang.creator}" /></p>
	<p><c:out value="${thisLang.currentVersion}" /></p>
	
	<p><a href="/edit/${thisLang.id}">Edit</a> | <a href="/delete/${thisLang.id}">Delete</a></p>
</body>
</html>