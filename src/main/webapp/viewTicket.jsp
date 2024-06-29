<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Railway.*"%>
<!DOCTYPE html>
<center>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightGray">
        <h1 style='color:Black;'>Ticket</h1>
       <%
          String ticket= request.getParameter("ticketid");
          int ticket_id=Integer.parseInt(ticket);
          DatabaseConnection dc=new DatabaseConnection();
		  String ticket_view=dc.viewTicket(ticket_id);  
		  
       %>
       <%out.print("--------------------------------------------------------------------------------------------------------------------------------------------------------------<BR>"); %>
       <%=ticket_view %>
       <%out.print("<BR>"); %>
       <%out.print("--------------------------------------------------------------------------------------------------------------------------------------------------------------"); %>
       
</body>
</html>
</center>