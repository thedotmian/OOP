import java.util.Scanner;
import javax.swing.JOptionPane;
public class reverse_inputed_array {

public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int A[]=new int[5];
    int rev[]= new int [5];
    int negative=4;
                for(int i=0; i<A.length; i++)
                {
                    System.out.println("Enter number in " +i+" index of Array");
                    A[i]=input.nextInt();
                    rev[negative]=A[i];
                    negative--;
                }
         //now print array rev[negative] 
         
                System.out.println("\t\t NOW VALUES ARE IN REVERSE ORDER");
                  for(int i=0; i<rev.length; i++)
                {
                    System.out.println("\t\t"+rev[i]);
                }
        
}

}
