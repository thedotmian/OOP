
public class book {
    
    private String name;
    private double price;
    private int qyt;
    public author author;
    
    public book (String name, author author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
        
    }
    
    public book (String name, author author,double price, int qyt){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qyt=qyt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQyt() {
        return qyt;
    }

    public void setQyt(int qyt) {
        this.qyt = qyt;
    }

    public author getAuthor() {
        return author;
    }

    public void setAuthor(author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book{" + "name=" + name + ", price=" + price + ", qyt=" + qyt + ", author=" + author + '}';
    }

    
    
    
}
