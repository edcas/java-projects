<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.company.model.Course"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Course c1 = new Course("Java", 1);
		Course c2 = new Course("Net", 1);
		Course c3 = new Course("PHP", 2);

		List<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
	%>
	
	<% for (Course course : courses) { %>
		<p>Course: <%= course.getName()%>, Level: <%= course.getLevel() %></p>
	<% } %>


</body>
</html>