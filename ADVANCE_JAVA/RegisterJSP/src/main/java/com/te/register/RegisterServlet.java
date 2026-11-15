package com.te.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String state = req.getParameter("state");

		resp.setContentType("text/html");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
			PreparedStatement prepareStatement = connection
					.prepareStatement("insert into loginregister values(?,?,?,?,?)");
			prepareStatement.setString(1, name);
			prepareStatement.setString(2, email);
			prepareStatement.setString(3, password);
			prepareStatement.setString(4, gender);
			prepareStatement.setString(5, state);

			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate);

			if (executeUpdate > 0) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
				requestDispatcher.include(req, resp);
			}

		} catch (ClassNotFoundException | SQLException e) {

			PrintWriter printWriter=resp.getWriter();
			printWriter.print("<h4 style='color:red'>Exception Occured</h4>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp" + e.getMessage());
			requestDispatcher.forward(req, resp);
		}

	}

}
