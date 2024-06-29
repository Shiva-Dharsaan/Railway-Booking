package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Station extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stationname=request.getParameter("station");
		String stationid=request.getParameter("stationid");
		String stationlocation=request.getParameter("stationlocation");
		String platforms=request.getParameter("noofplatforms");
		
		int no_of_platforms=Integer.parseInt(platforms);
		
		StationOld sd=new StationOld(stationid,stationlocation,stationname,no_of_platforms);
		DatabaseConnection dc=new DatabaseConnection();
		dc.connectionWithStation(sd);
		
		PrintWriter out=response.getWriter();
		out.print("Station Created Successfully");
		
		
	}


	

}
