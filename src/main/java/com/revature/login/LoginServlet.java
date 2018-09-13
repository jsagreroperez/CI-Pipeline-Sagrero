package com.revature.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
  	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  	 */
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		request.getRequestDispatcher("login.html").forward(request, response);
  	}

  	/**
  	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  	 */
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		String user=request.getParameter("username");
  		String pass=request.getParameter("password");
  		
  		//HttpSession session = request.getSession();
  		System.out.println("user = "+ user + " password = "+ pass);
  		if((user.equals("revature")) && (pass.equals("password"))) {
  			System.out.println("redirecting to success");
  			response.sendRedirect("success.html");
  		}
  		else {
  			response.sendRedirect("failure.html");
  		}
  	}

}
