package com.company.session.objects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CourseSessionServlet")
public class CourseSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Person person = (Person) session.getAttribute("person");

		if (request.getParameter("course") != null) {
			person.addCourse(request.getParameter("course"));
		}

		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");

		if (person != null) {

			for (String course : person.getCourses()) {

				pw.println("<p>" + course + "<p>");
			}
		} else {
			pw.println("The session is empty.");

		}

		pw.println("<a href='CourseForm.html'>back</a>");

		pw.println("</body>");
		pw.println("</html>");

	}

}
