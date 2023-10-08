
public class MotherBoard {
    private String model;
    private String manufature;
    private int ramslot;

    public MotherBoard(String model, String manufature, int ramslot) {
        this.model = model;
        this.manufature = manufature;
        this.ramslot = ramslot;
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

    public int getRamslot() {
        return ramslot;
    }

    public void setRamslot(int ramslot) {
        this.ramslot = ramslot;
    }
    
    void loadprogram(String p){
        System.out.println("program loading" +p);
        
        
        
    }

    @Override
    public String toString() {
        return "MotherBoard{" + "model=" + model + ", manufature=" + manufature + ", ramslot=" + ramslot + '}';
    }
            
    
}
