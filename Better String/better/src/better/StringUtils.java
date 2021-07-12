/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package better;

import java.util.function.BiPredicate;

/**
 *
 * @author Amr El-Agoz
 */
public class StringUtils {
    public static String betterString(String S1, String S2, BiPredicate<String, String> p){
        if(p.test(S1, S2)) return S1;
        else return S2;
    }
}
