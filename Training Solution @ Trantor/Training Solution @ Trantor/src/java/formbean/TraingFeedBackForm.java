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
public class TraingFeedBackForm extends org.apache.struts.action.ActionForm {

    private String topic;
    private String date;
    private String empcode;
    private String nameOfParticipant;
    private String session1;
    private String session2;
    private String session3;
    private String session4;
    private String courseMaterial1;
     private String courseMaterial2;
    private String courseMaterial3;
    private String trainingEvalutionKnowledge1;
    private String trainingEvalutionKnowledge2;
    private String delivery1;
    private String delivery2;
    private String delivery3;
    private String delivery4;
    private String comments;
    private String learnt1;
    private String learnt2;
    private String otherTraining;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getNameOfParticipant() {
        return nameOfParticipant;
    }

    public void setNameOfParticipant(String nameOfParticipant) {
        this.nameOfParticipant = nameOfParticipant;
    }

    public String getSession1() {
        return session1;
    }

    public void setSession1(String session1) {
        this.session1 = session1;
    }

    public String getSession2() {
        return session2;
    }

    public void setSession2(String session2) {
        this.session2 = session2;
    }

    public String getSession3() {
        return session3;
    }

    public void setSession3(String session3) {
        this.session3 = session3;
    }

    public String getSession4() {
        return session4;
    }

    public void setSession4(String session4) {
        this.session4 = session4;
    }

    public String getCourseMaterial1() {
        return courseMaterial1;
    }

    public void setCourseMaterial1(String courseMaterial1) {
        this.courseMaterial1 = courseMaterial1;
    }

    public String getCourseMaterial2() {
        return courseMaterial2;
    }

    public void setCourseMaterial2(String courseMaterial2) {
        this.courseMaterial2 = courseMaterial2;
    }

    public String getCourseMaterial3() {
        return courseMaterial3;
    }

    public void setCourseMaterial3(String courseMaterial3) {
        this.courseMaterial3 = courseMaterial3;
    }

    public String getTrainingEvalutionKnowledge1() {
        return trainingEvalutionKnowledge1;
    }

    public void setTrainingEvalutionKnowledge1(String trainingEvalutionKnowledge1) {
        this.trainingEvalutionKnowledge1 = trainingEvalutionKnowledge1;
    }

    public String getTrainingEvalutionKnowledge2() {
        return trainingEvalutionKnowledge2;
    }

    public void setTrainingEvalutionKnowledge2(String trainingEvalutionKnowledge2) {
        this.trainingEvalutionKnowledge2 = trainingEvalutionKnowledge2;
    }

    public String getDelivery1() {
        return delivery1;
    }

    public void setDelivery1(String delivery1) {
        this.delivery1 = delivery1;
    }

    public String getDelivery2() {
        return delivery2;
    }

    public void setDelivery2(String delivery2) {
        this.delivery2 = delivery2;
    }

    public String getDelivery3() {
        return delivery3;
    }

    public void setDelivery3(String delivery3) {
        this.delivery3 = delivery3;
    }

    public String getDelivery4() {
        return delivery4;
    }

    public void setDelivery4(String delivery4) {
        this.delivery4 = delivery4;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLearnt1() {
        return learnt1;
    }

    public void setLearnt1(String learnt1) {
        this.learnt1 = learnt1;
    }

    public String getLearnt2() {
        return learnt2;
    }

    public void setLearnt2(String learnt2) {
        this.learnt2 = learnt2;
    }

    public String getOtherTraining() {
        return otherTraining;
    }

    public void setOtherTraining(String otherTraining) {
        this.otherTraining = otherTraining;
    }


    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if (getTopic()== null || getTopic().length() < 1) {
            errors.add("topic", new ActionMessage("errors.topic.required"));
          }
        if (getDate()== null || getDate().length() < 1) {
            errors.add("date", new ActionMessage("errors.date.required"));
          }
        if (getEmpcode()== null || getEmpcode().length() < 1) {
            errors.add("empcode", new ActionMessage("errors.empcode.required"));
          }
        if (getNameOfParticipant()== null || getNameOfParticipant().length() < 1) {
            errors.add("nameofparticipant", new ActionMessage("errors.getNameofparticipant.required"));
          }
        if (getDelivery1().equals("")) {
            errors.add("delivery_1", new ActionMessage("errors.delivery.required"));
          }

        if (getDelivery2().equals("")) {
            errors.add("delivery_2", new ActionMessage("errors.delivery.required"));
       
        }
        if (getDelivery3().equals("")) {
            errors.add("delivery_3", new ActionMessage("errors.delivery.required"));
          }
        if (getDelivery4().equals("")) {
            errors.add("delivery_4", new ActionMessage("errors.delivery.required"));
          }
        if (getCourseMaterial1().equals("")) {
            errors.add("course_material_1", new ActionMessage("errors.course_material_1.required"));
          }
         if (getCourseMaterial2().equals("")) {
            errors.add("course_material_2", new ActionMessage("errors.course_material_1.required"));
          }
          if (getCourseMaterial3().equals("")) {
            errors.add("course_material_3", new ActionMessage("errors.course_material_1.required"));
          }
          if (getLearnt1().equals("")) {
            errors.add("learnt_1", new ActionMessage("errors.learnt_1.required"));
          }
          if (getLearnt2().equals("")) {
            errors.add("learnt_2", new ActionMessage("errors.learnt_2.required"));
          }
           if (getSession1().equals("")) {
            errors.add("session_1", new ActionMessage("errors.session_1.required"));
          }
           if (getSession2().equals("")) {
            errors.add("session_2", new ActionMessage("errors.session_1.required"));
          }
           if (getSession3().equals("")) {
            errors.add("session_3", new ActionMessage("errors.session_1.required"));
          }
           if (getSession4().equals("")) {
            errors.add("session_4", new ActionMessage("errors.session_1.required"));
          }
             if (getTrainingEvalutionKnowledge1().equals("")) {
            errors.add("training_evalution_knowledge_1", new ActionMessage("errors.training_evalution_knowledge_2.required"));
          }
                if (getTrainingEvalutionKnowledge2().equals("")) {
            errors.add("training_evalution_knowledge_2", new ActionMessage("errors.training_evalution_knowledge_2.required"));
          }
            // TODO: add 'error.name.required' key to your resources
        return errors;
    }
}
