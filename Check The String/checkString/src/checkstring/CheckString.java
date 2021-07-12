


package checkstring;

public class CheckString {

    
    public static void main(String[] args) {
        String s= null;
        if(s == null || "".equals(s))s="1";
        boolean allLetters = s.chars().allMatch(Character::isLetter);
        System.out.println(allLetters);
    }  
}
