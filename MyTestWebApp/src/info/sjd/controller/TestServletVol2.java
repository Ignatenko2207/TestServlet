package info.sjd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info.sjd.service.SomeService;

@WebServlet("/test-servlet-2")
public class TestServletVol2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	if (request.getParameter("action").equals("someAction")) {
    		String name = request.getParameter("userName");
    		String pass = request.getParameter("userPassword");
    		
    		String outText = SomeService.getSomeMopdifiedTextVol2(name, pass);
    		response.getWriter().append(outText);
		} 
    	else {
    		response.getWriter().append("Something went wrong!");
		}
    	
    	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
