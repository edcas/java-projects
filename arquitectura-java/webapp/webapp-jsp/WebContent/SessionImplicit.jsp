<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.company.model.Course"%>
<%@page import="com.company.service.CourseServiceSteroids"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		CourseServiceSteroids service = new CourseServiceSteroids();
		Course course = service.get(request.getParameter("name"));
	
		session.setAttribute("course", course);
	%>

	Added session
	
	<a href="ReaderSessionImplicit.jsp">Course</a>
</body>
</html>