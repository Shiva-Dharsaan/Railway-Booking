package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Compartment extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comp_id=request.getParameter("compartmentid");
		String seats=request.getParameter("seatsavailable");
		String train=request.getParameter("trainid");
		String comp_type=request.getParameter("comptype");
		String lbseats =request.getParameter("lbseats");
		String mbseats =request.getParameter("mbseats");
		String ubseats =request.getParameter("ubseats");
		
		int seats_available=Integer.parseInt(seats);
		int train_id=Integer.parseInt(train);
		int lb_seats_available=Integer.parseInt(lbseats);
		int mb_seats_available=Integer.parseInt(mbseats);
		int ub_seats_available=Integer.parseInt(ubseats);
		
		CompartmentsOld co=new CompartmentsOld(comp_id,seats_available,train_id,comp_type,lb_seats_available,mb_seats_available,ub_seats_available);
		DatabaseConnection dc=new DatabaseConnection();
		dc.connectionWithCompartments(co);
		
		PrintWriter out=response.getWriter();
		out.print("Compartment Added to Train Successfully");
		
	}

	

}
