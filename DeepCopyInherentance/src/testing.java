
public class testing {
    public static void main(String args[]){
        
    cat c1 = new cat("rooti" , "walk Skowly" , "small ");
    dog d1 = new dog(c1);
   c1=d1;
     c1.eat="sallooan";
        System.out.println(c1);
       c1.size="mogg";
        System.out.println(d1);
}
}