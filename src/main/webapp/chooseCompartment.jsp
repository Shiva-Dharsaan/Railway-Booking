<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<center>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightGray">
      <h1 style='color:Black;'>Choose Compartments</h1>
       <%
          String train= request.getParameter("trainid");
          String comp_type= request.getParameter("comp_type");
          int train_id=Integer.parseInt(train);
          Class.forName("com.mysql.cj.jdbc.Driver");
  		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
  		  PreparedStatement stmt=con.prepareStatement("select * from compartments where TrainId=? and Compartmenttype=?");  
  		  stmt.setInt(1,train_id);  
  		  stmt.setString(2,comp_type); 
  		  ResultSet rs=stmt.executeQuery();
  		  String comp=" ";
  		  out.println("CompartmentId| |Seats Available| |Lower Berth Seats| |Middle Berth Seats| |Upper Berth Seats<BR><BR>");
  		  while(rs.next())
  		  {
  		    comp=(rs.getString(1)+"|        |"+rs.getInt(2)+"|     |"+rs.getInt(5)+"|      |"+rs.getInt(6)+"|      |"+rs.getInt(7)+"<BR><BR>");
  		    out.println(comp+"<br><br>");
  		  }
  		  
  	   
  		  con.close();

       %>
       <script type="text/javascript">
       var train="<%= train %>"
       var comp_type="<%= comp_type %>"
       console.log(train);
       console.log(comp_type);
       </script>
       <form action="chooseTrain.jsp">
           Enter the Compartment id in which you want to book a ticket:<input type="text" name="comp_id"><br><br>
           Enter the number of tickets you want to book:<input type="text" name="no_of_tickets"><br><br>
           <input type="submit" value="Submit">
       </form> 

</body>
</html>
</center>