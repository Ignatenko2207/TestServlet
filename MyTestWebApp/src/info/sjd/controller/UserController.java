package info.sjd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/user-controller")
public class UserController extends HttpServlet {
   
    public UserController() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String action = (String) request.getParameter("action");
		
		if(action.equals("create")){
			HttpSession session = request.getSession();
	    	session.setAttribute("title", "Create user");
	    	session.setAttribute("userLogin", "");
	    	session.setAttribute("userPassword", "");
	    	session.setAttribute("btn", "Create user");
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/user-action.jsp");
	    	dispatcher.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
