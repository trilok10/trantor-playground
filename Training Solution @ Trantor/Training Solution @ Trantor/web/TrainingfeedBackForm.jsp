<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
    <h1 class="heading"> Training Feedback Form</h1>
    <html:base/>
</head>
<body style="background-color: white">
    <html:form action="TrainingFeedBackAction" method="POST">
        <table>
            <tr>
                <td>Topic</td><td><html:text property="topic"/></td></tr>
            <tr>
                <td>Date</td><td><html:text property="date"/></td></tr>
            <tr>
                <td>Name of Participant</td> <td><html:text property="nameOfParticipant"/></td></tr>   
            <tr>
                <td> Emp Code </td> <td><html:text property="empcode"/> </td> </tr>
            <tr><tr/><tr><tr/>
            <tr><td class="subheading">Please Mark NA Which Ever is not applicable</td></tr>
            <tr><td>1-Poor, 2- Average, 3-Above Average  4- Good, 5- Excellent</td></tr>
            <tr><tr/><tr><tr/>
            <tr><td class="subheading">Session Evaluation</td></tr>
            <tr><td>1)       Were the objectives of the course met?</td> <td> <html:select property="session1">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td> 2)       Was the course easy to follow/understand?</td> <td> <html:select property="session2">
                        <<html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td>3)       Were your expectations met? </td> <td> <html:select property="session3">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td> 4)       Was it useful to your work profile? </td> <td> <html:select property="session4">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><tr/><tr><tr/>
            <tr><td class="subheading">Course materials</td></tr>
            <tr><td> 5)       Good for future reference </td> <td> <html:select property="courseMaterial1">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td>6)       Supports the content </td> <td> <html:select property="courseMaterial2">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td>7)       Presentation </td> <td> <html:select property="courseMaterial3">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><tr/><tr><tr/>
            <tr><td class="subheading">Trainer Evaluation Knowledge</td></tr>
            <tr><td>10)       Has excellent grasp of subject </td> <td> <html:select property="trainingEvalutionKnowledge1">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td> 11)       Has incorporated contemporary issues in the presentation </td> <td> <html:select property="trainingEvalutionKnowledge2">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><tr/><tr><tr/>
            <tr><td class="subheading">Delivery</td></tr>
            <tr><td> 12)    Presentation was well organized and well prepared.</td> <td>  <html:select property="delivery1">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td> 13)       Lectures are clear and easy to follow. </td> <td> <html:select property="delivery2">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td>14)       Trainer is enthusiastic about teaching </td> <td> <html:select property="delivery3">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><td> 15)       Trainer made the session interesting. </td> <td> <html:select property="delivery4">
                        <html:option value="">-- None --</html:option>
                        <html:option value="Poor">Poor</html:option>
                        <html:option value="Average">Average</html:option>
                        <html:option value="AboveAverage">AboveAverage</html:option>
                        <html:option value="Good">Good</html:option>
                        <html:option value="Excellent">Excellent</html:option>
                    </html:select></td></tr>
            <tr><tr/><tr><tr/>
            <tr><td>Would you like to attend other modules, if any, by the same trainer?</td>
                <td> <html:select property="otherTraining">
                        <html:option value="">-- None --</html:option>
                        <html:option value="yes">yes</html:option>
                        <html:option value="no">no</html:option>
                    </html:select></td></tr>
            <tr><tr/><tr><tr/>
            <tr><td>Any other comments?</td>
                <td><html:textarea property="comments" cols="20" rows="2" /></td></tr>
            <tr><tr/><tr><tr/>
            <tr><td>Identify 2 things you learnt from this session</td> 
                <td>1) <html:textarea property="learnt1" cols="20" rows="2" />2) <html:textarea property="learnt2" cols="20" rows="2" /></td></tr>
            <tr><tr/><tr><tr/><tr><tr/><tr><tr/>
            <tr><td></td>
                <td><html:submit property="submit" value="Submit Data"/><html:submit property="cancel" value="Cancel"/></td></tr>
                <html:errors/>
        </table>

    </html:form>

</body>
</html:html>
