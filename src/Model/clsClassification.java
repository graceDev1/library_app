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
public class clsClassification implements Interface.InUpdate
{
    private int id;
    private String description;
    private int id_bookshelves;

    public clsClassification() {
    }

    public clsClassification(int id, String description, int id_bookshelves) {
        this.id = id;
        this.description = description;
        this.id_bookshelves = id_bookshelves;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_bookshelves() {
        return id_bookshelves;
    }

    public void setId_bookshelves(int id_bookshelves) {
        this.id_bookshelves = id_bookshelves;
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
        return DAO.clsDelete.delete("Classification",getId()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
