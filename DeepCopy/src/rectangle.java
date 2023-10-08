
public class rectangle {
private int length;
private int bredth;

                rectangle(){
                    length=0;
                    bredth=0;
         }
                
            rectangle(int a, int b){
               length=a;
                bredth=b;  
            }
            
            rectangle(rectangle r){
                length=r.length;
                bredth=r.bredth;
                
            }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBredth() {
        return bredth;
    }

    public void setBredth(int bredth) {
        this.bredth = bredth;
    }
            
          int  area(){
                int area = length*bredth;
                System.out.println(area);
                return area;
            }

    @Override
    public String toString() {
        return "rectangle{" + "length=" + length + ", bredth=" + bredth + '}';
    }

    
          
}
