<%-- 
    Document   : inductionFeedBackForm
    Created on : Nov 26, 2013, 5:31:26 PM
    Author     : trilok.sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <html:html lang="true">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
            <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
             <h1 class="heading"> Induction Feedback Form</h1>
        </head>
        <body>
            <html:form action="InductionFeedBackAction" method="POST">
                <table>



                    <tr> <td>Employee Name</td> <td><html:text property="employeeName"/></td></tr>       
                    <tr><td>Emp Code</td> <td><html:text property="empcode"/> </td> </tr>
                    <tr><td>Joining Date</td> <td><html:text property="joiningDate"/> </td> </tr>
                    <tr><td>Induction Date</td> <td><html:text property="inductionDate"/> </td></tr>
                    <tr><tr/><tr><tr/>
                    <tr><td class="subheading">Induction Evaluation</td></tr>
                    <tr><td class="subheading">Parameters :</td></tr>

                    <tr><td>My induction was conducted in an effective and efficient manner
                        </td> <td> <html:select property="parameter1">
                                <html:option value="">-- None --</html:option>
                                <html:option value="stronglyAgree">Strongly Agree</html:option>
                                <html:option value="Agree">Agree</html:option>
                                <html:option value="Disagree">Disagree</html:option>
                                <html:option value="stronglyDisagree">Strongly Disagree</html:option>
                            </html:select></td></tr>
                    <tr><td>The information I was given during my induction was applicable and relevant
                        </td> <td> <html:select property="parameter2">
                                <html:option value="">-- None --</html:option>
                                <html:option value="stronglyAgree">Strongly Agree</html:option>
                                <html:option value="Agree">Agree</html:option>
                                <html:option value="Disagree">Disagree</html:option>
                                <html:option value="stronglyDisagree">Strongly Disagree</html:option>
                            </html:select></td></tr>
                    <tr><td>The induction session was easy to follow/understand
                        </td> <td> <html:select property="parameter3">
                                <html:option value="">-- None --</html:option>
                                <html:option value="stronglyAgree">Strongly Agree</html:option>
                                <html:option value="Agree">Agree</html:option>
                                <html:option value="Disagree">Disagree</html:option>
                                <html:option value="stronglyDisagree">Strongly Disagree</html:option>
                            </html:select></td></tr>
                    <tr><td>My expectations regarding induction session were met
                        </td> <td> <html:select property="parameter4">
                                <html:option value="">-- None --</html:option>
                                <html:option value="stronglyAgree">Strongly Agree</html:option>
                                <html:option value="Agree">Agree</html:option>
                                <html:option value="Disagree">Disagree</html:option>
                                <html:option value="stronglyDisagree">Strongly Disagree</html:option>
                            </html:select></td></tr>
                    <tr><td>The induction session was very useful for me
                        </td> <td> <html:select property="parameter5">
                                <html:option value="">-- None --</html:option>
                                <html:option value="stronglyAgree">Strongly Agree</html:option>
                                <html:option value="Agree">Agree</html:option>
                                <html:option value="Disagree">Disagree</html:option>
                                <html:option value="stronglyDisagree">Strongly Disagree</html:option>
                            </html:select></td></tr>
                    <tr><td>All induction formalities were explained to me in detail by HR 
                        </td> <td> <html:select property="parameter6">
                                <html:option value="">-- None --</html:option>
                                <html:option value="stronglyAgree">Strongly Agree</html:option>
                                <html:option value="Agree">Agree</html:option>
                                <html:option value="Disagree">Disagree</html:option>
                                <html:option value="stronglyDisagree">Strongly Disagree</html:option>
                            </html:select></td></tr>
                    <tr><td>The ambience of venue was good
                        </td> <td> <html:select property="parameter7">
                                <html:option value="">-- None --</html:option>
                                <html:option value="stronglyAgree">Strongly Agree</html:option>
                                <html:option value="Agree">Agree</html:option>
                                <html:option value="Disagree">Disagree</html:option>
                                <html:option value="stronglyDisagree">Strongly Disagree</html:option>
                            </html:select></td></tr>
                    <tr><tr/><tr><tr/>
                    <tr><td>What did you like about the induction programme?</td>
                        <td>1)<html:textarea property="aboutInduction1" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>2)<html:textarea property="aboutInduction2" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>3)<html:textarea property="aboutInduction3" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>4)<html:textarea property="aboutInduction4" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>5)<html:textarea property="aboutInduction5" cols="20" rows="2" /></td></tr>
                    <tr><tr/><tr><tr/>

                    <tr><tr/><tr><tr/>
                    <tr><td>How would you like us to improve the induction programme ?</td>
                        <td>1)<html:textarea property="improve1" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>2)<html:textarea property="improve2" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>3)<html:textarea property="improve3" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>4)<html:textarea property="improve4" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>5)<html:textarea property="improve5" cols="20" rows="2" /></td></tr>
                    <tr><tr/><tr><tr/>

                    <tr><tr/><tr><tr/>
                    <tr><td>What are the top take aways from the induction programme?</td>
                        <td>1)<html:textarea property="takeAway1" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>2)<html:textarea property="takeAway2" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>3)<html:textarea property="takeAway3" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>4)<html:textarea property="takeAway4" cols="20" rows="2" /></td></tr>
                    <tr><td></td><td>5)<html:textarea property="takeAway5" cols="20" rows="2" /></td></tr>


                    <tr><tr/><tr><tr/>
                    <tr><td>What are the reasons for joining Trantor?</td>
                        <td><html:textarea property="reasonForJoining" cols="20" rows="2" /></td></tr>
                    <tr><tr/><tr><tr/>



                    <tr><td>Any other Suggestions</td>
                        <td><html:textarea property="suggestion" cols="20" rows="2" /></td></tr>
                    <tr><tr/><tr><tr/>
                    <tr><tr/><tr><tr/><tr><tr/><tr><tr/>
                    <tr><td></td>
                        <td><html:submit property="submit" value="Submit Data"/><html:submit property="cancel" value="Cancel"/></td></tr>
                        <html:errors/>
                </table>
            </html:form>
        </body>
    </html:html>
</html>
