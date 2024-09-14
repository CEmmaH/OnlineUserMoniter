package com.emma.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/userserv")
public class UserMoniterServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		String key = request.getParameter("key");
		HttpSession session = request.getSession();
		//if user log out, destroy the session
		if(key != null && key.equals("logout")) {
			session.invalidate();
			return;
		}
		//create session
		int userNumber = (int)session.getServletContext().getAttribute("userNumber");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("<h1 style=\"text-align:center\">Welcome!</h1>");
		response.getWriter().write("<h2 style=\"text-align:center\">Current number of online users is "+userNumber+"</h2>");
		response.getWriter().write("<h2 style='text-align:center'><a href='userserv?key=logout'>log out</a> </h2>");
	}

}
