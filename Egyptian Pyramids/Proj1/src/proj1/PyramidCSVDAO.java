/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1;

import java.awt.PageAttributes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amr El-Agoz
 */
public class PyramidCSVDAO implements PyramidInterface{
    
    /**
     *
     * @param filename
     * @return
     */
    public List readfromCSV(String filename){
        List<Pyramid> L= new ArrayList<>();
        File file= new File(filename);
        String line;
        try{
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            line=br.readLine();
            while((line= br.readLine()) != null){
                String[] values;
                values = line.split(",");
                Pyramid p= createPyramid(values);
                L.add(p);
            }
        }catch(FileNotFoundException e){} catch (IOException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return L;
    };

    /**
     *
     * @param metaData
     * @return
     */
    @Override
    public Pyramid createPyramid(String[] metaData){
        Pyramid p= new Pyramid();
        p.setPharaoh(metaData[0]);
        if(metaData[7].isEmpty()){
            p.setHeight(0);
        }
        else{
            p.setHeight(Double.parseDouble(metaData[7]));
        }
        p.setMaterial(metaData[14]);
        p.setModern_name(metaData[2]);
        p.setSite(metaData[4]);
        
        return p;
    }
    /*
    @Override
    public void run(){
        try{
            
           }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
    */

    List<Pyramid> readfromCSV(PageAttributes.MediaType D) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

