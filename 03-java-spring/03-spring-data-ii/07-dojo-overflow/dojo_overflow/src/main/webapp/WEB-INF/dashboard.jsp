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
<table class="table table-bordered">
	<thead>
		<tr>
			<th>Question</th>
			<th>Tags</th>
		</tr> 
	<tbody> 
		<c:forEach items="${allquestions }" var ="question">
		<tr>
			<td><a href="/show/${question.id}">${question.question}</a></td>
			<c:forEach items="${question.tags }"  var="tag">
			<p>${tag.subject }</p>
			</c:forEach>
		</tr>
		</c:forEach>
	</tbody>
	</thead>
</table>
</body>
</html>