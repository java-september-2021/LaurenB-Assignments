<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Category Details</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css">
	<script src="/js/main.js"></script>
</head>
<body>
<h1><c:out value="${category.name }"/></h1>
<hr>
<h2>products</h2>
<ul>
 <c:forEach items="${category.products}" var = "products">
 	<li>${product.name} | ${product.description } | ${product.price }</li>
 </c:forEach>
 </ul>
 <form method="POST" action="/addProductToCategory/${category.id }">
		<select name="product">
		<c:forEach items="${notinCategory}" var="product">
			<option value="${product.id }">${product.name}</option>
		</c:forEach>
		</select>
		<button>Add Product</button>
</form>
</body>
</html>