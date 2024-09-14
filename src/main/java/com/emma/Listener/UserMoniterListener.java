package com.emma.Listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class UserMoniterListener implements HttpSessionListener{
	private int userNumber = 0;
	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		// user number add 1
		userNumber++;
		//save userNumber into servletContext object
		httpSessionEvent.getSession().getServletContext().setAttribute("userNumber", userNumber);
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		//user number minus 1
		userNumber--;
		//save userNumber into servletContext object
		httpSessionEvent.getSession().getServletContext().setAttribute("userNumber", userNumber);
	}

}
