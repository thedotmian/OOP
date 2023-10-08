
public class example1 {
    public static void main(String args []){
       
        try{
            int A []= new int [2];
             A[3]=890;
            int x=10;
            int y =0;
            int z=x/y;
             
           System.out.println("will i execute");
        }
        
        catch(ArithmeticException e){
            System.out.println("ArithmeticException accour");
        
    }
        
            catch(ArrayIndexOutOfBoundsException ee){
            System.out.println("ArrayIndexOutOfBoundsException accour");
        
    }
        
    }
    
}
