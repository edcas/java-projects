<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="name" value="John Doe"></c:set>

	<p>
		My name is
		<c:out value="${ name }"></c:out>
	</p>

	<c:remove var="name"></c:remove>

	<p>
		My name is
		<c:out value="${ name }"></c:out>
	</p>
</body>
</html>