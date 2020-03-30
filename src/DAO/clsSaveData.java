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
public class clsSaveData 
{
    private static PreparedStatement pst=null;
    
     public static boolean Save(Object obj) {

        if (obj instanceof clsAuthor) {
            clsAuthor auth = (clsAuthor) obj;
            try {
                pst = clsConnection.getInstance().prepareStatement("insert into Author(id,First_name,Last_name) "
                        + "values(?,?,?)");
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
                pst = clsConnection.getInstance().prepareStatement("insert into books(id,title,author,publisher,classification"
                        + ") values(?,?,?,?,?)");
               pst.setString(1,book.getId());
                pst.setString(2,book.getTitle());
                 pst.setString(3,book.getAuther());
                  pst.setString(4,book.getPublisher());
                   pst.setString(5,book.getId_classification());
               
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
                 pst=clsConnection.getInstance().prepareStatement("insert into books_lended(id,Date_l,id_Book,id_reader) values(?,?,?,?)");
                 pst.setInt(1,lend.getId());
                 pst.setDate(2, (Date) lend.getDate());
                 pst.setString(3,lend.getId_book());
                 pst.setInt(4,lend.getId_reader());
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
                pst=clsConnection.getInstance().prepareStatement("insert into books_request(id,Date_r,id_reader,id_books)"
                        + "values(?,?,?,?)");
                pst.setInt(1,req.getId());
                pst.setDate(2, (Date) req.getDate());
                pst.setInt(3, req.getId_reader());
                pst.setString(4,req.getId_books());
                pst.executeUpdate();
                return true;
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
         }
        else if (obj instanceof clsBookshelvers) {
            clsBookshelvers chelver=(clsBookshelvers)obj;
            try {
               pst=clsConnection.getInstance().prepareStatement("insert into Bookshelvers(id) values(?)");
               pst.setInt(1,chelver.getId());
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
               pst=clsConnection.getInstance().prepareStatement("insert into card(id,id_books) values(?,?)");
               pst.setInt(1,card.getId());
               pst.setInt(2,card.getId_books());
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
               pst=clsConnection.getInstance().prepareStatement("insert into classification(id,description,ID_bookshelves)"
                       + " values(?,?,?)");
               pst.setInt(1,clas.getId());
               pst.setString(2,clas.getDescription());
               pst.setInt(3,clas.getId_bookshelves());
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
              pst=clsConnection.getInstance().prepareStatement("insert into copy(id,id_books,count) values(?,?,?)");
              pst.setInt(1,copy.getId());
              pst.setInt(2,copy.getId_books());
              pst.setInt(3,copy.getNumber());
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
               pst=clsConnection.getInstance().prepareStatement("insert into reader(id,First_name,Last_name,section_cl,classe,ID_Readers_types)"
                       + " values(?,?,?,?,?,?)"); 
               pst.setInt(1,reader.getId());
               pst.setString(2,reader.getFirst_name());
               pst.setString(3,reader.getLast_name());
               pst.setString(4, reader.getOption());
               pst.setString(5,reader.getClasse());
               pst.setInt(6,reader.getId_readerType());
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
                pst=clsConnection.getInstance().prepareStatement("insert into Reader_type(id,Category,Max_books,Max_time,Penality)"
                        + " values(?,?,?,?,?)");
                pst.setInt(1,type.getId());
                pst.setString(2,type.getCategory());
                pst.setInt(3,type.getMaxBoook());
                pst.setInt(4,type.getMaxtime());
                pst.setInt(5,type.getPenality());
                
                pst.executeUpdate();
              return true;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    
        return false;
    }
}
