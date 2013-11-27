<%-- 
    Document   : Add_New_Training
    Created on : Nov 25, 2013, 12:46:49 PM
    Author     : gurpreet.singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add new Induction </h1>
        <form action="Add_New_Induction.do" method="post">
            <label>Name</label><input value="" placeholder="name of training" type="text">
            <br><label>Name of employees </label><input type="text" >
            <br><label>Duration </label><input type="time" >
            <br><label>Date From </label><input type="date" >
            <br><label>Date To </label><input type="date" >
            <br><input type="submit" value="SAVE" >
            <br><a href="index.jsp"><input type="button" value="CANCEL"></a>
        </form>
    </body>
</html>
