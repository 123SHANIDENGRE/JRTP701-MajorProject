package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/wishurl")
public class WishMessageServlet extends HttpServlet {


  

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		//set response content type
		res.setContentType("text/html");
		//get PrintWriter
		PrintWriter pw=res.getWriter();
		//write the message to response object
		pw.println("<h1 style='color:red;text-align:center'> Good Morning </h1>");
		//home hyperlink
		pw.println("<br><br><a href='index.jsp'>home</a>");
		//close stream
		pw.close();
		
		
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
