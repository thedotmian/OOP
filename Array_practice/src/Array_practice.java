
import java.util.Scanner;

class Array_practice {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);       
      int[] mylist1={2,3,5,7,11,13,17,19,23,29}; //static array
      
      System.out.println(mylist1[3]);//direct access
      for(int i=0;i< mylist1.length;i++)
      {
           System.out.println(mylist1[i]);//sequential access
      }     
       System.out.println("Dynamic Array");
       int size;
       System.out.println( " Enter the size of array");
        size=input.nextInt();     
        int[] mylist2= new int[size]; //Dynamic array     
        System.out.println("Enter values");
         for(int i=0; i<mylist2.length; i++)
         {
             mylist2[i]= input.nextInt();       }       
         for(int i=0; i<mylist2.length; i++)
         {
       System.out.println("Element at index "+i+" "+mylist2[i]);
       
         }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    }
    
}
