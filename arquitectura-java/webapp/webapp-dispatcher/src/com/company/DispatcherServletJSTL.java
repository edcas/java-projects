package com.company;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DispatcherServletJSTL")
public class DispatcherServletJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String transformName = request.getParameter("name").toUpperCase();
		request.setAttribute("name", transformName);

		RequestDispatcher dispatcher = request.getRequestDispatcher("readerDispatcherServletJSTL.jsp");
		dispatcher.forward(request, response);

	}

}
