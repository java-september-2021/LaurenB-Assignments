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
<h1>${question.question}</h1>
<p>
	<c:forEach items="${question.tags }" var ="tag">
		${tag.subject },
	</c:forEach>
</p>
<hr>
<h2>Answers</h2>
<ul>
<c:forEach items="${question.answers }" var="answer">
	<li>${answer.answer }</li>
</c:forEach>
</ul>
<hr>
<h3>Add an Answer</h3>
<form:form method="POST" action="/addAnswer" modelAttribute="answer">
	<p>
		<form:label path="answer">Answer:</form:label>
		<form:errors path="answer" />
		<form:input path ="answer" />
		<form:hidden path="question" value="${question.id }"/>
	</p>
	<button>Add Answer</button>
</form:form>
</body>
</html>