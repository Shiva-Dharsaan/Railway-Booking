package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MapTrainVsStation extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String station_id=request.getParameter("stationid");
		String train=request.getParameter("trainid");
		String arrivaltime=request.getParameter("arrivaltime");
	
		int train_id=Integer.parseInt(train);
		
		
		MapTrainVsStationOld mp=new MapTrainVsStationOld(station_id,train_id,arrivaltime);
		DatabaseConnection dc=new DatabaseConnection();
		dc.connectionWithTs(mp);
		
		PrintWriter out=response.getWriter();
		out.print("Train and Station Mapped Successfully");
	
	}


}
