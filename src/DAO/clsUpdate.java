/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Model.*;
import javax.swing.*;
/**
 *
 * @author irene
 */
public class clsUpdate 
{
  private static PreparedStatement pst=null;
    
     public static boolean Update(Object obj) {

        if (obj instanceof clsAuthor) {
            clsAuthor auth = (clsAuthor) obj;
            try {
                pst = clsConnection.getInstance().prepareStatement("update author set First_name=?Last_name=? where id=?");
                pst.setInt(1, auth.getId());
                pst.setString(2, auth.getFirst_name());
                pst.setString(3, auth.getLast_name());
                pst.executeUpdate();
                return true;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else if (obj instanceof clsBooks) 
        {
            clsBooks book = (clsBooks) obj;
            try {
                pst = clsConnection.getInstance().prepareStatement("update books set title=?,author=?,publisher=?,classification=? where id=? ");
                 pst.setString(5,book.getId());
                pst.setString(1,book.getTitle());
                 pst.setString(2,book.getAuther());
                  pst.setString(3,book.getPublisher());
                   pst.setString(4,book.getId_classification());
                pst.executeUpdate();
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        else if (obj instanceof clsBooks_lended)
        {
            clsBooks_lended lend=(clsBooks_lended)obj;
            try {
                 pst=clsConnection.getInstance().prepareStatement("update books_lended set Date_l=?,id_Book=?,id_reader=? where id=?");
                 pst.setInt(4,lend.getId());
                 pst.setDate(1, (Date) lend.getDate());
                 pst.setString(2,lend.getId_book());
                 pst.setInt(3,lend.getId_reader());
                 pst.executeUpdate();
                 return true;
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
             
         }
        else if (obj instanceof clsBooks_request) 
        {
          clsBooks_request req=(clsBooks_request)obj;
            try {
                pst=clsConnection.getInstance().prepareStatement("update books_request set Date_r=?,id_reader=?,id_books=? where id=? ");
                pst.setInt(4,req.getId());
                pst.setDate(1, (Date) req.getDate());
                pst.setInt(2, req.getId_reader());
                pst.setString(3,req.getId_books());
                pst.executeUpdate();
                return true;
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
         }
        
        else if (obj instanceof clsCard) 
        {
             clsCard card=(clsCard)obj;
             try {
               pst=clsConnection.getInstance().prepareStatement("update card set id_books=? set id=?");
               pst.setInt(2,card.getId());
               pst.setInt(1,card.getId_books());
               pst.executeUpdate();
               return true;
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
         }
        else if (obj instanceof clsClassification) 
        {
           clsClassification clas=(clsClassification)obj;
            try {
               pst=clsConnection.getInstance().prepareStatement("update Classification set description=?,ID_bookshelves=?"
                       + " where id=?");
               pst.setInt(3,clas.getId());
               pst.setString(1,clas.getDescription());
               pst.setInt(2,clas.getId_bookshelves());
               pst.executeUpdate();
               return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
         }
        else if (obj instanceof clsCopy) 
        {
            clsCopy copy=(clsCopy)obj;
            try {
              pst=clsConnection.getInstance().prepareStatement("update copy set id_books=?,count=? where id=?");
              pst.setInt(3,copy.getId());
              pst.setInt(1,copy.getId_books());
              pst.setInt(2,copy.getNumber());
              pst.executeUpdate();
              return true;
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
             
         }
        else if (obj instanceof clsReader) 
        {
            clsReader reader=(clsReader)obj;
           
            try 
            {
               pst=clsConnection.getInstance().prepareStatement("update reader set First_name=?,Last_name=?,section_cl=?,classe=?,ID_Readers_types=?"
                       + " where id=?"); 
               pst.setInt(6,reader.getId());
               pst.setString(1,reader.getFirst_name());
               pst.setString(2,reader.getLast_name());
               pst.setString(3, reader.getOption());
               pst.setString(4,reader.getClasse());
               pst.setInt(5,reader.getId_readerType());
               pst.executeUpdate();
              return true;
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
     
         }
        else if(obj instanceof clsReader_type)
        {
        clsReader_type type=(clsReader_type)obj;
            try 
            {
                pst=clsConnection.getInstance().prepareStatement("update Reader_type set Category=?,Max_books=?,Max_time=?,Penality=?"
                        + " where id=?");
                pst.setInt(5,type.getId());
                pst.setString(1,type.getCategory());
                pst.setInt(2,type.getMaxBoook());
                pst.setInt(3,type.getMaxtime());
                pst.setInt(4,type.getPenality());
                
                pst.executeUpdate();
              return true;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    
        return false;
    }  
}
