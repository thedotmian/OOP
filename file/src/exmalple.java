
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class exmalple{
    public static void main(String arsg[]){
         String a="";
        try{
            File f1 = new File("E:\\MIAN ABDULRAHMAN IQBAL\\OOP Lab\\LAB_PROJECT\\Register_DATA.txt");
           Scanner input =new Scanner(f1);
            FileReader fr = new FileReader(f1);
         //   BufferReader br = new BufferReader (input);
          StringBuffer sb = new StringBuffer();
            while(input.hasNext()){
               
                a=input.next();
                if(a.equals("909")){
                    System.out.println("datat found");
                    System.out.println(a);

                }
                else{
                    
                }
                System.out.println(a);
                          }
            
            
        }
        
        catch(Exception e){
            
        }
        
        
    }
    
}