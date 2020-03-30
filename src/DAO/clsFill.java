/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.JXTable;
/**
 *
 * @author irene
 */
public class clsFill 
{
   private PreparedStatement pst=null;
   private ResultSet rst=null;
    public void Fill(JXTable tab,String rqt)
    {
        try 
        {
          pst=clsConnection.getInstance().prepareStatement(rqt);
          rst=pst.executeQuery();
          tab.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //POUR REMPLIR DANS LE COMBOBOX
    
    public void FillCombo(JComboBox cmb,int i)
    {
        cmb.removeAllItems();
        String requete="select id,Category from Reader_type";
        try {
            pst=clsConnection.getInstance().prepareStatement(requete);
            rst=pst.executeQuery();
            while (rst.next()) 
            {                
               i=rst.getInt("id");
               int c=rst.getInt("id");
               cmb.addItem(c);
            }
            
        } catch (Exception e) 
        {
            
        }
        
    }
    public void selected(String table,JTextField txt,String champ)
        {
        String rqt="select id from '"+table+"' where '"+champ+"'='"+txt.getText()+"' ";
        
        }
    
    public void Fille(JTable tab,String rqt)
    {
        try 
        {
          pst=clsConnection.getInstance().prepareStatement(rqt);
          rst=pst.executeQuery();
          tab.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
