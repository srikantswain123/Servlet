package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get printwriter
		PrintWriter pw=null;
		pw=res.getWriter();
		//set response contenet type
		res.setContentType("text/html");
		int code=0;
		code=Integer.parseInt(req.getParameter("country"));
		String capital[]= {"NEW DELHI","ISLAMABAD","BEJING","WASHINGTON DC","COLOMBO"};
		pw.println("<h1 style='color:blue;text-align:center'>"+capital[code]+"</h1>");
		pw.println("<a href='form.html'>home</a>");
		
		
		
		
		
		
		
		
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}

}
