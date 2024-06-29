package Railway;
import java.sql.*;


public class DatabaseConnection {
	void connectionWithStation(StationOld sd) 
	{   
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    		PreparedStatement stmt=con.prepareStatement("insert into station values(?,?,?,?)");  
    		stmt.setString(1,sd.getStation_id());
    		stmt.setString(2,sd.getLocation());  
    		stmt.setString(3,sd.getStation_name()); 
    		stmt.setInt(4,sd.getNo_of_platforms());
    		System.out.println("1");
    		
    		
    		
    		int i=stmt.executeUpdate();  
    		System.out.println(i+" records inserted");  
    		
    		con.close();
    	}
    	catch (Exception e) {
			 //TODO: handle exception
    		  System.out.println(e.getMessage());
		}
		  
		
		  
		
	}
    void connectionWithTrain(TrainOld to) 
	{   
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    		PreparedStatement stmt=con.prepareStatement("insert into train (StartingPoint,EndingPoint,DepartingTime,ArrivalTime,CompartmentNos)values(?,?,?,?,?)");  
    		stmt.setString(1,to.getStarting_location());  
    		stmt.setString(2,to.getEnding_location()); 
    		stmt.setString(3,to.getDeparting_time());
    		stmt.setString(4,to.getArrival_time());
    		stmt.setInt(5,to.getNo_of_compartments());
    		
    		System.out.println("1");
    		
    		
    		
    		int i=stmt.executeUpdate();  
    		System.out.println(i+" records inserted");  
    		
    		con.close();
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		  System.out.println(e.getMessage());
		}
	}
    	
    	void connectionWithCompartmentType(CompartmentTypeOld ct) 
    	{   
        	try {
        		Class.forName("com.mysql.cj.jdbc.Driver");
        		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
        		PreparedStatement stmt=con.prepareStatement("insert into compartmenttype values(?,?,?)");  
        		stmt.setString(1,ct.getCompartment_type());
        		stmt.setInt(2,ct.getNo_of_seats());  
        		stmt.setDouble(3,ct.getPrice_of_seats()); 
        		System.out.println("1");
        		
        		
        		
        		int i=stmt.executeUpdate();  
        		System.out.println(i+" records inserted");  
        		
        		con.close();
        	}
        	catch (Exception e) {
    			// TODO: handle exception
        		  System.out.println(e.getMessage());
    		}
    		  
    		
    		  
    	}
    	void connectionWithBerth(BerthTypeOld bt) 
    	{   
        	try {
        		Class.forName("com.mysql.cj.jdbc.Driver");
        		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
        		PreparedStatement stmt=con.prepareStatement("insert into berth values(?,?,?)");  
        		stmt.setString(1,bt.getBerth_type());
        		stmt.setInt(2,bt.getNo_of_seats());  
        		stmt.setString(3,bt.getCompartment_type()); 
        		System.out.println("1");
        		
        		
        		
        		int i=stmt.executeUpdate();  
        		System.out.println(i+" records inserted");  
        		
        		con.close();
        	}
        	catch (Exception e) {
    			// TODO: handle exception
        		  System.out.println(e.getMessage());
    		}
    		  
    		
    		  
    	}
    	void connectionWithCompartments(CompartmentsOld co) 
    	{   
        	try {
        		Class.forName("com.mysql.cj.jdbc.Driver");
        		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
        		PreparedStatement stmt=con.prepareStatement("insert into compartments values(?,?,?,?,?,?,?)");  
        		stmt.setString(1,co.getCompartment_id());
        		stmt.setInt(2,co.getSeats_available());  
        		stmt.setInt(3,co.getTrain_id()); 
        		stmt.setString(4,co.getCompartment_type());
        		stmt.setInt(5,co.getLbseats_available());
        		stmt.setInt(6,co.getMbseats_available());
        		stmt.setInt(7,co.getUbseats_available());
        		System.out.println("1");
        		int i=stmt.executeUpdate();  
        		System.out.println(i+" records inserted");  
        		
        		con.close();
        	}
        	catch (Exception e) {
    			// TODO: handle exception
        		  System.out.println(e.getMessage());
    		}
        	
    		  
    		
    		  
    	}
    	void connectionWithTs(MapTrainVsStationOld mp) 
    	{   
        	try {
        		Class.forName("com.mysql.cj.jdbc.Driver");
        		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
        		PreparedStatement stmt=con.prepareStatement("insert into trainvsstation (StationId,TrainId,ArrivalTime)values(?,?,?)");  
        		stmt.setString(1,mp.getStation_id());  
        		stmt.setInt(2,mp.getTrain_id()); 
        		stmt.setString(3,mp.getArrival_time());
        		
        		System.out.println("1");
        		
        		
        		
        		int i=stmt.executeUpdate();  
        		System.out.println(i+" records inserted");  
        		
        		con.close();
        	}
        	catch (Exception e) {
    			// TODO: handle exception
        		  System.out.println(e.getMessage());
    		}
    	}
        void connectionWithLogin(LoginOld ld) 
    		{   
    	    	try {
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("insert into login values(?,?,?,?,?)");  
    	    		stmt.setString(1,ld.getLoginId());  
    	    		stmt.setString(2,ld.getPassword()); 
    	    		stmt.setString(3,ld.getName());
    	    		stmt.setString(4,ld.getMobile());
    	    		stmt.setString(5,ld.getEmail());
    	    		
    	    		System.out.println("1");
    	    		
    	    		
    	    		
    	    		int i=stmt.executeUpdate();  
    	    		System.out.println(i+" records inserted");  
    	    		
    	    		con.close();
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
    		}
    	    
        boolean loginCheck(String loginid,String password)
        {
        	try {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
	    		PreparedStatement stmt=con.prepareStatement("select * from login where LoginId=? and UPassword=?");  
	    		stmt.setString(1,loginid);  
	    		stmt.setString(2,password); 
	    		ResultSet rs=stmt.executeQuery();
	    		if(rs.next()) {
	    			
	    			return true;
	    		}
	    		else
	    		{
	    			System.out.println("!!!Check your username or password!!!");
	    		}
	    	   
	    		con.close();
	
	    	}
	    	catch (Exception e) {
				// TODO: handle exception
	    		  System.out.println("!!!Check your username or password!!!");
			}
        	return false;
        }
        
        public void chooseTrain(String source,String destination,String date)
        {
        	try {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
	    		PreparedStatement stmt=con.prepareStatement("select * from train where StartingPoint=? and EndingPoint=? and Date(Departingtime)=?");  
	    		stmt.setString(1,source);  
	    		stmt.setString(2,destination); 
	    		stmt.setString(3,date);
	    		ResultSet rs=stmt.executeQuery();
	    		String train=" ";
	    		System.out.println("TrainId| |Source| |Destination| |Departing time| |Arrival time");
	    		while(rs.next())
	    		{
	    		  train=(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
	    		  System.out.println(train);
	    		}
	    		
	    	   
	    		con.close();
	
	    	}
	    	catch (Exception e) {
				// TODO: handle exception
	    		  System.out.println(e.getMessage());
			}
    
        }
        void displayCompartmentType()
        {
        	try {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
	    		Statement stmt=con.createStatement();
	    		ResultSet rs=stmt.executeQuery("select * from compartmenttype");
	    		String type=" ";
	    		System.out.println("Compartment Type| |Price|");
	    		while(rs.next())
	    		{
	    		  type=(rs.getString(1)+"    "+rs.getDouble(3));
	    		  System.out.println(type);
	    		}
	    		
	    	   
	    		con.close();
	
	    	}
	    	catch (Exception e) {
				// TODO: handle exception
	    		  System.out.println(e.getMessage());
			}
    
        }
        void chooseCompartment(int train_id,String comp_type)
        {
        	try {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where TrainId=? and Compartmenttype=?");  
	    		stmt.setInt(1,train_id);  
	    		stmt.setString(2,comp_type); 
	    		ResultSet rs=stmt.executeQuery();
	    		String comp=" ";
	    		System.out.println("CompartmentId| |Seats Available| |Lower Berth Seats| |Middle Berth Seats| |Upper Berth Seats");
	    		while(rs.next())
	    		{
	    		  comp=(rs.getString(1)+"        "+rs.getInt(2)+"     "+rs.getInt(5)+"      "+rs.getInt(6)+"      "+rs.getInt(7));
	    		  System.out.println(comp);
	    		}
	    		
	    	   
	    		con.close();
	
	    	}
	    	catch (Exception e) {
				// TODO: handle exception
	    		  System.out.println(e.getMessage());
			}
          }
        	boolean ticketCheck(String comp_id,int no_of_tickets)
            {
            	try {
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where CompartmentId=?");  
    	    		stmt.setString(1,comp_id);   
    	    		ResultSet rs=stmt.executeQuery();
    	    		rs.next();
    	    		if(rs.getInt(2)>=no_of_tickets) {
    	    			return true;
    	    		}
    	    		else
    	    		{
    	    			System.out.println("!!!Tickets Insufficient for your booking!!!");
    	    		}
    	    	   
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
            	return false;
            }
        	boolean lbticketCheck(String comp_id,int no_of_tickets)
            {
            	try {
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where CompartmentId=?");  
    	    		stmt.setString(1,comp_id);   
    	    		ResultSet rs=stmt.executeQuery();
    	    		rs.next();
    	    		if(rs.getInt(5)>=no_of_tickets) {
    	    			return true;
    	    		}
    	    	   
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
            	return false;
            }
        	int getLbTicketsAvailable(String comp_id)
            {
       		    int lbseats_available=0;
            	try 
            	{
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where CompartmentId=?");    
    	    		stmt.setString(1,comp_id); 
    	    		ResultSet rs=stmt.executeQuery();
    	    		rs.next();
    	    		lbseats_available=rs.getInt(5);
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
               return lbseats_available;
            	
            }
        	void lbseatsUpdate(String comp_id,int updated_lb_seats)
            {
            	try {
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("update compartments set LbSeatsAvailable=? where  CompartmentId=?");  
    	    		stmt.setInt(1,updated_lb_seats);  
    	    		stmt.setString(2,comp_id); 
    	    		int i=stmt.executeUpdate();
    	    		System.out.println(i+" records inserted");
    	    		
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
              }
        	boolean mbticketCheck(String comp_id,int no_of_tickets)
            {
            	try {
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where CompartmentId=?");  
    	    		stmt.setString(1,comp_id);   
    	    		ResultSet rs=stmt.executeQuery();
    	    		rs.next();
    	    		if(rs.getInt(6)>=no_of_tickets) {
    	    			return true;
    	    		}
    	    	   
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
            	return false;
            }
        	int getMbTicketsAvailable(String comp_id)
            {
       		    int mbseats_available=0;
            	try 
            	{
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where CompartmentId=?");    
    	    		stmt.setString(1,comp_id); 
    	    		ResultSet rs=stmt.executeQuery();
    	    		rs.next();
    	    		mbseats_available=rs.getInt(6);
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
               return mbseats_available;
            	
            }
        	void mbseatsUpdate(String comp_id,int updated_mb_seats)
            {
            	try {
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("update compartments set MbSeatsAvailable=? where  CompartmentId=?");  
    	    		stmt.setInt(1,updated_mb_seats);  
    	    		stmt.setString(2,comp_id); 
    	    		int i=stmt.executeUpdate();
    	    		System.out.println(i+" records inserted");
    	    		
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
              }
        	boolean ubticketCheck(String comp_id,int no_of_tickets)
            {
            	try {
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where CompartmentId=?");  
    	    		stmt.setString(1,comp_id);   
    	    		ResultSet rs=stmt.executeQuery();
    	    		rs.next();
    	    		if(rs.getInt(7)>=no_of_tickets) {
    	    			return true;
    	    		}
    	    	   
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
            	return false;
            }
        	int getUbTicketsAvailable(String comp_id)
            {
       		    int ubseats_available=0;
            	try 
            	{
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where CompartmentId=?");    
    	    		stmt.setString(1,comp_id); 
    	    		ResultSet rs=stmt.executeQuery();
    	    		rs.next();
    	    		ubseats_available=rs.getInt(7);
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
               return ubseats_available;
            	
            }
        	void ubseatsUpdate(String comp_id,int updated_ub_seats)
            {
            	try {
    	    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
    	    		PreparedStatement stmt=con.prepareStatement("update compartments set UbSeatsAvailable=? where  CompartmentId=?");  
    	    		stmt.setInt(1,updated_ub_seats);  
    	    		stmt.setString(2,comp_id); 
    	    		int i=stmt.executeUpdate();
    	    		System.out.println(i+" records inserted");
    	    		
    	    		con.close();
    	
    	    	}
    	    	catch (Exception e) {
    				// TODO: handle exception
    	    		  System.out.println(e.getMessage());
    			}
              }
    
        	 double getPrice(String comp_type)
             {
        		double price=0;
             	try 
             	{
     	    		Class.forName("com.mysql.cj.jdbc.Driver");
     	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
     	    		PreparedStatement stmt=con.prepareStatement("select * from compartmenttype where Compartmenttype=?");    
     	    		stmt.setString(1,comp_type); 
     	    		ResultSet rs=stmt.executeQuery();
     	    		rs.next();
     	    		price=rs.getDouble(3);
     	    		con.close();
     	
     	    	}
     	    	catch (Exception e) {
     				// TODO: handle exception
     	    		  System.out.println(e.getMessage());
     			}
                return price;
             	
             }
        	 int getTicketsAvailable(String comp_id)
             {
        		int seats_available=0;
             	try 
             	{
     	    		Class.forName("com.mysql.cj.jdbc.Driver");
     	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
     	    		PreparedStatement stmt=con.prepareStatement("select * from compartments where CompartmentId=?");    
     	    		stmt.setString(1,comp_id); 
     	    		ResultSet rs=stmt.executeQuery();
     	    		rs.next();
     	    		seats_available=rs.getInt(2);
     	    		con.close();
     	
     	    	}
     	    	catch (Exception e) {
     				// TODO: handle exception
     	    		  System.out.println(e.getMessage());
     			}
                return seats_available;
             	
             }
        	 void seatsUpdate(String comp_id,int updated_seats)
             {
             	try {
     	    		Class.forName("com.mysql.cj.jdbc.Driver");
     	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
     	    		PreparedStatement stmt=con.prepareStatement("update compartments set SeatsAvailable=? where  CompartmentId=?");  
     	    		stmt.setInt(1,updated_seats);  
     	    		stmt.setString(2,comp_id); 
     	    		int i=stmt.executeUpdate();
     	    		System.out.println(i+" records inserted");
     	    		
     	    		con.close();
     	
     	    	}
     	    	catch (Exception e) {
     				// TODO: handle exception
     	    		  System.out.println(e.getMessage());
     			}
               }
//        	 void connectionWithBookingDetails(BookingDetails bd) 
//        		{   
//        	    	try {
//        	    		Class.forName("com.mysql.cj.jdbc.Driver");
//        	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
//        	    		PreparedStatement stmt=con.prepareStatement("insert into bookingdetails (LoginId,TrainId,NoOfTickets,Bstatus)values(?,?,?,?)");  
//        	    		stmt.setString(1,bd.getLogin_id());  
//        	    		stmt.setInt(2,bd.getTrain_id()); 
//        	    		stmt.setInt(3,bd.getNo_of_tickets());
//        	    		stmt.setString(4,bd.getStatus());
//        	    		int i=stmt.executeUpdate();  
//        	    		System.out.println(i+" records inserted");  
//        	    		
//        	    		con.close();
//        	    	}
//        	    	catch (Exception e) {
//        				// TODO: handle exception
//        	    		  System.out.println(e.getMessage());
//        			}
//        		}
        	 int getBookingId()
             {
        		int booking_id=0;
             	try 
             	{
     	    		Class.forName("com.mysql.cj.jdbc.Driver");
     	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
     	    		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
     	    		ResultSet rs=stmt.executeQuery("select * from bookingdetails ");
     	    		rs.last();
     	    		booking_id=rs.getInt(1);
     	    		con.close();
     	
     	    	}
     	    	catch (Exception e) {
     				// TODO: handle exception
     	    		  System.out.println(e.getMessage());
     			}
                return booking_id;
             	
             }
//        	 void connectionWithTicketDetails(TicketDetails td) 
//     		{   
//     	    	try {
//     	    		Class.forName("com.mysql.cj.jdbc.Driver");
//     	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
//     	    		PreparedStatement stmt=con.prepareStatement("insert into ticketdetails (Pname,Age,Gender,BookingId,CompartmentId,Tstatus,seattype)values(?,?,?,?,?,?,?)");  
//     	    		stmt.setString(1,td.getName());  
//     	    		stmt.setInt(2,td.getAge()); 
//     	    		stmt.setString(3,td.getGender());
//     	    		stmt.setInt(4,td.getBooking_id()); 
//     	    		stmt.setString(5,td.getCompartment_id());
//     	    		stmt.setString(6,td.getTicket_status());
//     	    		stmt.setString(7,td.getSeat_type());
//
//     	    		
//     	    		int i=stmt.executeUpdate();  
//     	    		System.out.println(i+" records inserted");  
//     	    		
//     	    		con.close();
//     	    	}
//     	    	catch (Exception e) {
//     				// TODO: handle exception
//     	    		  System.out.println(e.getMessage());
//     			}
//     		}
             void ticketNos(int booking_id)
             {
             	try {
     	    		Class.forName("com.mysql.cj.jdbc.Driver");
     	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
     	    		PreparedStatement stmt=con.prepareStatement("select * from ticketdetails where BookingId=?");  
     	    		stmt.setInt(1,booking_id);   
     	    		ResultSet rs=stmt.executeQuery();
     	    		int tickets;
     	    		while(rs.next())
     	    		{
     	    		  tickets=(rs.getInt(1));
     	    		  System.out.println(tickets);
     	    		}
     	    		
     	    	   
     	    		con.close();
     	
     	    	}
     	    	catch (Exception e) {
     				// TODO: handle exception
     	    		  System.out.println(e.getMessage());
     			}
               }
             void deleteBooking(int booking_id,String status) 
      		{   
      	    	try {
      	    		Class.forName("com.mysql.cj.jdbc.Driver");
      	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
      	    		PreparedStatement stmt=con.prepareStatement("update bookingdetails set Bstatus=? where BookingId=?");  
      	    		stmt.setString(1,status);  
      	    		stmt.setInt(2,booking_id);
      	    		int i=stmt.executeUpdate();  
      	    		System.out.println(i+" records inserted");  
      	    		
      	    		con.close();
      	    	}
      	    	catch (Exception e) {
      				// TODO: handle exception
      	    		  System.out.println(e.getMessage());
      			}
      		}
             void deleteTicket(int ticket_id,String status) 
       		{   
       	    	try {
       	    		Class.forName("com.mysql.cj.jdbc.Driver");
       	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
       	    		PreparedStatement stmt=con.prepareStatement("update ticketdetails set Tstatus=? where TicketId=?");  
       	    		stmt.setString(1,status); 
       	    		stmt.setInt(2,ticket_id);
       	    		int i=stmt.executeUpdate();  
       	    		System.out.println(i+" records inserted");  
       	    		
       	    		con.close();
       	    	}
       	    	catch (Exception e) {
       				// TODO: handle exception
       	    		  System.out.println(e.getMessage());
       			}
       		 } 
             
            String deletedTicketCompartment(int ticket_id) 
     		{   
         	  String comp_id =" ";
     	    	try {
     	    		Class.forName("com.mysql.cj.jdbc.Driver");
     	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
     	    		PreparedStatement stmt=con.prepareStatement("select * from ticketdetails where TicketId=?");  
     	    		stmt.setInt(1,ticket_id); 
     	    		ResultSet rs=stmt.executeQuery();
      	    		rs.next();
      	    		comp_id=rs.getString(6);
     	    		con.close();
     	    	}
     	    	catch (Exception e) {
     				// TODO: handle exception
     	    		  System.out.println(e.getMessage());
     			}
     	    	return comp_id;
     		}
            
             String deletedSeatType(int ticket_id) 
      		{   
          	  String berth_type=" ";
      	    	try {
      	    		Class.forName("com.mysql.cj.jdbc.Driver");
      	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
      	    		PreparedStatement stmt=con.prepareStatement("select * from ticketdetails where TicketId=?");  
      	    		stmt.setInt(1,ticket_id); 
      	    		ResultSet rs=stmt.executeQuery();
       	    		rs.next();
       	    		berth_type=rs.getString(8);
      	    		con.close();
      	    	}
      	    	catch (Exception e) {
      				// TODO: handle exception
      	    		  System.out.println(e.getMessage());
      			}
      	    	return berth_type;
      		}
             
             void deleteBookingTicket(int booking_id,String status) 
        		{   
        	    	try {
        	    		Class.forName("com.mysql.cj.jdbc.Driver");
        	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
        	    		PreparedStatement stmt=con.prepareStatement("update ticketdetails set Tstatus=? where BookingId=?");  
        	    		stmt.setString(1,status); 
        	    		stmt.setInt(2,booking_id);
        	    		int i=stmt.executeUpdate();  
        	    		System.out.println(i+" records inserted");  
        	    		
        	    		con.close();
        	    	}
        	    	catch (Exception e) {
        				// TODO: handle exception
        	    		  System.out.println(e.getMessage());
        			}
        		 }
             int getNoOfTickets(int booking_id) 
       		{   
           	  int no_of_tickets=0;
       	    	try {
       	    		Class.forName("com.mysql.cj.jdbc.Driver");
       	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
       	    		PreparedStatement stmt=con.prepareStatement("select * from bookingdetails where BookingId=?");  
       	    		stmt.setInt(1,booking_id); 
       	    		ResultSet rs=stmt.executeQuery();
        	    		rs.next();
        	    		no_of_tickets=rs.getInt(4);
       	    		con.close();
       	    	}
       	    	catch (Exception e) {
       				// TODO: handle exception
       	    		  System.out.println(e.getMessage());
       			}
       	    	return no_of_tickets;
       		}
             String deletedBookingCompartment(int booking_id) 
      		{   
          	  String comp_id =" ";
      	    	try {
      	    		Class.forName("com.mysql.cj.jdbc.Driver");
      	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
      	    		PreparedStatement stmt=con.prepareStatement("select * from ticketdetails where BookingId=?");  
      	    		stmt.setInt(1,booking_id); 
      	    		ResultSet rs=stmt.executeQuery();
       	    		rs.next();
       	    		comp_id=rs.getString(6);
      	    		con.close();
      	    	}
      	    	catch (Exception e) {
      				// TODO: handle exception
      	    		  System.out.println(e.getMessage());
      			}
      	    	return comp_id;
      		}
             String deletedBookingSeatType(int booking_id) 
       		{   
           	  String seat_type =" ";
       	    	try {
       	    		Class.forName("com.mysql.cj.jdbc.Driver");
       	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
       	    		PreparedStatement stmt=con.prepareStatement("select * from ticketdetails where BookingId IN (select BookingId from bookingdetails where bookingId=?)");  
       	    		stmt.setInt(1,booking_id); 
       	    		ResultSet rs=stmt.executeQuery();
        	    		rs.next();
        	    		seat_type=rs.getString(8);
       	    		con.close();
       	    	}
       	    	catch (Exception e) {
       				// TODO: handle exception
       	    		  System.out.println(e.getMessage());
       			}
       	    	return seat_type;
       		}
            public String viewTicket(int ticket_id)
             {
            	String ticket =" ";
             	try {
     	    		Class.forName("com.mysql.cj.jdbc.Driver");
     	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
     	    		PreparedStatement stmt=con.prepareStatement("select * from ticketdetails where TicketId=?");  
     	    		stmt.setInt(1,ticket_id);  
     	    		ResultSet rs=stmt.executeQuery();
     	    		rs.next();
     	    		
     	    		ticket=("|  Ticket Number:"+rs.getInt(1)+"|"
     	    		        +"\n\n|  Name:"+rs.getString(2)+"|"
     	    				+"\n\n|  Age:"+rs.getInt(3)+"|"
     	    		        +"\n\n|  Gender:"+rs.getString(4)+"|"
     	    				+"\n\n|  Booking Id:"+rs.getInt(5)+"|"
     	    		        +"\n\n|  Compartment Id:"+rs.getString(6)+"|"
     	    				+"\n\n|  Berth:"+rs.getString(8)+"|");
     	    		
     
     	    		con.close();
     	
     	    	}
     	    	catch (Exception e) {
     				// TODO: handle exception
     	    		  System.out.println(e.getMessage());
     			}
             	return ticket;
             	
               }
                    


}
