package com.company.session.objects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PersonSessionServlet")
public class PersonSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		String name = request.getParameter("name");
		Person p = new Person(name);
		session.setAttribute("person", p);

		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("Recorded person :" + p.getName());
		pw.println("<a href='CourseForm.html'>Course Form</a>");
		pw.println("</body>");
		pw.println("</html>");

	}

}
