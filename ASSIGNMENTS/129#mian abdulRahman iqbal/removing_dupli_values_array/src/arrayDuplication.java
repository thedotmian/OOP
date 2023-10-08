import java.util.Scanner;
public class arrayDuplication {
    public static void main(String args[]){
        
                Scanner input = new Scanner(System.in);
                int A[] = new int [3];
                System.out.println("ENTER VALUES");

                for(int i=0; i<A.length; i++)
                {
                    System.out.println("Enter value in "+i+"  index of the Array");
                    A[i]=input.nextInt();
              }
                int dup=0,g,x=0;
                
                for( g=0; g<A.length; g++)
                {
                for(int i=0; i<A.length; i++)
                {
                    if(A[g]==A[i])
                    {
                        if(g==i)
                        {
                        }
                        else{
                            x=A[i];
                        System.out.println("\t Duplicate found at "+i+" index is "+A[i]);
                        System.out.println("\t enter number to replace "); 
                        A[i]=input.nextInt();
                      
                        
                        while(A[i]==x){
                            System.out.println("\t\tyou cannot enter this num.again try another\n");
                             A[i]=input.nextInt();
                        }
                       
                    }
                    
                }
                
                }        
                
    }
                System.out.println("\n\tNOW YOUR DATA IS below ||N0|| dupl.exist now");
                for(int i=0; i<A.length; i++)
                {
                    System.out.println("\t\t"+A[i]);
                }
                System.out.println("|--code by---------------------------|");
                System.out.println("|------MIAN ABDUL-RAHMAN IQBAL-------|");
                System.out.println("|------------------------------------|");
    }
    
}
