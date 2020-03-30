/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author irene
 */
public class clsSecure 
{
     private static ResultSet rst=null;
     private PreparedStatement pst=null;
     
     public void Entre(JTextField txtuse,JPasswordField pswd,JFrame frm1,JFrame frm2)
     {
         try {
              pst=clsConnection.getInstance().prepareStatement("select * from tlogin where user='"+txtuse.getText()+"' and "
                      + " password='"+pswd.getText()+"'");
              rst=pst.executeQuery();
              if (rst.next()) 
              {
                frm1.setVisible(false);
                frm2.setVisible(true);
                 
             }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
         }
    
     }
}
