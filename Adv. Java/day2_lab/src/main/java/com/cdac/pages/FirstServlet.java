package com.cdac.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
/*WC creates an empty HAshMap(at application deployment time)
 * to maintain the request mappings
 * Key-/test1
 * value-
 */


@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		System.out.println("inside init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("inside destroy");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside doGet");
		// 1.set res content type
		response.setContentType("text/html");
		// 2.get PrintWriter to send text resp
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5>Welcome to servlet @ server time : "
		+ LocalDateTime.now() + "</h5>");//resp is added to the buffer of PW
		}//JVM(Web Container)-pw.close()-->resp content(resp body) -->WC-->WS-->send it the web client

	}

}
