
public class main {
    public static void main(String args[]){
        author au=new author("ali","aliauthor@gmail.com", "male");
        
        
        book b = new book("English",au,500,787);
        
//        b.getName();
//        b.getAuthor();
//        b.setPrice(500);
//        b.getPrice();
//        b.setQyt(19);
     b.getQyt();
       System.out.println(b);
//        
        
       
        
        
    }
}
