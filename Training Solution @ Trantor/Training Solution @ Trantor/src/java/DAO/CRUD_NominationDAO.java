/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class CRUD_NominationDAO {
    Context ctx = null;
    Connection con = null;
    DataSource ds = null;   
    int res=0;
    public int insert(String[] emp_codes, Integer training_id, String attended){
        try {
            ctx = new InitialContext();
        } catch (NamingException ex) {
            Logger.getLogger(CRUD_NominationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ds = (DataSource) ctx.lookup("jdbc/Training_Solution_Pool");
            con = ds.getConnection();
            for(String emp_code:emp_codes){
                String insert_training1="insert into training_nominations (emp_code, training_id, attended) values('"+emp_code+"','"+training_id+"','"+attended+"' )";
                PreparedStatement pstmt = con.prepareStatement(insert_training1);
                res=pstmt.executeUpdate();   
            }
        } 
        catch (NamingException ex) {
            Logger.getLogger(CRUD_NominationDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CRUD_NominationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (con != null) {
                try {                
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD_NominationDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return res;
    } 
}