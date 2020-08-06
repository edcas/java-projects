<%@page import="com.company.service.CourseService"%>
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
		CourseService courseService = new CourseService();
		List<Course> courses = courseService.all();
	%>
	
	<% for (Course course : courses) { %>
		<p><%= course.getName() %>,<%= course.getLevel() %></p>
	<% } %>


</body>
</html>