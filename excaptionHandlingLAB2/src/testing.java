
public class testing {
    
    public static void main(String args[]){
        
        try{
        example2 e1 = new example2();
        e1.setData(1.2,"se6");
        }
        
        catch(IllegalArgumentException e2){
            System.out.println("IllegalArgumentException accours");
        }
        
        catch(InvalidProgramException e3){
            System.out.println("InvalidProgramException accour");
        }
        
       
    }
    
}
