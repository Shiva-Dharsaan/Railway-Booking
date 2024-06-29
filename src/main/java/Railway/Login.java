package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class Login extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String name=request.getParameter("loginid");
			String password=request.getParameter("password");
			
			DatabaseConnection d=new DatabaseConnection();
			
			if(d.loginCheck(name,password))
			{
				HttpSession session=request.getSession();
				session.setAttribute("username", name);
				response.sendRedirect("userOptions.jsp");
			}
			else
			{
				response.sendRedirect("userLogin.html");
			}
	}


}
