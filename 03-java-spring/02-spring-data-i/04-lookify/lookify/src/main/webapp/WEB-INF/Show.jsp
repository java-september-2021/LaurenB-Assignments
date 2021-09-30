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
	<link rel="stylesheet" href="/css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<div class="anchor">
		<a href="/dashboard">Dashboard</a>
	</div>
	<div class="subclass">
		<h3>Title:</h3>
		<h4 class="info">${song.title}</h4>
		<h3>Artist:</h3>
		<h4 class="info">${song.artist}</j4>
		<h3>Rating (1-10):</h3>
		<h4 class="info">${song.rating}</h4>
		<form action="/delete/${song.id}" method="POST">
			<input type="hidden" value="delete" name="_method"/>
			<button type="submit" class="bttn2">Delete</button>
		</form>
	</div>
</body>
</html>