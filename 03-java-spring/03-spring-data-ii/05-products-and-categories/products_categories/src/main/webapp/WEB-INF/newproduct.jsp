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
	<h1>New Product</h1>
	<form method="POST" actions="/products/new">
		<p>
			<label for="name">Name</label>
			<input type="text" name="name">
		</p>
		<p>
			<label for="description">Description</label>
			<textarea name="desc"></textarea>
		</p>
		<p>
			<label for="price">Price</label>
			<input type="number" name="price" step="0.01">
		</p>
		<button type="submit">Create</button>
	</form>

</body>
</html>