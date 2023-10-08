
public class Case {
    private  String model;
    private  String manufature;
    private  String powersupply;

    public Case(String model, String manufature, String powersupply) {
        this.model = model;
        this.manufature = manufature;
        this.powersupply = powersupply;
    }
    
    void fun(){
        System.out.println("hiiiii its fun in CASe");
    }
            
    
     public void presspowerbutton(){
        System.out.println("press power button");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufature() {
        return manufature;
    }

    public void setManufature(String manufature) {
        this.manufature = manufature;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public void setPowersupply(String powersupply) {
        this.powersupply = powersupply;
    }

    @Override
    public String toString() {
        return "Case{" + "model=" + model + ", manufature=" + manufature + ", powersupply=" + powersupply + '}';
    }
    
   
    
}
