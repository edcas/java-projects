package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(urlPatterns = { "/HelloServlet" }, initParams = {
		@WebInitParam(name = "start", value = "5", description = "Request start") })
public class HelloServlet extends HttpServlet {

	private int start;

	@Override
	public void init(ServletConfig config) throws ServletException {
		start = Integer.parseInt(config.getInitParameter("start"));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		writer.println(start);
		start++;
		writer.close();

	}

}
