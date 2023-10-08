
public class PC { 
    //public static void main(String [] args){
    private MotherBoard mb;
    private Case cc ;
  private button bb;
    
    public PC(MotherBoard mb, Case cc , button bb){
    this.mb=mb;
    this.cc=cc;
    this.bb= bb;
   
        
    }

    public MotherBoard getMb() {
        return mb;
    }

    public void setMb(MotherBoard mb) {
        this.mb = mb;
    }

   

   
    public Case getCc() {
        return cc;
    }

    public void setCc(Case cc) {
        this.cc = cc;
    }

    public button getBb() {
        return bb;
    }

    public void setBb(button bb) {
        this.bb = bb;
    }

    @Override
    public String toString() {
        return "PC{" + "mb=" + mb + ", cc=" + cc + ", bb=" + bb + '}';
    }
       
//     void exception(){
//         
//         int a=5;
//         int b=0;
//         try{
//             System.out.println(a/b);
//         }
//         catch(Exception e){
//             System.out.println("Exception accour");
//         }
     }
    
    
    
    

