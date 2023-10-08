
import java.util.Scanner;


public class find_integers {
    public static void main(String args[]){
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("HOW MUCH VALUES YOU WANT TO ENTER");
        a=input.nextInt();
        int A[]=new int[a];
        for(int i=0; i<A.length; i++)
        {
            System.out.println("enter value in "+i+" INDEX");
            A[i]=input.nextInt();
        }
        System.out.println("ENTER NUMBER THAT U WANNA SEARCH !");
        int sear=input.nextInt();
        int count=0;
         for(int i=0; i<A.length; i++)
        {
            if(sear==A[i]){
           count++;
            
           }
            else{
               // System.out.println("NOT EXIST");
            }
            
                
        }
         System.out.println("\t\ttotal "+count+" results are found");
         if(count!=0)
         {
             System.out.println("\t\tData exist");
         }
         else{
             System.out.println("\t\tData not found");
         }
    }
    
}
