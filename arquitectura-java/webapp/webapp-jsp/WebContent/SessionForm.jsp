<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.company.model.Course"%>
<%@page import="com.company.service.CourseServiceSteroids"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		CourseServiceSteroids service = new CourseServiceSteroids();
		List<Course> courses = service.all();
	%>
	<form action="SessionImplicit.jsp">

		<select name="name">
			<% for (Course course : courses) { %>
				<option value="<%= course.getName() %>"><%= course.getName() %></option>
			<% }%>
		</select> <input type="submit" value="submit" />

	</form>
</body>
</html>