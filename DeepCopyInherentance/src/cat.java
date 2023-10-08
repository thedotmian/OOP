
public class cat {
    String eat,walk,size;
    
    cat(){
        eat="";
        walk="";
        size="";
    }

    public cat(String eat, String walk, String size) {
        this.eat = eat;
        this.walk = walk;
        this.size = size;
    }

    @Override
    public String toString() {
        return "cat{" + "eat=" + eat + ", walk=" + walk + ", size=" + size + '}';
    }
    
    
}
