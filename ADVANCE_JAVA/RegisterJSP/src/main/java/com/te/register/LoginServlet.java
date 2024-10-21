package com.te.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("username");
		String password = req.getParameter("password");

		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
			PreparedStatement prepareStatement = connection
					.prepareStatement("select name from loginregister where email=? and password=?");
			prepareStatement.setString(1, email);
			prepareStatement.setString(2, password);
			ResultSet executeQuery = prepareStatement.executeQuery();

			if (executeQuery.next()) {
				String name = executeQuery.getString(1);
				req.setAttribute("name", name);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
				requestDispatcher.include(req, resp);
			} else {
				printWriter.print("<h4 style='color:red'>Account is not Available</h4>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
				requestDispatcher.include(req, resp);
			}

		} catch (ClassNotFoundException | SQLException e) {

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp" + e.getMessage());
			requestDispatcher.forward(req, resp);
		}

	}

}
