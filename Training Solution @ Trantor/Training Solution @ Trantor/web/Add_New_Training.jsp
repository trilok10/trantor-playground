<%-- 
    Document   : Add_New_Training
    Created on : Nov 25, 2013, 12:46:49 PM
    Author     : gurpreet.singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/prism.css">
        <link rel="stylesheet" href="css/chosen.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js" type="text/javascript"></script>
        
        <script src="js/chosen.jquery.js" type="text/javascript"></script>
        <script src="js/prism.js" type="text/javascript" charset="utf-8"></script>

        <script src="js/addTraining.js" type="text/javascript"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="css/jquery-ui.css">
        <script src="js/jquery-ui.js"></script>
        <script src="js/datepicker.js" type="text/javascript"></script>
        
        <link rel="stylesheet" href="css/addTrainingStyle.css">
        
        
    </head>
    <body>
        <div id="content">
            <h1>Add new Training !</h1>
            <form action="Add_New_Training.do" method="post">
                <table class="preet">
                  <tr style=""><td style="width:183px;"><label>Name of training </label></td><td  style="width:550px;"><input name="name" id="name" type="text" ></td></tr>
                <br>
                <%-- code for name selector box     --%>
               <tr><td> <div class="side-by-side clearfix">
                    <div>
                        <em>List of employees taking training </em></td><td>
                        <select data-placeholder="Employees in training" name="selectlist" id="selectlist" style="width:350px;" multiple class="chosen-select" tabindex="8">
                            <option value=""></option>
                            <option value="1">Gurpreet</option>
                            <option value="2">Employee1</option>
                            <option value="3">Employee2</option>
                            <option value="4" >Employee4</option>
                            <option value="5" >Employee5</option>
                            <option value="6" >Employee6</option>
                            <option value="7" >Employee7</option>
                            <option value="8">Employee8</option>
                            <option value="9">Employee9</option>
                            <option value="10">Employee10</option>
                            <option value="11">Employee11</option>
                        </select>
                    </div>
                </div></td></tr>

                <script type="text/javascript">
                    function cancel() {
                        var a = confirm("Are you sure to cancel ?");
                        if (a === true)
                            document.getElementById("cancela").href = "index.jsp";
                    }
                    /*
                     function fetch(){
                     //alert("hello");
                     var myArray1; 
                     var a=document.getElementById("search_text_field").value;
                     if(a==="a"){   myArray1 = new Array( "ant", "apple" ); }
                     if(a==="b"){   myArray1 = new Array( "bob", "bsb" ); }
                 
                     //adding options list to the list.
                     for(var i=0;i<myArray1.length;i++){
                     var o = new Option(myArray1[i],myArray1[i]);
                     /// jquerify the DOM object 'o' so we can use the html method
                     $('#selectlist').empty();
                     $('#selectlist').append('<option value="foo" >'+myArray1[i]+'</option>');
                     }
                 
                     var config = {
                     '.chosen-select'           : {},
                     '.chosen-select-deselect'  : {allow_single_deselect:true},
                     '.chosen-select-no-single' : {disable_search_threshold:10},
                     '.chosen-select-no-results': {no_results_text:'Oops, nothing found!'},
                     '.chosen-select-width'     : {width:"95%"}
                     }
                     for (var selector in config) {
                     $(selector).chosen(config[selector]);
                     }
                 
                     $('#hells').empty();
                     for(var i=0;i<myArray1.length;i++){
                     var o = new Option(myArray1[i],myArray1[i]);
                     /// jquerify the DOM object 'o' so we can use the html method
                     $('#hells').append('<option value='+myArray1[i]+' >'+myArray1[i]+'</option>');
                 
                     }
                     }
                     */
                </script>
                <tr><td><label>Duration </label></td><td>
                <select name="duration" id="duration">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                </select>Hours </td></tr>      
                <tr><td><label>Mentor </label></td><td><input name="mentor" id="mentor" type="text" ></td></tr>
                <tr><td><label>Training topic </label></td><td><input name="topic" id="topic" type="text" ></td></tr>
                <tr><td><label>External </label></td><td><select name="external" id="external" >
                    <option>Yes</option>
                    <option>No</option>
                </select></td></tr>
                <tr><td><label>Date From </label></td><td><input value="" name="date_from" class="datepick" id="date_from" type="" ></td></tr>
                <tr><td><label>Date To </label></td><td><input value="" type="" name="date_to"  class="datepick" id="date_to" ></td></tr>
                <tr><td></td><td><input type="submit" value="SAVE" ></td></tr>
                <tr><td></td><td><a id="cancela" onclick="cancel()"><input type="button" value="CANCEL"></a></td></tr>
              </table>
            </form>
        </div>
    </body>
</html>
