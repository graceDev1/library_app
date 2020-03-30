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
public class clsDelete 
{
  private static PreparedStatement pst=null;
  public static boolean delete(String table,int i)
  {
      try {
          
          pst=clsConnection.getInstance().prepareStatement("delete from '"+table+"' where id='"+i+"'");
          pst.executeUpdate();
          return true;
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  return false;
  }
  
  public static boolean deleteb(String table,String i)
  {
      try {
          
          pst=clsConnection.getInstance().prepareStatement("delete from '"+table+"' where id='"+i+"'");
          pst.executeUpdate();
          return true;
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  return false;
  }
  
}
