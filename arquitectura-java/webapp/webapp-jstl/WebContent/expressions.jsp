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
	<c:if test="${ param.number >= 5 }">
		<p>Approved</p>
	</c:if>

	<c:if test="${ param.number < 5 }">
		<p>Suspended</p>
	</c:if>

	<c:choose>
		<c:when test="${ param.number >= 5 }">
			<p>Choose: Approved</p>
		</c:when>
		
		<c:otherwise>
			<p>Choose: Suspended</p>
		</c:otherwise>
	</c:choose>
</body>
</html>