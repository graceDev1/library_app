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
public class clsBooks implements Interface.InUpdate
{
  private String id;
  private String title;
 
  private String Auther;

  private String Publisher;
  private String id_classification;

    public clsBooks() {
    }

    public clsBooks(String id, String title, String Auther, String Publisher, String id_classification) {
        this.id = id;
        this.title = title;
        this.Auther = Auther;
        this.Publisher = Publisher;
        this.id_classification = id_classification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return Auther;
    }

    public void setAuther(String Auther) {
        this.Auther = Auther;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getId_classification() {
        return id_classification;
    }

    public void setId_classification(String id_classification) {
        this.id_classification = id_classification;
    }

   

    @Override
    public boolean Update() throws Exception {
       
        return DAO.clsSaveData.Save(this);
    }

    @Override
    public boolean Delete() throws Exception {
        return DAO.clsUpdate.Update(this);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Modifiy() throws Exception {
        return DAO.clsDelete.deleteb("Books",getId());//To change body of generated methods, choose Tools | Templates.
    }
  
}
