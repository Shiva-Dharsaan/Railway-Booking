package Railway;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class createAccount extends HttpServlet {

	protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String userid=request.getParameter("userid");
		String password =request.getParameter("upassword");
		
		LoginOld ld=new LoginOld(userid,name,password,email,mobile);
		DatabaseConnection dc=new DatabaseConnection();
		dc.connectionWithLogin(ld);
		
		PrintWriter out=response.getWriter();
		out.print("Account Created Successfully");
		
		
	}

	

}
