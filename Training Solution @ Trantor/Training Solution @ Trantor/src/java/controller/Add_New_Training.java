/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import DAO.CRUD_NominationDAO;
import DAO.CRUD_TrainingDAO;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author gurpreet.singh
 */
public class Add_New_Training extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        String name = request.getParameter("name");
        String duration = request.getParameter("duration");
        String topic = request.getParameter("topic");
        String external = request.getParameter("external");
        String date_from1 = request.getParameter("date_from");
        String date_to1 = request.getParameter("date_to");
        String mentor = request.getParameter("mentor");
        String[] selectedList = request.getParameterValues("selectlist");
        
        System.out.println("hello");
        //System.out.println("selected list--"+selectedList.length);
        //String employees = request.getParameter("duration");
        //System.out.println(name+" "+duration+" "+topic+" "+external+" "+date_from+" "+date_to);
        
        // convert date format from 11/06/2013 to 11-06-2013 
        // reqd. year-mm-dd from mm/dd/year
        
        java.util.Date  date_from2 = new Date(date_from1);
        java.util.Date  date_to2 = new Date(date_to1);
        
        SimpleDateFormat formatter5=new SimpleDateFormat("yyyy-MM-dd");
        String date_from = formatter5.format(date_from2);
        String date_to = formatter5.format(date_to2);
        System.out.println(date_from1+"  "+date_from2+"  "+date_from);
        
        // To add new training into the training table.
        CRUD_TrainingDAO add_New_TrainingDAO = new CRUD_TrainingDAO();
        add_New_TrainingDAO.insert(name, topic, mentor, external, date_from, date_to,duration);
        
        //fetching the values of employee.
        String attended=null;
        Integer training_id=5;
        String[] emp_code = selectedList;
        attended = "no";
        
        //fetching the training id from training table.
        training_id = add_New_TrainingDAO.retrieveId();
        
        // To add new training nomination.
        CRUD_NominationDAO add_New_NominationDAO = new CRUD_NominationDAO();
        add_New_NominationDAO.insert(emp_code,training_id,attended);
        
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        return mapping.findForward(SUCCESS);
    }
}
