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
public class clsAuthor implements Interface.InUpdate
{
private int id;
private String First_name,Last_name;

    public clsAuthor() {
    }

    public clsAuthor(int id, String First_name, String Last_name) {
        this.id = id;
        this.First_name = First_name;
        this.Last_name = Last_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    @Override
    public boolean Update() throws Exception {
        return DAO.clsSaveData.Save(this);
    }

    @Override
    public boolean Delete() throws Exception {
        return  DAO.clsUpdate.Update(this);
    }

    @Override
    public boolean Modifiy() throws Exception {
       return DAO.clsDelete.delete("Author",getId());
    }


}
