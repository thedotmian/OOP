
public class button {
    private String q , w ,e ;

    public button(String q, String w, String e) {
        this.q = q;
        this.w = w;
        this.e = e;
    }
    
    void hi(){
        System.out.println(" its HIII in Button");
    }

    @Override
    public String toString() {
        return "button{" + "q=" + q + ", w=" + w + ", e=" + e + '}';
    }
    
    
    
}
