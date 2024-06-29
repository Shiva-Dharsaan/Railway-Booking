package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BerthType extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String berth_type=request.getParameter("berthtype");
		String seats=request.getParameter("noofseats");
		String comp_type =request.getParameter("comptype");
	
		int no_of_seats=Integer.parseInt(seats);
		
		BerthTypeOld bt=new BerthTypeOld(berth_type,no_of_seats,comp_type);
		DatabaseConnection dc=new DatabaseConnection();
		dc.connectionWithBerth(bt);
		
		PrintWriter out=response.getWriter();
		out.print("Berth Type Added Successfully");
	
		
	}

	

}
