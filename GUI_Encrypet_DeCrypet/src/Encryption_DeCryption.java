import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Encryption_DeCryption implements ActionListener  {
 JLabel l1,l2,l3,l4;
 JTextField f1,f2,f3,f4;
 JButton b1,b2,b3,b4,b5,b6;
    
    Encryption_DeCryption(){
        JFrame f = new JFrame("Encryption & DeCription");
        l1=new JLabel("Your Message");
        l2=new JLabel("Encryption");
        l3=new JLabel("DeCryption");
       l4=new JLabel("if u want to save any message in a file write here and press button accordingly");

        l1.setBounds(50, 10, 100,50);
        l2.setBounds(50, 70, 100, 50);
        l3.setBounds(50, 130, 100, 50);
        l4.setBounds(50, 365, 500, 50);
        
        f1=new JTextField();
        f2=new JTextField();        
        f3=new JTextField();
        f4=new JTextField();
        
        f1.setBounds(150, 10, 270,50);
        f2.setBounds(150, 70, 270, 50);
        f3.setBounds(150, 130, 270, 50);
        f4.setBounds(50, 320, 390, 50);  
        
        b1=new JButton("Encryption");
        b2=new JButton("DeCryption");
        b3=new JButton("Read & Encrypt");
        b4=new JButton("Read & Decrypt");
        b5=new JButton("Save data encrypet file");
        b6=new JButton("save data in Decrypt file");
        b1.setBounds(25, 220, 100, 50);
        b2.setBounds(150, 220, 100, 50);
        b3.setBounds(275, 220, 130, 50);
        b4.setBounds(420, 220, 130, 50);
       b5.setBounds(50, 420, 180, 50);
        b6.setBounds(290, 420, 180, 50);
          
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        
        f.add(f1);
        f.add(f2);
        f.add(f3);
        f.add(f4);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        
         f.setSize(600,600);  
        f.setLayout(null);  
        f.setVisible(true);  
        
        
        b1.addActionListener(this);  
        b2.addActionListener(this);  
         b3.addActionListener(this);
          b4.addActionListener(this);
           b5.addActionListener(this);
            b6.addActionListener(this);
    }
    
  
    
    
    public static void main(String args[]){
      new Encryption_DeCryption();
       
    }

       

    public void actionPerformed(ActionEvent e) { 
           
             if(e.getSource()==b1){ 
                 
                 try{
                 File ff = new File("MessageEncryption.txt");
                 FileWriter fw =  new FileWriter(ff);
                 String txt;
                 txt=f1.getText();
                 fw.write(txt);
                 fw.close();
                 JOptionPane.showInputDialog(null,"data is also saved");
                 }
                 
                 catch(Exception e1){
                     
                 }
                 
           String s1 = new String();
            
            s1=f1.getText();
           char[] B = new char[s1.length()];
               
        for (int i = 0; i < s1.length(); i++) {
            B[i] = s1.charAt(i);
            
        }
        //2nd loop/_________________________
        Integer [] A = new Integer[B.length];
        int pass=0;
        String all="";
        
        for (int a = 0; a < B.length; a++) {
            if(B[a]==' '){
             A[a]=160+pass;
       }
         if(B[a]=='a'){
             A[a]=151+pass;
       }
        if(B[a]=='b')
	{
		A[a]=107+pass;
	}
	
		if(B[a]=='c')
	{
		A[a]=171+pass;
	}
	
		if(B[a]=='d')
	{
		A[a]=155+pass;
	}
	
		if(B[a]=='e')
	{
		A[a]=103+pass ;
	}
	
		if(B[a]=='f')
	{
		A[a]=154    +pass;
	}
	
		if(B[a]=='g')
	{
		A[a]=105+pass;
	}
	
		if(B[a]=='h')
	{
		A[a]=191+pass;
	}
	
		if(B[a]=='i')
	{
		A[a]=113+pass;
	}
	
		if(B[a]=='j')
	{
		A[a]=150+pass;
	}
	
		if(B[a]=='k')
	{
		A[a]=119+pass;
	}
	
		if(B[a]=='l')
	{
		A[a]=192+pass;
	}
	
		if(B[a]=='m')
	{
		A[a]=181+pass;
	}
	
		if(B[a]=='n')
	{
		A[a]=110+pass;
	}
	
		if(B[a]=='o')
	{
		A[a]=125+pass;
	}
	
		if(B[a]=='p')
	{
		A[a]=998+pass;
	}
	
		if(B[a]=='q')
	{
		A[a]=114+pass;
	}
	
		if(B[a]=='r')
	{
		A[a]=131+pass;
	}
	
		if(B[a]=='s')
	{
		A[a]=133+pass;
	}
	
		if(B[a]=='t')
	{
		A[a]=333+pass;
	}
	
		if(B[a]=='u')
	{
		A[a]=101+pass;
	}
	
		if(B[a]=='v')
	{
		A[a]=144+pass;
	}
	
		if(B[a]=='w')
	{
		A[a]=995+pass;
	}
	
		if(B[a]=='x')
	{
		A[a]=237+pass;
	}
	
		if(B[a]=='y')
	{
		A[a]=179+pass;
	}
	
		if(B[a]=='z')
	{
		A[a]=130+pass;
	}
	
                
		if(B[a]=='_')
	{
		A[a]=999+pass;
	}
                
                	if(B[a]=='.')
	{
		A[a]=143+pass;
	}
        }
       for(int i=0;i<A.length;i++){
           all=all+A[i];
       }
            f2.setText(all);
            
               try{
                 File ff = new File("Encryption.txt");
                 FileWriter fw =  new FileWriter(ff);
                 String txt;
                 txt=f1.getText();
                 fw.write(all);
                 fw.close();
                 JOptionPane.showMessageDialog(null,"data is also saved");
                 }
                 
                 catch(Exception e1){
                     
                 }
            
     
        }
             
             
             
             ////////1st Encryption Done here_____________
             
      //  ________________________________________________________________________     
             if(e.getSource()==b2){ 
                 
                 
                 
                  try{
                 File ff = new File("Message.txt");
                 FileWriter fw =  new FileWriter(ff);
                 String txt;
                 txt=f1.getText();
                 fw.write(txt);
                 fw.close();
                 JOptionPane.showMessageDialog(null,"Your message is Saved in File");
                 }
                 
                 catch(Exception e1){
                     
                 }
                 
                 
                 
            String s1 = new String();
            s1=f1.getText();
                 
        char[] C = new char[s1.length()];
       
             
        for (int i = 0; i < s1.length(); i++) {
            C[i] = s1.charAt(i);
            
       }
       
         int l=s1.length()/3;
         
           String B[]=new String [l];
            String A[]=new String [l];
           for(int i=0;i<l;i++){
               
               B[i]="";
           }
           
            String [] Q =new String[30]; 
           int p=0,q=0,m=3,y=0;
           
           String all="",comp="129",comp1="121";
                
               Q[0]="151";//a
               Q[1]="107";//b
               Q[2]="171";//c
               Q[3]="155";//d
               Q[4]="103";//e
               Q[5]="154";//f
               Q[6]="105";//g
               Q[7]="191";//h
               Q[8]="113";//i
               Q[9]="150";//j
               Q[10]="119";//k
               Q[11]="192";//l
               Q[12]="181";//m
               Q[13]="110";//n
               Q[14]="125"; //o    
               Q[15]="998";//p
               Q[16]="114";//q
               Q[17]="131";//r
               Q[18]="133";//s
               Q[19]="333";//t
               Q[20]="101";//u
               Q[21]="144";//v
               Q[22]="995";//w
               Q[23]="237";//x
               Q[24]="179";//y
               Q[25]="130";//z
               Q[26]="143";//.
               Q[27]="999";//_
               Q[28]="160";//a
               
            for(p=0;p<l;p++){
                
                for(q=y;q<m; q++){
                    B[p]=B[p]+C[q];
                }
               
               y=y+3;
               m=y+3;
               
               
               if(B[p].equals(Q[0])){
                   all=all+"a";
               }
               if(B[p].equals(Q[1])){
                  all=all+"b"; 
               }
               
               if(B[p].equals(Q[2])){
                   all=all+"c";
               }
               
               if(B[p].equals(Q[3])){
                   all=all+"d";
               }
               
               if(B[p].equals(Q[4])){
                   all=all+"e";
               }
               
               if(B[p].equals(Q[5])){
                   all=all+"f";
               }
               
               if(B[p].equals(Q[6])){
                   all=all+"g";
               }
               
               if(B[p].equals(Q[7])){
                   all=all+"h";
               } 
               
               if(B[p].equals(Q[8])){
                   all=all+"i";
               }
                
               if(B[p].equals(Q[9])){
                   all=all+"j";
               } 
               
               if(B[p].equals(Q[10])){
                   all=all+"k";
               }
                 
               if(B[p].equals(Q[11])){
                   all=all+"l";
               }
                
               if(B[p].equals(Q[12])){
                   all=all+"m";
               }
                
               if(B[p].equals(Q[13])){
                   all=all+"n";
               }
                
               if(B[p].equals(Q[14])){
                   all=all+"o";
               }
               
                
               if(B[p].equals(Q[15])){
                   all=all+"p";
               }
                
               if(B[p].equals(Q[16])){
                   all=all+"q";
               }
                
               if(B[p].equals(Q[17])){
                   all=all+"r";
               }
                
               if(B[p].equals(Q[18])){
                   all=all+"s";
               }
                
               if(B[p].equals(Q[19])){
                   all=all+"t";
               }
                
               if(B[p].equals(Q[20])){
                   all=all+"u";
               }
                
               if(B[p].equals(Q[21])){
                   all=all+"v";
               }
                
               if(B[p].equals(Q[22])){
                   all=all+"w";
               }
                
               if(B[p].equals(Q[23])){
                   all=all+"x";
               } 
               
               if(B[p].equals(Q[24])){
                   all=all+"y";
               }
                
               if(B[p].equals(Q[25])){
                   all=all+"z";
               }
                
               if(B[p].equals(Q[26])){
                   all=all+".";
               }
                
               if(B[p].equals(Q[27])){
                   all=all+"_";
               }
               
               if(B[p].equals(Q[28])){
                   all=all+" ";
               }
               
            }
            f3.setText(all);
            
               try{
                 File ff = new File("Decryption.txt");
                 FileWriter fw =  new FileWriter(ff);
                 fw.write(all);
                 fw.close();
                 JOptionPane.showMessageDialog(null,"data is also saved");
                 }
                 
                 catch(Exception e1){
                     
                 }
             




//             
//                String fin [] = new String [l]; 
//                
//            for(int i=0;i<l;i++){
//            
//                if(B[i].equalsIgnoreCase(Q[0])){
//                   fin[i]="a";
//              }
//                
//                else if(B[i].equalsIgnoreCase(Q[1])){
//                   fin[i]="b";
//              }
//                
//                    
//               else  if(B[i].equalsIgnoreCase(Q[2])){
//                   fin[i]="c";
//              }
//                
//                    
//              else   if(B[i].equalsIgnoreCase(Q[3])){
//                   fin[i]="d";
//              }
//                    
//                    
//              else   if(B[i].equalsIgnoreCase(Q[4])){
//                   fin[i]="e";
//              }
//                      
//                    
//              else   if(B[i].equalsIgnoreCase(Q[5])){
//                   fin[i]="f";
//              }     
//                    
//              else   if(B[i].equalsIgnoreCase(Q[6])){
//                   fin[i]="g";
//              }
//                
//                   
//             else    if(B[i].equalsIgnoreCase(Q[7])){
//                   fin[i]="h";
//              }
//                     
//                    
//              else   if(B[i].equalsIgnoreCase(Q[8])){
//                   fin[i]="i";
//              }     
//                    
//               else  if(B[i].equalsIgnoreCase(Q[9])){
//                   fin[i]="j";
//              }
//                     
//                    
//               else  if(B[i].equalsIgnoreCase(Q[10])){
//                   fin[i]="k";
//              }
//                     
//                    
//              else   if(B[i].equalsIgnoreCase(Q[11])){
//                   fin[i]="l";
//              }
//                     
//                    
//              else   if(B[i].equalsIgnoreCase(Q[12])){
//                   fin[i]="m";
//              }     
//                    
//             else    if(B[i].equalsIgnoreCase(Q[13])){
//                   fin[i]="n";
//              }     
//                    
//             else    if(B[i].equalsIgnoreCase(Q[14])){
//                   fin[i]="o";
//              }     
//                    
//             else    if(B[i].equalsIgnoreCase(Q[15])){
//                   fin[i]="p";
//              }     
//                    
//             else    if(B[i].equalsIgnoreCase(Q[16])){
//                   fin[i]="q";
//              }     
//                    
//            else     if(B[i].equalsIgnoreCase(Q[17])){
//                   fin[i]="r";
//              }
//                     
//                    
//               else  if(B[i].equalsIgnoreCase(Q[18])){
//                   fin[i]="s";
//              }
//                     
//                    
//              else   if(B[i].equalsIgnoreCase(Q[19])){
//                   fin[i]="t";
//              }
//                     
//                    
//               else  if(B[i].equalsIgnoreCase(Q[20])){
//                   fin[i]="u";
//              }     
//                    
//               else  if(B[i].equalsIgnoreCase(Q[21])){
//                   fin[i]="v";
//              }     
//                    
//                else if(B[i].equalsIgnoreCase(Q[22])){
//                   fin[i]="w";
//              }     
//                    
//               else  if(B[i].equalsIgnoreCase(Q[23])){
//                   fin[i]="x";
//              }     
//                    
//             else    if(B[i].equalsIgnoreCase(Q[24])){
//                   fin[i]="y";
//              }
//                     
//                    
//              else   if(B[i].equalsIgnoreCase(Q[25])){
//                   fin[i]="z";
//              }
//                     
//                    
//              else   if(B[i].equalsIgnoreCase(Q[26])){
//                   fin[i]=".";
//              }     
//                    
//             else    if(B[i].equalsIgnoreCase(Q[27])){
//                   fin[i]="_";
//              }
//                
//                String all2="";     
//           for( i=0;i<l; i++){
//               all2=all2+fin[i];
//               
//           }
//                f3.setText(all2);
                
                
                
                
                
                
                
                
                
}
             String global=null;
             if(e.getSource()==b3){ 
                  
                  try{
                  File f11 = new File("Decryption.txt");
                  FileReader fr = new FileReader(f11);
                  Scanner input = new Scanner(fr);
                  global=input.nextLine();
                  
                  }
                  
                  catch(Exception e4){
                  
              }
                  
                  f1.setText(global);
                  System.out.println(global);
             
             
             String s1 = new String();
            s1=global;
            s1=f1.getText();
           char[] B = new char[s1.length()];
               
        for (int i = 0; i < s1.length(); i++) {
            B[i] = s1.charAt(i);
            
        }
        //2nd loop/_________________________
        Integer [] A = new Integer[B.length];
        int pass=0;
        String all="";
        
        for (int a = 0; a < B.length; a++) {
            if(B[a]==' '){
             A[a]=160+pass;
       }
         if(B[a]=='a'){
             A[a]=151+pass;
       }
        if(B[a]=='b')
	{
		A[a]=107+pass;
	}
	
		if(B[a]=='c')
	{
		A[a]=171+pass;
	}
	
		if(B[a]=='d')
	{
		A[a]=155+pass;
	}
	
		if(B[a]=='e')
	{
		A[a]=103+pass ;
	}
	
		if(B[a]=='f')
	{
		A[a]=154    +pass;
	}
	
		if(B[a]=='g')
	{
		A[a]=105+pass;
	}
	
		if(B[a]=='h')
	{
		A[a]=191+pass;
	}
	
		if(B[a]=='i')
	{
		A[a]=113+pass;
	}
	
		if(B[a]=='j')
	{
		A[a]=150+pass;
	}
	
		if(B[a]=='k')
	{
		A[a]=119+pass;
	}
	
		if(B[a]=='l')
	{
		A[a]=192+pass;
	}
	
		if(B[a]=='m')
	{
		A[a]=181+pass;
	}
	
		if(B[a]=='n')
	{
		A[a]=110+pass;
	}
	
		if(B[a]=='o')
	{
		A[a]=125+pass;
	}
	
		if(B[a]=='p')
	{
		A[a]=998+pass;
	}
	
		if(B[a]=='q')
	{
		A[a]=114+pass;
	}
	
		if(B[a]=='r')
	{
		A[a]=131+pass;
	}
	
		if(B[a]=='s')
	{
		A[a]=133+pass;
	}
	
		if(B[a]=='t')
	{
		A[a]=333+pass;
	}
	
		if(B[a]=='u')
	{
		A[a]=101+pass;
	}
	
		if(B[a]=='v')
	{
		A[a]=144+pass;
	}
	
		if(B[a]=='w')
	{
		A[a]=995+pass;
	}
	
		if(B[a]=='x')
	{
		A[a]=237+pass;
	}
	
		if(B[a]=='y')
	{
		A[a]=179+pass;
	}
	
		if(B[a]=='z')
	{
		A[a]=130+pass;
	}
	
                
		if(B[a]=='_')
	{
		A[a]=999+pass;
	}
                
                	if(B[a]=='.')
	{
		A[a]=143+pass;
	}
        }
       for(int i=0;i<A.length;i++){
           all=all+A[i];
       }
            f2.setText(all);
        
        
    }
             
               if(e.getSource()==b4){
                   
                   
                   
                   try{
                  File f11 = new File("Encryption.txt");
                  FileReader fr = new FileReader(f11);
                  Scanner input = new Scanner(fr);
                  global=input.nextLine();
                  
                  }
                  
                  catch(Exception e14){
                  
              }
                   f1.setText(global);
                  // System.out.println(global);
                  
                  String s1 = new String();
                  s1=global;
            s1=f1.getText();
                 
        char[] C = new char[s1.length()];
       
             
        for (int i = 0; i < s1.length(); i++) {
            C[i] = s1.charAt(i);
            
       }
       
         int l=s1.length()/3;
         
           String B[]=new String [l];
            String A[]=new String [l];
           for(int i=0;i<l;i++){
               
               B[i]="";
           }
           
            String [] Q =new String[30]; 
           int p=0,q=0,m=3,y=0;
           
           String all="",comp="129",comp1="121";
                
               Q[0]="151";//a
               Q[1]="107";//b
               Q[2]="171";//c
               Q[3]="155";//d
               Q[4]="103";//e
               Q[5]="154";//f
               Q[6]="105";//g
               Q[7]="191";//h
               Q[8]="113";//i
               Q[9]="150";//j
               Q[10]="119";//k
               Q[11]="192";//l
               Q[12]="181";//m
               Q[13]="110";//n
               Q[14]="125"; //o    
               Q[15]="998";//p
               Q[16]="114";//q
               Q[17]="131";//r
               Q[18]="133";//s
               Q[19]="333";//t
               Q[20]="101";//u
               Q[21]="144";//v
               Q[22]="995";//w
               Q[23]="237";//x
               Q[24]="179";//y
               Q[25]="130";//z
               Q[26]="143";//.
               Q[27]="999";//_
               Q[28]="160";//a
               
            for(p=0;p<l;p++){
                
                for(q=y;q<m; q++){
                    B[p]=B[p]+C[q];
                }
               
               y=y+3;
               m=y+3;
               
               
               if(B[p].equals(Q[0])){
                   all=all+"a";
               }
               if(B[p].equals(Q[1])){
                  all=all+"b"; 
               }
               
               if(B[p].equals(Q[2])){
                   all=all+"c";
               }
               
               if(B[p].equals(Q[3])){
                   all=all+"d";
               }
               
               if(B[p].equals(Q[4])){
                   all=all+"e";
               }
               
               if(B[p].equals(Q[5])){
                   all=all+"f";
               }
               
               if(B[p].equals(Q[6])){
                   all=all+"g";
               }
               
               if(B[p].equals(Q[7])){
                   all=all+"h";
               } 
               
               if(B[p].equals(Q[8])){
                   all=all+"i";
               }
                
               if(B[p].equals(Q[9])){
                   all=all+"j";
               } 
               
               if(B[p].equals(Q[10])){
                   all=all+"k";
               }
                 
               if(B[p].equals(Q[11])){
                   all=all+"l";
               }
                
               if(B[p].equals(Q[12])){
                   all=all+"m";
               }
                
               if(B[p].equals(Q[13])){
                   all=all+"n";
               }
                
               if(B[p].equals(Q[14])){
                   all=all+"o";
               }
               
                
               if(B[p].equals(Q[15])){
                   all=all+"p";
               }
                
               if(B[p].equals(Q[16])){
                   all=all+"q";
               }
                
               if(B[p].equals(Q[17])){
                   all=all+"r";
               }
                
               if(B[p].equals(Q[18])){
                   all=all+"s";
               }
                
               if(B[p].equals(Q[19])){
                   all=all+"t";
               }
                
               if(B[p].equals(Q[20])){
                   all=all+"u";
               }
                
               if(B[p].equals(Q[21])){
                   all=all+"v";
               }
                
               if(B[p].equals(Q[22])){
                   all=all+"w";
               }
                
               if(B[p].equals(Q[23])){
                   all=all+"x";
               } 
               
               if(B[p].equals(Q[24])){
                   all=all+"y";
               }
                
               if(B[p].equals(Q[25])){
                   all=all+"z";
               }
                
               if(B[p].equals(Q[26])){
                   all=all+".";
               }
                
               if(B[p].equals(Q[27])){
                   all=all+"_";
               }
               
               if(B[p].equals(Q[28])){
                   all=all+" ";
               }
               
            }
            f3.setText(all);
            
                   
               }
               
               
               
            if(e.getSource()==b5){ 
                 
                 try{
                 File ff = new File("Encryption.txt");
                 FileWriter fw =  new FileWriter(ff);
                  global=f4.getText();
            fw.write(global);
               
                 fw.close();
                 JOptionPane.showMessageDialog(null,"data is saved in Encryption file");
                 }
                 
                 catch(Exception e101){
                     
                 }    
               
               
}
            
                           
               
               
            if(e.getSource()==b6){ 
                 
                 try{
                 File ff = new File("Decryption.txt");
                 FileWriter fw =  new FileWriter(ff);
                 global=f4.getText();
                fw.write(global);
               
                 fw.close();
                 JOptionPane.showMessageDialog(null,"data is saved in Decryption file");
                 }
                 
                 catch(Exception e101){
                     
                 }    
               
               
}
}
}

        
    
   
    

