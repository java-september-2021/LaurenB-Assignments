<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Product Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
	<h1><c:out value="${product.name}"/></h1>
	<c:out value="${product.description}" />
	<c:out value="${product.price }" />
	<hr>
	<h2>Categories</h2>
	<ul>
	<c:forEach items="${product.categories}" var="category" >
		<li>${category.name}</li>
	</c:forEach>
	</ul>
	<form method="POST" action="/addCategoryToProduct/${product.id }">
		<select name="cateogry">
		<c:forEach items="${notinProduct}" var="category">
			<option value="${category.id }">${category.name}</option>
		</c:forEach>
		</select>
		<button>Add Category</button>
	</form>
</body>
</html>