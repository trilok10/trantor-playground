/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formbean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author trilok.sharma
 */
public class InductionFeedBackForm extends org.apache.struts.action.ActionForm {

    private String name;
    private String employeeName;
    private String empcode;
    private String joiningDate;
    private String parameter1;
    private String parameter2;
    private String parameter3;
    private String parameter4;
    private String parameter5;
    private String parameter6;
    private String parameter7;
    private String aboutInduction1 ;
    private String aboutInduction2;
    private String aboutInduction3 ;
    private String aboutInduction4 ;
    private String aboutInduction5 ;
    
    private String improve1;
    private String improve2;
    private String improve3;
    private String improve4;
    private String improve5;
    
    private String takeAway1;
    private String takeAway2;
    private String takeAway3;
    private String takeAway4;
    private String takeAway5;
  
    private String reasonForJoining;

    public String getAboutInduction1() {
        return aboutInduction1;
    }

    public void setAboutInduction1(String aboutInduction1) {
        this.aboutInduction1 = aboutInduction1;
    }

   

    public String getImprove1() {
        return improve1;
    }

    public void setImprove1(String improve1) {
        this.improve1 = improve1;
    }

    public String getTakeAway1() {
        return takeAway1;
    }

    public String getAboutInduction2() {
        return aboutInduction2;
    }

    public void setAboutInduction2(String aboutInduction2) {
        this.aboutInduction2 = aboutInduction2;
    }

    public String getAboutInduction3() {
        return aboutInduction3;
    }

    public void setAboutInduction3(String aboutInduction3) {
        this.aboutInduction3 = aboutInduction3;
    }

    public String getAboutInduction4() {
        return aboutInduction4;
    }

    public void setAboutInduction4(String aboutInduction4) {
        this.aboutInduction4 = aboutInduction4;
    }

    public String getAboutInduction5() {
        return aboutInduction5;
    }

    public void setAboutInduction5(String aboutInduction5) {
        this.aboutInduction5 = aboutInduction5;
    }

    public String getImprove2() {
        return improve2;
    }

    public void setImprove2(String improve2) {
        this.improve2 = improve2;
    }

    public String getImprove3() {
        return improve3;
    }

    public void setImprove3(String improve3) {
        this.improve3 = improve3;
    }

    public String getImprove4() {
        return improve4;
    }

    public void setImprove4(String improve4) {
        this.improve4 = improve4;
    }

    public String getImprove5() {
        return improve5;
    }

    public void setImprove5(String improve5) {
        this.improve5 = improve5;
    }

    public String getTakeAway2() {
        return takeAway2;
    }

    public void setTakeAway2(String takeAway2) {
        this.takeAway2 = takeAway2;
    }

    public String getTakeAway3() {
        return takeAway3;
    }

    public void setTakeAway3(String takeAway3) {
        this.takeAway3 = takeAway3;
    }

    public String getTakeAway4() {
        return takeAway4;
    }

    public void setTakeAway4(String takeAway4) {
        this.takeAway4 = takeAway4;
    }

    public String getTakeAway5() {
        return takeAway5;
    }

    public void setTakeAway5(String takeAway5) {
        this.takeAway5 = takeAway5;
    }

    public void setTakeAway1(String takeAway1) {
        this.takeAway1 = takeAway1;
    }

    public String getReasonForJoining() {
        return reasonForJoining;
    }

    public void setReasonForJoining(String reasonForJoining) {
        this.reasonForJoining = reasonForJoining;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
    private String suggestion;

    private String inductionDate;

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    public String getParameter3() {
        return parameter3;
    }

    public void setParameter3(String parameter3) {
        this.parameter3 = parameter3;
    }

    public String getParameter4() {
        return parameter4;
    }

    public void setParameter4(String parameter4) {
        this.parameter4 = parameter4;
    }

    public String getParameter5() {
        return parameter5;
    }

    public void setParameter5(String parameter5) {
        this.parameter5 = parameter5;
    }

    public String getParameter6() {
        return parameter6;
    }

    public void setParameter6(String parameter6) {
        this.parameter6 = parameter6;
    }

    public String getParameter7() {
        return parameter7;
    }

    public void setParameter7(String parameter7) {
        this.parameter7 = parameter7;
    }

    public String getInductionDate() {
        return inductionDate;
    }

    public void setInductionDate(String inductionDate) {
        this.inductionDate = inductionDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    private int number;

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param i
     */
    public void setNumber(int i) {
        number = i;
    }

    /**
     *
     */
    public InductionFeedBackForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getEmpcode() == null || getEmpcode().length() < 1) {
            errors.add("empcode", new ActionMessage("error.empcode.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getEmployeeName() == null || getEmployeeName().length() < 1) {
            errors.add("getEmployeeName", new ActionMessage("error.getEmployeeName.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getJoiningDate() == null || getJoiningDate().length() < 1) {
            errors.add("getJoiningDate", new ActionMessage("error.getJoiningDate.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getInductionDate() == null || getInductionDate().length() < 1) {
            errors.add("getInductionDate", new ActionMessage("error.getInductionDate.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getParameter1().equals("")) {
            errors.add("parameter", new ActionMessage("error.parameter.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getParameter2().equals("")) {
            errors.add("parameter", new ActionMessage("error.parameter.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getParameter3().equals("")) {
            errors.add("parameter", new ActionMessage("error.parameter.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getParameter4().equals("")) {
            errors.add("parameter", new ActionMessage("error.parameter.required"));
            // TODO: add 'error.nme.required' key to your resources
        }
        if (getParameter5().equals("")) {
            errors.add("parameter", new ActionMessage("error.parameter.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getParameter6().equals("")) {
            errors.add("parameter", new ActionMessage("error.parameter.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getParameter7().equals("")) {
            errors.add("parameter", new ActionMessage("error.parameter.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
