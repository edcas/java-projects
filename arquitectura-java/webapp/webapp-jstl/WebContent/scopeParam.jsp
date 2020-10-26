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

<c:out value="${ param.name }"></c:out>

<c:set var="name" value="${ param.name }" scope="session"></c:set>

<a href="readerScope.jsp">Session data</a>
</body>
</html>