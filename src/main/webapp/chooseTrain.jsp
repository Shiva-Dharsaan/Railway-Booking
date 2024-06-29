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
      <h1 style='color:Black;'>Choose Train</h1>
       <%
          String source= request.getParameter("blocation");
          String destination= request.getParameter("destination");
          String date= request.getParameter("date");
          Class.forName("com.mysql.cj.jdbc.Driver");
  		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
  		  PreparedStatement stmt=con.prepareStatement("select * from train where StartingPoint=? and EndingPoint=? and Date(Departingtime)=?");  
  		  stmt.setString(1,source);  
  		  stmt.setString(2,destination); 
  		  stmt.setString(3,date);
  		  ResultSet rs=stmt.executeQuery();
  		  String train=" ";
  		  out.println("TrainId|     |Source|     |Destination|     |Departing time|      |Arrival time<BR><BR>");
  		  while(rs.next())
  		  {
  		    train=(rs.getString(1)+"| |"+rs.getString(2)+"| |"+rs.getString(3)+"| |"+rs.getString(4)+"| |"+rs.getString(5)+"<BR><BR>");
  		    out.println("-------------------------------------------------------------------------------------<BR>");
  		    out.println(train);
  		  }
  		
  		  out.println("-------------------------------------------------------------------------------------<BR><BR>");
  		  con.close();  
       %>
     <form action="chooseCompartment.jsp">
       Enter the Train Id in which you want to travel:<input type="text" name="trainid"><br><br>
       <%
          Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","Shiva@18");
		  Statement stmtt=conn.createStatement();
		  ResultSet rss=stmtt.executeQuery("select * from compartmenttype");
		  String type=" ";
		  out.println("Compartment Type| |Price|<BR><BR>");
		  while(rss.next())
		  {
		     type=(rss.getString(1)+"|    |"+rss.getDouble(3));
		     out.println(type+"<BR><BR>");
		  }
		  con.close();
       %>
        Enter the Compartment type in which you want to travel(format as in the list):<input type="text" name="comp_type"><br><br>
        <input type="submit" value="Submit">
    </form> 

</body>
</html>
</center>