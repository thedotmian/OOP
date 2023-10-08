
public class dog  extends cat{
    cat cat;
    
    dog(cat cat){
        this.eat=cat.eat;
        this.size=cat.size;
        this.walk=cat.walk;
    }

    @Override
    public String toString() {
        return "dog{" + "eat=" + eat + ", walk=" + walk + ", size=" + size + '}';
    }
    
}
