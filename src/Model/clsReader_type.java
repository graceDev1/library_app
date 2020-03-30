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
public class clsReader_type implements Interface.InUpdate
{
   private int id;
   private String category;
   private int MaxBoook,Maxtime,Penality;

    public clsReader_type() {
    }

    public clsReader_type(int id, String category, int MaxBoook, int Maxtime, int Penality) {
        this.id = id;
        this.category = category;
        this.MaxBoook = MaxBoook;
        this.Maxtime = Maxtime;
        this.Penality = Penality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getMaxBoook() {
        return MaxBoook;
    }

    public void setMaxBoook(int MaxBoook) {
        this.MaxBoook = MaxBoook;
    }

    public int getMaxtime() {
        return Maxtime;
    }

    public void setMaxtime(int Maxtime) {
        this.Maxtime = Maxtime;
    }

    public int getPenality() {
        return Penality;
    }

    public void setPenality(int Penality) {
        this.Penality = Penality;
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
        return DAO.clsDelete.delete("Reader_type", getId()); //To change body of generated methods, choose Tools | Templates.
    }
   
           
}
