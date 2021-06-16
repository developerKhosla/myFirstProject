package com.mehta;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 */
@WebServlet(name = "Demo", urlPatterns = { "/Hello" })
public class Hello extends HttpServlet {
	
    public Hello() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//commented for testing
		//i am shivam
		//test
		//new branch
		response.setContentType("text/html");	
		PrintWriter out=response.getWriter();		
		out.print("<html><body>");
		out.print("<h3> Hello Servlet </h3>");
		out.print("</body></html>");

	}																			

}
