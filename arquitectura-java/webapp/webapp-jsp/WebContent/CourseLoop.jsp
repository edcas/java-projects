<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List, java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String java = "Java";
		String net = "Net";
		String php = "PHP";
		List<String> courses = new ArrayList<String>();
		courses.add(java);
		courses.add(net);
		courses.add(php);
	%>

	<% for (String course : courses) { %>
		<p><%= course %></p>
	<% } %>


</body>
</html>