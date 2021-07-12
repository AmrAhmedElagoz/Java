package proj0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Proj0 {

    public static void main(String[] args) throws IOException {
        while(true){
            System.out.println("Enter Data: ");
            Scanner sc= new Scanner(System.in);
            String data= sc.nextLine();
            File file= new File("out.txt");
            FileWriter fw= new FileWriter(file, true);
            try (PrintWriter pw = new PrintWriter(fw)) {
                if("stop".equals(data)){
                    break;
                }
                pw.println(data);
            }
    }
    
}
}
