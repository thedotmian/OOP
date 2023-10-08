
public class dog extends animal{
    
   dog(){
      // super();
     System.out.println("dog constructor");
 } 
    
    public String type = "memals";
    
    void printType(){
        System.out.println(type);
       // super.type;
        System.out.println(super.type);
    }
    
    void bark(){
        super.eat();
        System.out.println("Dog barks");
        
    }
    
   //overriding method
    @Override
    void displayinfo(){
        super.eat();
        super.displayinfo();
        System.out.println("this is dog");
    }
    //we can call very method from the parent class WWITH THE HELP of
    //super keyword
    //super.name of method
    //
}
