package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CompartmentType extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String compartment_type=request.getParameter("compartmenttype");
		String seats=request.getParameter("noofseats");
		String cprice =request.getParameter("price");
	
		int no_of_seats=Integer.parseInt(seats);
		double price=Double.parseDouble(cprice);
		
		CompartmentTypeOld ct=new CompartmentTypeOld(compartment_type,no_of_seats,price);
		DatabaseConnection dc=new DatabaseConnection();
		dc.connectionWithCompartmentType(ct);
		
		PrintWriter out=response.getWriter();
		out.print("Compartment Type Added Successfully");
		
	}

}
