 
public class Testing {
    public static void main(String args[]){
        Case thecase=new Case("2204","DELL","240");
     button b1 = new button("aa", ":bb","cc");
        MotherBoard mb=new MotherBoard ("2289","intel",4);
        
        PC thepc = new PC(mb,thecase,b1);
        
      System.out.println(thepc);
        thepc.getMb().loadprogram("  net Beans");
        thepc.getCc().presspowerbutton();
       thepc.getBb().hi();
       
  
       
    }
    
}
