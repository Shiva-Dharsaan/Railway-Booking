package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TicketCancel extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ticket=request.getParameter("ticketid");
	    
		  int ticket_id=Integer.parseInt(ticket);
		  String status="CANCELED";
		  DatabaseConnection dc=new DatabaseConnection();
		  dc.deleteTicket(ticket_id,status);
		  String dcomp_id=dc.deletedTicketCompartment(ticket_id);
		  int dseats_available=dc.getTicketsAvailable(dcomp_id);
		  int deleted_seat_update=dseats_available+1;
		  dc.seatsUpdate(dcomp_id, deleted_seat_update);
		  String seat_type=dc.deletedSeatType(ticket_id);
		  if(seat_type.equals("LOWER"))
		  {
			  int lb_seats=dc.getLbTicketsAvailable(dcomp_id);
			  int updated_lb_seats=lb_seats+1;
			  dc.lbseatsUpdate(dcomp_id, updated_lb_seats);
		  }
		  else if(seat_type.equals("MIDDLE"))
		  {
			  int mb_seats=dc.getMbTicketsAvailable(dcomp_id);
			  int updated_mb_seats=mb_seats+1;
			  dc.mbseatsUpdate(dcomp_id, updated_mb_seats);
		  }
		  else if(seat_type.equals("UPPER"))
		  {
			  int ub_seats=dc.getUbTicketsAvailable(dcomp_id);
			  int updated_ub_seats=ub_seats+1;
			  dc.ubseatsUpdate(dcomp_id, updated_ub_seats);
		  }
		  
		  PrintWriter out=response.getWriter();
		  out.print("Ticket Canceled Successfully");
		
	}

}
