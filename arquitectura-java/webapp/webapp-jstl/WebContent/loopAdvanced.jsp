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

	<%
		String[] messages = new String[] { "Hello", "Hi", "Bye" };
		pageContext.setAttribute("messages", messages);
	%>

	<c:forEach var="message" items="${ messages }">
		<p>${ message }</p>
	</c:forEach>

</body>
</html>