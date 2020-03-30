/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author irene
 */
public class clsBooks_request implements Interface.InUpdate
{
 private int id;
 private Date date;
 private int id_reader;
        private String id_books;

    public clsBooks_request() {
    }

    public clsBooks_request(int id, Date date, int id_reader, String id_books) {
        this.id = id;
        this.date = date;
        this.id_reader = id_reader;
        this.id_books = id_books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId_reader() {
        return id_reader;
    }

    public void setId_reader(int id_reader) {
        this.id_reader = id_reader;
    }

    public String getId_books() {
        return id_books;
    }

    public void setId_books(String id_books) {
        this.id_books = id_books;
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
        return DAO.clsDelete.delete("Books_request",getId()); //To change body of generated methods, choose Tools | Templates.
    }
 
}
