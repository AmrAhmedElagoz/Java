/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package better;

public class Better {

    public static void main(String[] args) {
        String Str1= "123";
        String Str2= "1234";
        
        String longer= StringUtils.betterString(Str1, Str2, (S1, S2)-> S1.length() > S2.length());
        System.out.println(longer);
        String first = StringUtils.betterString(Str1, Str2, (S1, S2) -> true);
        System.out.println(first);
        
        
    }
    
}
