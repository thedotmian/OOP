
public class example2  {
    
    public void setData(double gpa , String p) throws IllegalArgumentException,InvalidProgramException{
        
        if(gpa<1.5){
            throw new IllegalArgumentException();
        }
        else{
            if(p!="se"){
                
                throw new InvalidProgramException(p);
            }
            else{
                System.out.println("registred");
            }
           // System.out.println("sucess");
        }
    }
    
}
