/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1;

import java.util.List;

/**
 *
 * @author Amr El-Agoz
 */
public interface PyramidInterface {

    /**
     *
     * @param filename
     * @return 
     */
    public List readfromCSV(String filename);
    public Pyramid createPyramid(String[] metaData);
}
