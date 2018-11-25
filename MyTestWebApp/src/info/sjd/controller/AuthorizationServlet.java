package info.sjd.controller;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpHandler;

import info.sjd.entity.User;
import info.sjd.service.UserService;

@SuppressWarnings("serial")
@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
    	
    	String userLogin = (String) request.getParameter("login");
    	String userPass = (String) request.getParameter("user_pass");

		User user = UserService.findOne(userLogin);
		if(user != null && user.getPassword().equals(userPass)) {
			response.sendRedirect("jsp/user-list.jsp");
		} else{
			response.sendRedirect("jsp/wrongindex.jsp");
		}
		
		
	}

	private String createToken() {
		// TODO Auto-generated method stub
		return null;
	}

}
