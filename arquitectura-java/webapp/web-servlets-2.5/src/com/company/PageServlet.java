package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageServlet
 */
public class PageServlet extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int max = Integer.parseInt(request.getParameter("max"));
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		
		for(int i = 0; i < max; i++) {
			writer.println("<p>Hello</p>");
		}
		
		writer.println("</body>");
		writer.println("</html>");
		
	}

}
