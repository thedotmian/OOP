import java.util.Scanner;
import javax.swing.JOptionPane;
public class lets_Handle_Exception {
    public static void main(String args[]){
         try
         {
        Scanner input = new Scanner(System.in);
        int a,b;
        JOptionPane.showMessageDialog(null, "only for division");
        System.out.println("enter 1st number");
        a=input.nextInt();
         System.out.println("enter 2nd number");
        b=input.nextInt();
        //values will be get by the user
       
        System.out.println("Answer : "+a/b);
        }
         catch(Exception e){
             System.out.println("exception is running \n" + e);
         }
   
        
        //line cannot execute if exception accour
        System.out.println("exception solved");
      // you know what is the problem .Exception in thread
      
        //WE done it remember the sysntax of Exception handling;
    }
    
}
