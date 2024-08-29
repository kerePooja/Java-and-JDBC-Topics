package com.telusko;

import java.io.PrintWriter;
import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

		//private static final long serialVersionUID = 1L;

		public void Service(HttpServletRequest req, HttpServletResponse res) throws IOException 
		{
			int i=Integer.parseInt(req.getParameter("num1"));
			int j=Integer.parseInt(req.getParameter("num2"));
			
			int k= i+j;
			
			PrintWriter out=res.getWriter();
			out.println("result is "+k);
			
		}
	}


//not use this System.out.println("result is "+k);