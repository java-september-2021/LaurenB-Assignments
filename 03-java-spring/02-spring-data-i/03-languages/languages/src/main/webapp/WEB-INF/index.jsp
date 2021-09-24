<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Languages</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<table class="table table-bordered table-striped">
		<thead> 
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allLanguages}" var='lang'>
				<tr>
					<td><a href="/show/${lang.id}">${lang.name}</a></td>
					<td>${lang.creator }</td>
					<td>${lang.currentVersion }</td>
					<td><a href="/edit/${lang.id}">Edit</a> | <a href="/delete/${lang.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form:form action="/" method="POST" modelAttribute="language">
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