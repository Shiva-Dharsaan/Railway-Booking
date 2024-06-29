package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BookingCancel extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String booking=request.getParameter("bookingid");
		
		int booking_id=Integer.parseInt(booking);
		String status="CANCELED";
		  DatabaseConnection dc=new DatabaseConnection();
		  dc.deleteBooking(booking_id,status);
		  dc.deleteBookingTicket(booking_id, status);
		  int tickets_canceled=dc.getNoOfTickets(booking_id);
		  String dcomp_id=dc.deletedBookingCompartment(booking_id);
		  int seats_available=dc.getTicketsAvailable(dcomp_id);
		  int deleted_seats_update=seats_available+tickets_canceled;
		  dc.seatsUpdate(dcomp_id, deleted_seats_update);
		  String seat_type=dc.deletedBookingSeatType(booking_id);
		  if(seat_type.equals("LOWER"))
		  {
			  int lb_seats=dc.getLbTicketsAvailable(dcomp_id);
			  int updated_lb_seats=lb_seats+tickets_canceled;
			  dc.lbseatsUpdate(dcomp_id, updated_lb_seats);
		  }
		  else if(seat_type.equals("MIDDLE"))
		  {
			  int mb_seats=dc.getMbTicketsAvailable(dcomp_id);
			  int updated_mb_seats=mb_seats+tickets_canceled;
			  dc.mbseatsUpdate(dcomp_id, updated_mb_seats);
		  }
		  else if(seat_type.equals("UPPER"))
		  {
			  int ub_seats=dc.getUbTicketsAvailable(dcomp_id);
			  int updated_ub_seats=ub_seats+tickets_canceled;
			  dc.ubseatsUpdate(dcomp_id, updated_ub_seats);
		  }
		  PrintWriter out=response.getWriter();
		  out.print("Booking Canceled Successfully");
		
		
	}

	

}
