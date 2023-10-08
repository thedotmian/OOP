
public class testing {
    public static void main(String args[]){
        rectangle r1 = new rectangle(2,3);
        rectangle r2 = new rectangle(r1); //Deep copy
        r2=r1;//shallow copy
         r1.setBredth(15);
         r2.setBredth(5);
        System.out.println(r1);
        
        System.out.println(r2);
        
        
    }
    
}
