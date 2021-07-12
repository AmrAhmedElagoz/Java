/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1;

import static java.awt.PageAttributes.MediaType.C;
import static java.awt.PageAttributes.MediaType.D;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author Amr El-Agoz
 */
public class Proj1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readfromCSV("C:\\Users\\Amr El-Agoz\\Desktop\\pyramids.csv");
        
  
//        List<Pyramid> list;
//        list = new ArrayList<>();
            
        pyramids.sort(Comparator.comparingDouble(Pyramid::getHeight));
        pyramids.forEach(pi -> {
            System.out.println(pi.getHeight());
        });
        Map<String, Long> sortSite= pyramids.stream().collect(Collectors.groupingBy((Pyramid p)-> p.Site, Collectors.counting()));
        sortSite.forEach((x, y)-> System.out.println(x+" "+y));
        
    }
    
    
    
}
