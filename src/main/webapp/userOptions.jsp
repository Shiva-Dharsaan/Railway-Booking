<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<center>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightGray">

     <%
       if(session.getAttribute("username")==null)
       {
    	   response.sendRedirect("login.jsp");
       }
    %>
   
     <h1 style='color:Black;'>Login Options</h1>
    <input type="submit" value="Book a Ticket" onclick="location.href='booking.html'"><br><br>
    <input type="submit" value="Cancel a Booking" onclick="location.href='cancelBooking.html'"><br><br>
    <input type="submit" value="Cancel a Ticket" onclick="location.href='cancelTicket.html'"><br><br>
    <input type="submit" value="View Ticket" onclick="location.href='TicketView.html'">
    
    
    
</body>
</html>
</center>