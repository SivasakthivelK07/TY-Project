package com.te.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int sum = i + j;
		
		req.setAttribute("sq", sum);
		RequestDispatcher dispatcher = req.getRequestDispatcher("sq");
		dispatcher.forward(req, resp);
		
		
		
//		PrintWriter printWriter=resp.getWriter();
//		printWriter.println(sum);

		
	}

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		
//		int sum=i+j;
//		
//		PrintWriter printWriter=res.getWriter();
//		printWriter.println(sum);
//	}

}
