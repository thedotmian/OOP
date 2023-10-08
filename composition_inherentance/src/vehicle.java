
public class vehicle {
   private String color;
     private int max_speed;

    public void setColour(String colour) {
        this.color = colour;
    }
    
    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
     
     public void printCarDetails(){
         System.out.println("car color :"+color+"  Top Speed :"+max_speed);
     }
}
