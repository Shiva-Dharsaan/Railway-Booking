package Railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Train extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String startpoint=request.getParameter("startpoint");
		String endpoint=request.getParameter("endingpoint");
		String departime=request.getParameter("departtime");
		String arrivaltime=request.getParameter("arrivaltime");
		String nofcompartments =request.getParameter("nofcompartments");
		
		int no_ofcompartments=Integer.parseInt(nofcompartments);
		
		TrainOld to=new TrainOld(startpoint,endpoint,departime,arrivaltime,no_ofcompartments);
		DatabaseConnection dc=new DatabaseConnection();
		dc.connectionWithTrain(to);
		
		PrintWriter out=response.getWriter();
		out.print("Train Created Successfully");
	
	}

}
