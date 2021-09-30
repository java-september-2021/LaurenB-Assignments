<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Top 10</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<div class="anchor">
		<a href="/dashboard">Dashboard</a>
	</div>
	<div class="header">
		<h3>Top Ten Songs:</h3>
	</div>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Rating</th>
				<th>Title</th>
				<th>Artist</th>
			</tr>
		</thead>
		<tbody>
			<tr>
			<c:forEach items="${allSongs}" var="song">
				<td>${song.rating}</td>
				<td><a href="/songs/${song.id}">${song.title}</a></td>
				<td>${song.artist }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>