
<%-- 
    Document   : Add_New_Training
    Created on : Nov 25, 2013, 12:46:49 PM
    Author     : gurpreet.singh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of trainings!</h1>
        <% 
            int count = 1;
            ResultSet rs = (ResultSet) request.getAttribute("rs");
            while (rs.next()){
                String name = rs.getString("name");
                Integer id = rs.getInt("id");
        %>      
        
        <input name='<%=count %>' value='<%=id %>' type="hidden" >
        <input name='<%=count %>' value='<%=name %>' type="hidden" >
        
        <%=name %>-----------------------------------------<a href="EditTraining.jsp">edit</a> <a href="ReportTraining.jsp">report</a> <br>
        
        <%
            count++;
            }
        %>
        
        <h1>***************************************</h1>
        <h1>List of induction!</h1>
        <% 
            count = 1;
            rs = (ResultSet) request.getAttribute("rs");
            while (rs.next()){
                String name = rs.getString("name");
                Integer id = rs.getInt("id");
        %>      
        
        <input name='<%=count %>' value='<%=id %>' type="hidden" >
        <input name='<%=count %>' value='<%=name %>' type="hidden" >
        
        <%=name %>-----------------------------------------<a href="EditInduction.jsp">edit</a> <a href="ReportInduction.jsp">report</a>
        
        <%
            count++;
            }
        %>
        
    </body>
</html>
