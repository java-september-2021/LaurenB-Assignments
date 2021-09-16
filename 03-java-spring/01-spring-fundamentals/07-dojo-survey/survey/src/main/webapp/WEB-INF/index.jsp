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
	<form method="POST" action="/survey">
		<p>
			<label>Your Name</label>
			<input type="text" name="name">
		</p>
		<p>
			<label>Location</label>
			<select name="location">
				<option value="San Jose">San Jose</option>
				<option value="Oakland">Oakland</option>
				<option value="Seattle">Seattle</option>
				<option value="Dallas">Dallas</option>
			</select>
		</p>
		<p>
		<label>Favorite Language</label>
		<select name="language">
			<option name="Java">Java</option>
			<option name="Python">Python</option>
			<option name="React">React</option>
			<option name="C#">C#</option>
		</select>
		</p>
		<p>
			<label>Comments (Optional)</label>
			<textarea name="comment"></textarea>
		</p>
		<button>Submit</button>
	</form>
</body>
</html>