/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author irene
 */
public class clsBooks_lended implements Interface.InUpdate
{
 
    private int id;
    private String id_book;
           private int id_reader;
    private Date date;

    public clsBooks_lended() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_book() {
        return id_book;
    }

    public void setId_book(String id_book) {
        this.id_book = id_book;
    }

    public int getId_reader() {
        return id_reader;
    }

    public void setId_reader(int id_reader) {
        this.id_reader = id_reader;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   
    @Override
    public boolean Update() throws Exception {
       return DAO.clsSaveData.Save(this);
    }

    @Override
    public boolean Delete() throws Exception {
        return DAO.clsUpdate.Update(this); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Modifiy() throws Exception {
        return DAO.clsDelete.delete("Books_lended",getId());//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
