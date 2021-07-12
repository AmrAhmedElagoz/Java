/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1;

/**
 *
 * @author Amr El-Agoz
 */
public class Pyramid {
    String Pharaoh;
    String Modern_name;
    String Site;
    double Height;
    String Material;
    
    public void setPharaoh(String Pharaoh){
        this.Pharaoh= Pharaoh;
    }
    public String getPharaoh(){
        return Pharaoh;
    }
    
    public void setModern_name(String Modern_name){
        this.Modern_name= Modern_name;
    }
    public String getModern_name(){
        return Modern_name;
    }
    
    public void setSite(String Site){
        this.Site= Site;
    }
    public String getSite(){
        return Site;
    }
    
    public void setHeight(double Height){
        this.Height= Height;
    }
    public double getHeight(){
        return Height;
    }
    
    public void setMaterial(String Material){
        this.Material= Material;
    }
    public String getMaterial(){
        return Material;
    }
    
    
}
