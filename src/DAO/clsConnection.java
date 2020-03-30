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
public class clsConnection 
{
  private static Connection con;
  private String url="jdbc:mysql://localhost:3306/librarie";
  private String use="root";
  private String pass="";
 private clsConnection()
 {
     try {
         con=DriverManager.getConnection(url, use,pass);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
     }
 }
 
 public static Connection getInstance()
 {
     if (con==null) 
     {
       new clsConnection();
     }
     return con;
 }
}
