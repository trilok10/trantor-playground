/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author gurpreet.singh
 */
public class CRUD_TrainingDAO {
    Context ctx = null;
    Connection con = null;
    DataSource ds = null;    
    public static final String insert_training="insert into training values (?,?,?,?,?,?,?)";
    int res=0;
    public int insert(String name, String topic, String mentor, String external, String date_from, String date_to, String duration){
        try {
            ctx = new InitialContext();
        }
        catch (NamingException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ds = (DataSource) ctx.lookup("jdbc/Training_Solution_Pool");
            con = ds.getConnection();
            String insert_training1="insert into training (name,duration,topic,mentor,external,date_from,date_to) values ('"+name+"',"+Integer.parseInt(duration)+",'"+topic+"','"+mentor+"','"+external+"','"+date_from+"','"+date_to+"' )";
            PreparedStatement pstmt = con.prepareStatement(insert_training1);
            res=pstmt.executeUpdate();    
        }
        catch (NamingException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            if (con != null) {
                try {                
                    con.close();
                } 
                catch (SQLException ex) {
                    Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return res;
    } 
    
    public ResultSet retrieve(){
        Integer id = null;
        ResultSet rs = null;
        try {
            ctx = new InitialContext();
        } catch (NamingException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ds = (DataSource) ctx.lookup("jdbc/Training_Solution_Pool");
            con = ds.getConnection();
            String retrieve_training1 = "select * from training ";
            PreparedStatement pstmt = con.prepareStatement(retrieve_training1);
            rs = pstmt.executeQuery();  
            //id = rs.getInt(8);
        }
        catch (NamingException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (con != null) {
                try {                
                    con.close();
                } 
                catch (SQLException ex) {
                    Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return rs;
    }
    
    
     public Integer retrieveId(){
        Integer id = null;
        ResultSet rs = null;
        try {
            ctx = new InitialContext();
        } catch (NamingException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ds = (DataSource) ctx.lookup("jdbc/Training_Solution_Pool");
            con = ds.getConnection();
            String retrieve_training1 = "select * from training order by id desc limit 1";
            PreparedStatement pstmt = con.prepareStatement(retrieve_training1);
            rs = pstmt.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
        }
        catch (NamingException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (con != null) {
                try {                
                    con.close();
                } 
                catch (SQLException ex) {
                    Logger.getLogger(CRUD_TrainingDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return id;
    }
}