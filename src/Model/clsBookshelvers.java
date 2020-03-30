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
public class clsBookshelvers implements Interface.InUpdate
{
  private int id;

    public clsBookshelvers() {
    }

    public clsBookshelvers(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return DAO.clsDelete.delete("Bookshelves",getId()); //To change body of generated methods, choose Tools | Templates.
    }
  
}
