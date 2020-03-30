/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author irene
 */
public class clsCopy implements Interface.InUpdate
{
 private int id;
 private int id_books;
 private int number;

    public clsCopy() {
    }

    public clsCopy(int id, int id_books, int number) {
        this.id = id;
        this.id_books = id_books;
        this.number = number;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_books() {
        return id_books;
    }

    public void setId_books(int id_books) {
        this.id_books = id_books;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
        return DAO.clsDelete.delete("copy", getId()); //To change body of generated methods, choose Tools | Templates.
    }
 
}
