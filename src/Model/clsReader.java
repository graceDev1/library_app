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
public class clsReader implements Interface.InUpdate
{
 private int id;
 private String First_name,Last_name;
 private String option,classe;
 private int id_readerType;

    public clsReader() {
    }

    public clsReader(int id, String First_name, String Last_name, String option, String classe, int id_readerType) {
        this.id = id;
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.option = option;
        this.classe = classe;
        this.id_readerType = id_readerType;
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

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getId_readerType() {
        return id_readerType;
    }

    public void setId_readerType(int id_readerType) {
        this.id_readerType = id_readerType;
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
        return DAO.clsDelete.delete("Reader", getId()); //To change body of generated methods, choose Tools | Templates.
    }
 
 
}
