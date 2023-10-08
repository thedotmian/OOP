
import java.util.Random;


public class Pass_Genrator {
    
    public static void main(String[] args)    
    {        
      	String[] arr1={"1", "2", "3", "4", "5", "0", "6", "7", "8", "9"};
        String[] arr2={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j","k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x", "y", "z"};
        String[] arr3={"@", "#", "%", "&", "*", "_", "+", "=", "."};

      	Random r=new Random(); 
        
      	int randomNumber1=r.nextInt(arr1.length);
        int randomNumber2=r.nextInt(arr2.length);
        int randomNumber3=r.nextInt(arr3.length);
       
        
        int randomNumber5=r.nextInt(arr1.length);
        int randomNumber6=r.nextInt(arr2.length);
        int randomNumber7=r.nextInt(arr3.length);
     
      	System.out.println(arr1[randomNumber1] + arr2[randomNumber2] + arr3[randomNumber3] + arr1[randomNumber5]+ arr2[randomNumber6]+ arr3[randomNumber7] );
    }
    
}
