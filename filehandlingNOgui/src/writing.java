
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class writing {
    
    
    public static void main(String args[]){
        
        String a="ALI Haznla",b="",c="";
        
       
       try{
            
        File f1 = new File("D:\\New folder\\MIAN.txt");
       
        
        Scanner input = new Scanner(f1);
        
        while(input.hasNextLine()){
            b=input.nextLine();
            System.out.println(b);
            
            if(b.equals("ALI")){
                System.out.println("Matches");
            }
            else{
                System.out.println("no matches");
            }
            input.close();
        }
        
       }
       
       catch(Exception e){
           
       }


}
    
}
