<%-- 
    Document   : Feedback_Induction
    Created on : Nov 25, 2013, 2:43:16 PM
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
        <h1>Feedback Form Induction !</h1>
        <form action="Add_New_Training.do" method="post">
            <label>Name</label><input value="" placeholder="name of training" type="text">
            <br><label>Name of employees </label><input type="text" >
            <br><label>Duration </label><input type="time" >
            <br><label>Training topic </label><input type="text" >
            <br><label>External </label><input type="text" >
            <br><label>Date From </label><input type="date" >
            <br><label>Date To </label><input type="date" >
            <br><input type="submit" value="SUBMIT" >
        </form>
    </body>
</html>
