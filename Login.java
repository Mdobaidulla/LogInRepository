import java.util.Scanner;
import java.io.*;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Login extends JFrame{

double taxTotal=0;
double sum=0;
double allTogether=0;
double p[]=new double[16];
double cou[]=new double[16];
double t[]=new double[16];
int count=0;
int num=0;
   JButton exitB=new JButton("Yes");
   JButton exitNB=new JButton("No");
   JTextArea text = new JTextArea();
   JPanel chickenP = new JPanel();
   JButton sutdowB=new JButton("Shut Down");
   JButton chickenB = new JButton("CHICKEN");
   JButton pastaB = new JButton("PASTA");
   JButton saveB = new JButton("SAVE ORDER");
   JButton dessertB = new JButton("PREVIOUS");
   JButton specialB = new JButton("SPECIALITES");
   // button for chikMianP   
   JButton parmaB = new JButton("PARMIGIANA");
   JButton franchB = new JButton("FRANCESE");
   JButton piccataB = new JButton("PICCATTA");
   JButton marsalaB = new JButton("MARSALA");
   JButton scarpB = new JButton("SCARPIELLO");
   JButton grilB = new JButton("GRIL");
   JButton specialChikB = new JButton("PIZZAIOLA");
   JButton friedB = new JButton("CACCIATORE");
   //adding salt and paper button
JButton saltB = new JButton("ADD SALT");
JButton spiceB = new JButton("ADD SPICE");
 //**************************************
//PASTA PANEL
JPanel pastaP=new JPanel();
JButton penneB=new JButton("PENNE");
JButton rigatoniB=new JButton("RIGATONI");
JButton linguiB=new JButton("LINGUINI");
JButton fettucineB=new JButton("FETTUCINE ALFREDO");
JButton spagiB=new JButton("SPAGHETTI");
JButton shrimpPastaB=new JButton("SHRIMP MARINARA");
JButton primaveraB=new JButton("PRIMAVERA");
JButton penneBrocoloB=new JButton("PENNE BROCCOLI");
Font font = new Font("Garamond", Font.BOLD,30);
Font fontBig = new Font("Garamond", Font.BOLD,50);

//***********************************
//Combox for Years

//****************************
//CUTOMER PANEL AND ALL
JPanel customerP=new JPanel();
JTextField customerSearch= new JTextField();
JButton customerSearchB= new JButton("SEARCH ");
JButton newSearchB= new JButton("NEW SEARCH ");
JButton playceOr= new JButton("PLACEORDER ");
JButton addCutomer= new JButton("NEW CUSTOMER");
JButton saveCutomer= new JButton("SAVE CUSTOMER");
JButton skipCutomer= new JButton("SKIP CUSTOMER");
JTextArea customerSearchA= new JTextArea();
JLabel phoneL = new JLabel("Phone No.");


//***********************
   
//****************************
//FORM FOR CUSTOMER PANEL AND ALL 
JPanel formP= new JPanel();
JTextField phoneN=new JTextField();
JTextField firstN=new JTextField();
JTextField lastN=new JTextField();
JTextField address=new JTextField();

JLabel phoneLF= new JLabel("Phone Number");
JLabel firstL= new JLabel("First Name");
JLabel lastL= new JLabel("Last Name");
JLabel addressL= new JLabel("Address");

//****************************
//CUSTOMER BILL TAX BILL AND TOTAL 
JTextArea tax=new JTextArea();
JTextArea bill=new JTextArea();
JTextArea totalBill=new JTextArea();

//***********************
   
   JPanel chikMainP = new JPanel();
   Color deepCol=new Color(14, 86, 117);
   Color lightCol = new Color(159, 190, 253);
   //Font font = new Font("Garamond", Font.BOLD,30);
   Font fontText = new Font("Garamond", Font.BOLD,25);
   String admin, manager, user,wrong;
   //all Label 
   JLabel screen= new JLabel("Best Foods Inc.");
   JLabel userL = new JLabel("User Name");
   JLabel passL = new JLabel("Password");

   
   JPanel allP = new JPanel();
   JPanel loginP = new JPanel();
   JTextField userName = new JTextField();
   JPasswordField pass = new JPasswordField();
   JPanel mainP = new JPanel();
   JButton loginB = new JButton("LOGIN");
   JButton placeOrderB = new JButton("PLACE ORDER");
   JButton paymentB = new JButton("PAYMENT");
   JButton loggedoutB= new JButton("LOGGED OUT");
   JButton previousB= new JButton("BACK");

   
   JButton userB = new JButton("USER");
   JButton managerB = new JButton("MANAGER");
   JButton adminB = new JButton("ADMIN");
   //Payment Panel
   JPanel paymentP=new JPanel();
   JButton cardB=new JButton("CARD");
   JButton cashB=new JButton("CASH");
   JButton searchPB=new JButton("SEARCH");
   JButton searchPBN=new JButton("NEW SEARCH");
   JLabel labelU=new JLabel("You :");

   JLabel labelSA=new JLabel("CHECK NO.");
   JTextField checkSA=new JTextField();
   JTextArea paymentSA=new JTextArea();
 
   //CardPayment panel
   JPanel cardPay=new JPanel();
   JTextField cardNumber= new JTextField();
   JLabel cardNumberL= new JLabel("CARD NUMBER: ");
   JTextField cardHolderName= new JTextField();
   JLabel cardHolderNameL= new JLabel("PAYMENT : ");
   JTextField cardDate= new JTextField();
   JTextField cardType= new JTextField();
   JLabel cardTypeL = new JLabel("CARD TYPE:");
   //JLabel cardDateL= new JLabel("Expire Date: ");
   JLabel cardInfoL= new JLabel("CARD INFORMATION ");
   JButton payB= new JButton("SUBMIT");
   JButton checkValidatyB= new JButton("VALIDATY");
   //JTextField cardNumber= new JTextField();
    //JButton cashB=new JButton("CASH");
   //***************************
   public Login(){
   setSize(1425,800);
   //setTitle("Welcome To Our Restaurant");
   add(allP);
   //getMainPanel();
   setUndecorated(true);
   setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
   setVisible(true);

   //PastaPanel pastaPanel=new PastaPanel();
   loginP.setLayout(null);
   loginP.add(loginB);
   loginP.add(userName);
   loginP.add(pass);
   
   
   sutdowB.setFont(font);
   sutdowB.setBounds(20,650,200,80);
   loginB.setBounds(600,375,250,65);
   loginB.setFont(font);
   loginB.addActionListener(new LoginButton());
   loginP.setBackground(deepCol);
   loginP.setBounds(new Rectangle(0,0,1425,800));
   //loginP button label
   loginP.add(userL);
   loginP.add(sutdowB);
   userL.setBounds(447,220,250,75);
   userL.setFont(font);
   userL.setForeground(lightCol);
   screen.setBounds(340,10,718,130);
   screen.setFont(new Font("Bernard MT Condensed", Font.BOLD,125));
   screen.setForeground(lightCol);
   screen.setBorder(new EtchedBorder(EtchedBorder.RAISED));
   loginP.add(screen);
   loginP.add(passL);
   passL.setBounds(460,290,250,75);
   passL.setFont(font);
   passL.setForeground(lightCol);
   //all text and pass field
   userName.setBounds(600,235,250,65);
   userName.setFont(font);
   pass.setBounds(600,300,250,65);
   
   //all button for mainP
   mainP.setVisible(false);
   paymentB.setBounds(600,100,250,100);
   paymentB.setFont(font);
   placeOrderB.setBounds(600,200,250,100);
   placeOrderB.setFont(font);
   userB.setBounds(600,300,250,100);
   userB.setFont(font);
   managerB.setBounds(600,400,250,100);
   managerB.setFont(font);
   adminB.setBounds(600,500,250,100);
   adminB.setFont(font);
   loggedoutB.setBounds(1175,80,250,100);
   loggedoutB.setFont(font);
   
   //******************************
   //pasta button
   
   penneB.setBounds(65,20,370,150);
   penneB.setFont(font);
     
   rigatoniB.setBounds(65,170,370,150);
   rigatoniB.setFont(font);

   linguiB.setBounds(65,320,370,150);
   linguiB.setFont(font);

   fettucineB.setBounds(65,470,370,150);
   fettucineB.setFont(font);
   spagiB.setBounds(435,20,370,150);
   spagiB.setFont(font);
   
   shrimpPastaB.setBounds(435,170,370,150);
   shrimpPastaB.setFont(font);
   
   primaveraB.setBounds(435,320,370,150);
   primaveraB.setFont(font);
   
   penneBrocoloB.setBounds(435,470,370,150);
   penneBrocoloB.setFont(font);
   customerSearchA.setEditable(false);
   pastaP.setLayout(null);
   pastaP.setBounds(new Rectangle(0,0,875,650));
   pastaP.setBackground(deepCol);
   pastaP.add(penneB);
   pastaP.add(rigatoniB);
   pastaP.add(linguiB);
   pastaP.add(fettucineB);
   pastaP.add(spagiB);
   pastaP.add(shrimpPastaB);
   pastaP.add(primaveraB);
   pastaP.add(penneBrocoloB);
   paymentSA.setEditable(false);
   //******************************
 
   //Customer panel and button
   customerP.setVisible(false);
   customerSearch.setBounds(165,20,250,100);
   customerSearch.setFont(font);
   customerSearchB.setBounds(415,20,250,100);
   customerSearchB.setFont(font);
   newSearchB.setBounds(415,20,250,100);
   newSearchB.setFont(font);
   skipCutomer.setBounds(665,20,300,100);
   skipCutomer.setFont(font);
   skipCutomer.addActionListener(new SkeepCustomer());
   customerSearchA.setBounds(165,120,495,300);
   customerSearchA.setFont(font);
   phoneL.setBounds(15,20,150,100);
   phoneL.setFont(font);
   playceOr.setBounds(665,120,300,100);
   playceOr.setFont(font);
   
   addCutomer.setBounds(665,220,300,100);
   addCutomer.setFont(font);
   addCutomer.addActionListener(new NewCutomer());
 
   saveCutomer.setBounds(665,320,300,100);
   saveCutomer.setFont(font);
   saveCutomer.addActionListener(new SaveCustomerB());

   customerP.setLayout(null);
   customerP.setBounds(new Rectangle(0,0,1425,800));
   customerP.setBackground(new Color(14, 86, 117));
   
   //customerP.add(text);
   customerP.add(customerSearch);
   customerP.add(newSearchB);
   customerP.add(customerSearchB);
   customerP.add(newSearchB);
   customerP.add(customerSearchA);
   customerP.add(phoneL);
   customerP.add(playceOr);
   customerP.add(addCutomer);
   customerP.add(previousB);
   customerP.add(saveCutomer);
   customerP.add(skipCutomer);  

   //button cusmtomer search button
   //customerSearchB.addActionListener(new CustomerSearch());
   customerSearchB.addActionListener(new CustomerSearchButton());
   previousB.setVisible(false);
    //******************************
   //Customer panel and button
   phoneN.setLayout(null);
   firstN.setLayout(null);
   lastN.setLayout(null);
   address.setLayout(null);
   
   phoneLF.setBounds(20,10,200,60);
   phoneLF.setFont(font);
   phoneN.setBounds(10,60,300,60);
   phoneN.setFont(font);
 
   firstL.setBounds(20,120,200,60);
   firstL.setFont(font);
   firstN.setBounds(10,170,200,60);
   firstN.setFont(font);
  
   lastL.setBounds(230,120,200,60);
   lastL.setFont(font);
   lastN.setBounds(220,170,200,60);
   lastN.setFont(font);
   
   addressL.setBounds(20,220,200,60);
   addressL.setFont(font);
   address.setBounds(10,270,410,60);
   address.setFont(font);
   
   
   formP.setLayout(null);
   formP.setVisible(false);
   formP.setBounds(new Rectangle(165,420,495,350));
   formP.setBackground(deepCol);
   formP.setBorder(new EtchedBorder(EtchedBorder.RAISED));
   formP.add(phoneN);
   formP.add(phoneLF);
   formP.add(firstL);
   formP.add(lastL);
   formP.add(addressL);
   formP.add(firstN);
   formP.add(lastN);
   formP.add(address);
    //******************************
   //2nd panel
   mainP.setLayout(null);
   mainP.setBounds(new Rectangle(0,0,1425,800));
   mainP.setBackground(deepCol);
   mainP.add(paymentB);
   mainP.add(placeOrderB);
   mainP.add(userB);
   mainP.add(managerB);
   mainP.add(adminB);
   mainP.add(loggedoutB);
   
   //chicken button
    chickenB.setBounds(1175,200,250,90);
    chickenB.setFont(font);
     
    pastaB.setBounds(1175,290,250,90);
    pastaB.setFont(font); 
    
    saveB.setBounds(1175,380,250,90);
    saveB.setFont(font);
    saveB.addActionListener(new SaveOrder());
    
    dessertB.setBounds(1175,470,250,90);
    dessertB.setFont(font);
    
    specialB.setBounds(1175,560,250,90);
    specialB.setFont(font);
  
    saltB.setBounds(185,670,250,90);
    saltB.setFont(font);
     
    spiceB.setBounds(435,670,250,90);
    spiceB.setFont(font);
    
    //chicknB decoration
     parmaB.setBounds(65,20,370,150);
     parmaB.setFont(font);
     
     franchB.setBounds(65,170,370,150);
     franchB.setFont(font);
     
     piccataB.setBounds(65,320,370,150);
     piccataB.setFont(font);
     
     marsalaB.setBounds(65,470,370,150);
     marsalaB.setFont(font);
     
     scarpB.setBounds(435,20,370,150);
     scarpB.setFont(font);
     
     grilB.setBounds(435,170,370,150);
     grilB.setFont(font);
     specialChikB.setBounds(435,320,370,150);
     specialChikB.setFont(font);
     
     friedB.setBounds(435,470,370,150);
     friedB.setFont(font);
     
   //text area
   text.setLayout(null);
   text.setEditable(false);
   text.setFont(fontText);
   //text.setBackground(Color.GRAY);
   text.setBounds(new Rectangle(882,5,290,640));
   //food total output
   bill.setFont(fontText);
   bill.setBounds(new Rectangle(882,640,290,40));
   tax.setFont(fontText);
   tax.setBounds(new Rectangle(882,680,290,40));
   
   totalBill.setFont(fontText);
   totalBill.setBounds(new Rectangle(882,720,290,40));

    //chikMainP.setVisible(false);
    chikMainP.add(parmaB);
    chikMainP.add(franchB);
    chikMainP.add(piccataB);
    chikMainP.add(marsalaB);
    chikMainP.add(scarpB);
    chikMainP.add(grilB);
    chikMainP.add(specialChikB);
    chikMainP.add(friedB);
    //add save button 
  
   //chicken panel
   //chickenP.setVisible(false);
   chickenP.setVisible(false);
   chickenP.add(pastaP);
   chickenP.add(chikMainP);
   chickenP.add(saltB);
   chickenP.add(spiceB);
   chickenP.add(bill);
   
   chickenP.add(tax);
   chickenP.add(totalBill);
   chickenP.add(text);
   chickenP.add(chickenB);
   chickenP.add(pastaB);
   chickenP.add(saveB);
   chickenP.add(dessertB);
   chickenP.add(specialB);
   chickenP.setLayout(null);
   chickenP.setBounds(new Rectangle(0,0,1425,800));
   chickenP.setBackground(deepCol);
   //Chicken main panelfor Different chickent item
   

   
   
   chikMainP.setLayout(null);
   chikMainP.setBounds(new Rectangle(0,0,875,650));
   chikMainP.setBackground(deepCol);
   
   //adding salt and spice button
   //text.setEditable(false);
   //Third panel
   
   getCradPayment();
   getPaymentP();
   paymentP.add(cardPay);
   allP.setLayout(null);
   allP.setBackground(deepCol);
   allP.add(loginP);
   allP.add(mainP);
   allP.add(formP);
   allP.add(customerP);
   allP.add(paymentP);
   allP.add(chickenP);
   
    pastaB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     mainP.setVisible(false);
     pastaP.setVisible(true);
     chikMainP.setVisible(false);
    }
   });
   
   
   chickenB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     mainP.setVisible(false);
     pastaP.setVisible(false);
     chikMainP.setVisible(true);
    }
   });
   
   
   
   
   //this button for loggedout button
   loggedoutB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     mainP.setVisible(false);
     loginP.setVisible(true);
     
    }
   });
   //chicken panel button
   spiceB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("                      !!add spice"+"\n");
    }
   });
   
     saltB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("                      !!add salt"+"\n");
    }
   });
   
   //button 1
    friedB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Cacciatore----------$30.00"+"\n");
     cou[0]++;
     p[0]=cou[0]*30;
     t[0]=p[0]*0.0875;
     tax.setText("     Tax:$"+getTax(t[0]));
     bill.setText(" Foods:$"+getTotal(p[0]));
     totalBill.setText("  Total:$"+getTotalBill(t[0],p[0]));
    }
   });
   //button 2
   grilB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Gril-------------------$21.00"+"\n");
     
     cou[1]++;
     p[1]=cou[1]*21;
     t[1]=p[1]*0.0875;
     tax.setText("  Tax:$"+getTax(t[1]));
     bill.setText("Foods:$"+getTotal(p[1]));
     totalBill.setText("  Total:$"+getTotalBill(t[1],p[1]));

    }
   });
   //button 3
    specialChikB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Pizzaiola------------$25.00"+"\n");
      cou[2]++;
     p[2]=cou[2]*25;
     t[2]=p[2]*0.0875;
     tax.setText("  Tax:$"+getTax(t[2]));
     bill.setText("Foods:$"+getTotal(p[2]));
     totalBill.setText("  Total:$"+getTotalBill(t[2],p[2]));

     
    }
   });
   //button 4
   scarpB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Scarpiello-----------$35.00"+"\n");
     cou[3]++;
     p[3]=cou[3]*35;
     t[3]=p[3]*0.0875;
     tax.setText("  Tax:$"+getTax(t[3]));
     bill.setText("Foods:$"+getTotal(p[3]));
     totalBill.setText("  Total:$"+getTotalBill(t[3],p[3]));

    }
   });

   //button 5
    marsalaB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Marsala--------------$25.00"+"\n");
       cou[4]++;
     p[4]=cou[4]*25;
     t[4]=p[4]*0.0875;
     tax.setText("  Tax:$"+getTax(t[4]));
     bill.setText("Foods:$"+getTotal(p[4]));
     totalBill.setText("  Total:$"+getTotalBill(t[4],p[4]));

     
    }
   });
   //button 6
     piccataB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Piccatta--------------$23.00"+"\n");
      cou[5]++;
     p[5]=cou[5]*23;
     t[5]=p[5]*0.0875;
     tax.setText("  Tax:$"+getTax(t[5]));
     bill.setText("Foods:$"+getTotal(p[5]));
     totalBill.setText("  Total:$"+getTotalBill(t[5],p[5]));
    }
   });
   //button 7
    franchB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Franceh-------------$28.00"+"\n");
     cou[6]++;
     p[6]=cou[6]*28;
      t[6]=p[6]*0.0875;
     tax.setText("  Tax:$"+getTax(t[6]));
     bill.setText("Foods:$"+getTotal(p[6]));
     totalBill.setText("  Total:$"+getTotalBill(t[6],p[6]));
    }
   });
   //button 8
    parmaB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Parmigiana---------$25.00"+"\n");
     cou[7]++;
     p[7]=cou[7]*25;
     t[7]=p[7]*0.0875;
     tax.setText("  Tax:$"+getTax(t[7]));
     bill.setText("Foods:$"+getTotal(p[7]));
     totalBill.setText("  Total:$"+getTotalBill(t[7],p[7]));
    }
   });
   //pasta panel
   //button 9
    penneB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Penne---------------$25.00"+"\n");
     cou[8]++;
     p[8]=cou[8]*25;
     t[8]=p[8]*0.0875;
     tax.setText("  Tax:$"+getTax(t[8]));
     bill.setText("Foods:$"+getTotal(p[8]));
     totalBill.setText("  Total:$"+getTotalBill(t[8],p[8]));
    }
   });
   
   //button 10
    rigatoniB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Rigatoni------------$25.00"+"\n");
     cou[9]++;
     p[9]=cou[9]*25;
     t[9]=p[9]*0.0875;
     tax.setText("  Tax:$"+getTax(t[9]));
     bill.setText("Foods:$"+getTotal(p[9]));
     totalBill.setText("  Total:$"+getTotalBill(t[9],p[9]));
    }
   });
    //button 11
    linguiB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Linguini------------$25.00"+"\n");
     cou[10]++;
     p[10]=cou[10]*25;
      t[10]=p[10]*0.0875;
     tax.setText("  Tax:$"+getTax(t[10]));
     bill.setText("Foods:$"+getTotal(p[10]));
     totalBill.setText("  Total:$"+getTotalBill(t[10],p[10]));

     
    }
   });
      //button 12
    fettucineB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Fettucine Alfre----$25.00"+"\n");
      cou[11]++;
     p[11]=cou[11]*25;
     t[11]=p[11]*0.0875;
     tax.setText("  Tax:$"+getTax(t[11]));
     bill.setText("Foods:$"+getTotal(p[11]));
     totalBill.setText("  Total:$"+getTotalBill(t[11],p[11]));
    }
   });
      //button 13
    spagiB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Spaghetti-----------$25.00"+"\n");
     
      cou[12]++;
     p[12]=cou[12]*25;
     t[12]=p[12]*0.0875;
     tax.setText("  Tax:$"+getTax(t[12]));
     bill.setText("Foods:$"+getTotal(p[12]));
     totalBill.setText("  Total:$"+getTotalBill(t[12],p[12]));

     
    }
   });
   //button 14
    shrimpPastaB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Shrimp Marinara-$25.00"+"\n");
      cou[13]++;
     p[13]=cou[13]*25;
     t[13]=p[13]*0.0875;
     tax.setText("  Tax:$"+getTax(t[13]));
     bill.setText("Foods:$"+getTotal(p[13]));
     totalBill.setText("  Total:$"+getTotalBill(t[13],p[13]));
     totalBill.setText("  Total:$"+getTotalBill(t[13],p[13]));

    }
   });
   //button 15
   primaveraB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Primavera----------$25.00"+"\n");
      cou[14]++;
     p[14]=cou[14]*25;
     t[14]=p[14]*0.0875;
     tax.setText("  Tax:$"+getTax(t[14]));
     bill.setText("Foods:$"+getTotal(p[14]));
     totalBill.setText("  Total:$"+getTotalBill(t[14],p[14]));
     totalBill.setText("  Total:$"+getTotalBill(t[14],p[14]));
    }
   });
    //button 16
   penneBrocoloB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     text.append("   Penne Broccoli---$25.00"+"\n");
      cou[15]++;
     p[15]=cou[15]*25;
     t[15]=p[15]*0.0875;
     tax.setText("  Tax:$"+getTax(t[15]));
     bill.setText("Foods:$"+getTotal(p[15]));
     totalBill.setText("  Total:$"+getTotalBill(t[15],p[15]));
    }
   });
   
   //this button for chicken button
   previousB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     customerP.setVisible(false);
     //customerSearchB.setVisible(false);
     mainP.setVisible(true);
     loginP.setVisible(false);
     chickenP.setVisible(false);
     paymentP.setVisible(false);
     cardPay.setVisible(false);
     payB.setVisible(false);
     checkValidatyB.setVisible(true);
     cardNumber.setText("");
     cardType.setText("");
     paymentSA.setText("");
     
     
    }
   });
   
   placeOrderB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     mainP.setVisible(false);
     loginP.setVisible(false);
     customerP.setVisible(true);   
     }
   });
   newSearchB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    customerSearchB.setVisible(true);
    newSearchB.setVisible(false);
    customerSearch.setText("");
    customerSearchA.setText("");

    
     }
   });
   //payment button
   paymentB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    paymentP.setVisible(true);
    mainP.setVisible(false);
    previousB.setVisible(true);
    chickenP.setVisible(false);
     }
   });
   
   //Customer panel button
    playceOr.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   num++;
   Date date = new Date();
   text.append("   BEST FOODS INC.\n");
   text.append("Date:"+date+"\n");
   text.append("Number:"+num);
     paymentP.setVisible(false);
     mainP.setVisible(false);
     loginP.setVisible(false);
     customerP.setVisible(false);
     formP.setVisible(false);
     previousB.setVisible(false);
     chickenP.setVisible(true);
     text.append("\n"+customerSearchA.getText()+"\n");
     customerSearchA.setText("");
     playceOr.setVisible(true);
     }
   });
   }
   private class LoginButton implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
      {
      char[] passWord = pass.getPassword();
         String ps = new String(passWord);
         
      String u1,u2,u3,u4,u5,u6;
      String p1,p2,p3,p4,p5,p6;
      boolean us,us1,us2,us3,us4,us5,us6;
      boolean pa,pa1,pa2,pa3,pa4,pa5,pa6;
      u1="mitul";//admin username
      p1="mitul123";//admin pass
      u2="hasan";//1manager username
      p2="hasan123";//1manager pass
      u3="shamim";//2manager username
      p3="shamim123";//2manager pass
      u4="sunny";//1user user
      p4="sunny123";//1user pass
      u5="bakhsa";//2user user
      p5="bakhsa123";//2user pass
      u6="jibon";//3user user
      p6="jibon123";//3user pass
      us1=u1.equals(userName.getText());
      pa1=p1.equals(ps);
      us2=u2.equals(userName.getText());
      pa2=p2.equals(ps);
      us3=u3.equals(userName.getText());
      pa3=p3.equals(ps);
      us4=u4.equals(userName.getText());
      pa4=p4.equals(ps);
      us5=u5.equals(userName.getText());
      pa5=p5.equals(ps); 
      us6=u6.equals(userName.getText());
      pa6=p6.equals(ps); 
      if(us1&&pa1){
      mainP.setVisible(true);
      loginP.setVisible(false);
      chickenP.setVisible(false);
       }
       else if (us2&&pa2||us3&&pa3){
       managerB.setVisible(false);
       adminB.setVisible(false);
       mainP.setVisible(true);
       loginP.setVisible(false);
       chickenP.setVisible(false);
       
       }
       else if (us4&&pa4||us5&&pa5||us6&&pa6){
       chickenP.setVisible(false);
       userB.setVisible(false);
       managerB.setVisible(false);
       adminB.setVisible(false);
       mainP.setVisible(true);
       loginP.setVisible(false);
       }
      else{
      chickenP.setVisible(false);
      mainP.setVisible(false);
      loginP.setVisible(true);
      JOptionPane.showMessageDialog(null, "Wrong User name or Password!");

      }
      userName.setText("");
      pass.setText("");
     }
   }
   //***********************************
   //customerPanel search button
      private class CustomerSearch implements ActionListener{
       public void actionPerformed(ActionEvent e){
       newSearchB.setVisible(true);
      try {
         File fil = new File(customerSearch.getText()+".txt");
         Scanner kb=new Scanner(fil);
         while(kb.hasNext()){
         customerSearchA.append(kb.nextLine()+"\n");
        }
     }   
        catch (FileNotFoundException f) {
        }
   }
     
 }
 //add new customer button 
    private class NewCutomer implements ActionListener{
     public void actionPerformed(ActionEvent e){
     formP.setVisible(true);
     
     phoneN.setText(customerSearch.getText());
     customerSearchA.setText("");     
      
   }
   }
    private class SkeepCustomer implements ActionListener{
     public void actionPerformed(ActionEvent e){
     formP.setVisible(false);
     chickenP.setVisible(true);
     customerP.setVisible(false);   
     paymentP.setVisible(false); 
   }
   }
   
      
private class SaveCustomerB implements ActionListener
 {
public void actionPerformed(ActionEvent e)
   {
      customerP.setVisible(true);
      formP.setVisible(false);
    try
      {
      String fileName=customerSearch.getText();   
      // create a new writer
      PrintWriter pw = new PrintWriter(fileName+".txt");
      // change the line
      pw.print("Ph: "+customerSearch.getText()+"\n");
      pw.print(firstN.getText()+" "+lastN.getText()+"\n");
      pw.print(address.getText()+"\n");
      customerSearchA.append("Ph: "+customerSearch.getText()+"\n");
      customerSearchA.append(firstN.getText()+" "+lastN.getText()+"\n");
      customerSearchA.append(address.getText()+"\n");
      // print another string
      pw.flush();
      phoneN.setText("");
      firstN.setText("");
      customerSearch.setText("");
      lastN.setText("");
      address.setText("");          
      }
    catch (Exception ex) 
      {
      ex.printStackTrace();
      } 
   }
 } 
    //Order Save button
private class SaveOrder implements ActionListener
 {
public void actionPerformed(ActionEvent e)

   {chickenP.setVisible(false);
    paymentP.setVisible(true);
    previousB.setVisible(true);
   try
     {
     
     int orderNumber=num;   
     // create a new writer
     PrintWriter pw = new PrintWriter(orderNumber+".txt");
     // change the line
     pw.println(text.getText());     
     pw.println("               "+tax.getText());
     pw.println("                 "+bill.getText());
     pw.println("               "+totalBill.getText());
     pw.println(" Thank You For Visiting Us.");
     pw.println("\nNO PAID");
     pw.flush();
     paymentSA.append(text.getText()+"\n");
     paymentSA.append("               "+tax.getText());
     paymentSA.append("\n                 "+bill.getText());
     paymentSA.append("\n               "+totalBill.getText());
     cardHolderName.setText(totalBill.getText());
     String value=Integer.toString(orderNumber);
     checkSA.setText(value);
     text.setText("");
     tax.setText("");
     bill.setText("");
     totalBill.setText("");
     
     
     for (int i=0; i<16; i++) {
       p[i]=0;
       getTotal(p[i]);
       }    
     for (int j=0; j<16; j++){
       t[j]=0;
       getTax(t[j]);
       }
      for (int k=0; k<16; k++){
        t[k]=0;
        p[k]=0;
        getTotalBill(t[k],p[k]);
      } 
      for (int l=0; l<16; l++){
      cou[l]=0;
      }
        
     }
   catch (Exception ex) 
     {
      ex.printStackTrace();
     }
   }
 }
 //EXISTING customer serach button
private class CustomerSearchButton implements ActionListener
 {
public void actionPerformed(ActionEvent e)
   {
      newSearchB.setVisible(true);
   try 
     {
     File fil = new File(customerSearch.getText()+".txt");
     Scanner kb=new Scanner(fil);
   while(kb.hasNext())
     {
      customerSearchA.append(kb.nextLine()+"\n");
     }
     }
   catch (FileNotFoundException f) 
     {
     }
     customerSearchB.setVisible(false);    
   }
 }
public double getTotal(double price)
 {
   sum=p[0]+p[1]+p[2]+p[3]+p[4]+p[5]+p[6]+p[7]
   +p[8]+p[9]+p[10]+p[11]+p[12]+p[13]+p[14]+p[15];
   return sum;
 }
 
public double getTax(double tax1)
 {
 taxTotal=t[0]+t[1]+t[2]+t[3]+t[4]+t[5]+t[6]+t[7]
   +t[8]+t[9]+t[10]+t[11]+t[12]+t[13]+t[14]+t[15];
 return taxTotal;
 }
 
 public double getTotalBill(double taxs, double prices)
 {
   allTogether=t[0]+t[1]+t[2]+t[3]+t[4]+t[5]+t[6]+t[7]
   +t[8]+t[9]+t[10]+t[11]+t[12]+t[13]+t[14]+t[15]+p[0]
   +p[1]+p[2]+p[3]+p[4]+p[5]+p[6]+p[7]+p[8]+p[9]+p[10]
   +p[11]+p[12]+p[13]+p[14]+p[15];
   return allTogether;
 }
 
 
public void getPaymentP()
 { paymentSA.setBounds(new Rectangle(882,120,290,600));
   paymentSA.setFont(fontText);
   labelSA.setBounds(1175,70,250,50);
   labelSA.setFont(font);
   checkSA.setBounds(1175,120,250,60);
   checkSA.setFont(font);

   searchPB.setBounds(1175,180,250,90);
   searchPB.setFont(font);
   
   searchPBN.setBounds(1175,180,250,90);
   searchPBN.setFont(font);

   
   cashB.setBounds(1175,270,250,90);
   cashB.setFont(font);
   cardB.setBounds(1175,360,250,90);
   cardB.setFont(font);
   previousB.setBounds(1175,450,250,90);
   previousB.setFont(font);
   previousB.setVisible(false);
   
   paymentP.setLayout(null);
   paymentP.setVisible(false);
   paymentP.setBounds(new Rectangle(0,0,1425,800));
   paymentP.setBackground(deepCol);
   paymentP.add(previousB);
   paymentP.add(cashB);
   paymentP.add(cardB);
   paymentP.add(searchPB);
   paymentP.add(checkSA);
   paymentP.add(labelSA);
   paymentP.add(paymentSA);
   paymentP.add(searchPBN);
   searchPB.addActionListener(new ButtonSearch());
 
   cashB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   try
      {
      String fileName=checkSA.getText();   
      // create a new writer
      PrintWriter pw = new PrintWriter(fileName+".txt");
      // change the line
      pw.print(paymentSA.getText()+"\n");
      //pw.setText(textPay.getText().replaceAll( "NOT PAID", "PAID IN CASH"));

      pw.append("PAID IN CASH");
      // print another string
      pw.flush();
      
      //making invisible and visible some panel
      customerP.setVisible(false);
     //customerSearchB.setVisible(false);
     mainP.setVisible(true);
     loginP.setVisible(false);
     chickenP.setVisible(false);
     paymentP.setVisible(false);
     cardPay.setVisible(false);
     payB.setVisible(false);
     checkValidatyB.setVisible(true);
     //*****************************
     JOptionPane.showMessageDialog(null,"    CASH PAYMENT\n\n"+"THANK YOU FOR YOUR PAYMENT");
      checkSA.setText("");
      paymentSA.setText("");      
      }
    catch (Exception ex) 
      {
      ex.printStackTrace();
      } 
     }
   });

   
   
    payB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   try
      {
      String fileName=checkSA.getText();   
      // create a new writer
      PrintWriter pw = new PrintWriter(fileName+".txt");
      // change the line
      pw.print(paymentSA.getText()+"\n");
      pw.append("CARD PAYMENT\n");
      pw.print("Card Number:"+cardNumber.getText()+"\n");
      pw.print( "Card Type:"+cardType.getText()+"\n");
      pw.print( cardHolderName.getText()+"\n");
      
      // print another string
      pw.flush();
      
      //making invisible and visible some panel
      customerP.setVisible(false);
     //customerSearchB.setVisible(false);
     mainP.setVisible(true);
     loginP.setVisible(false);
     chickenP.setVisible(false);
     paymentP.setVisible(false);
     cardPay.setVisible(false);
     payB.setVisible(false);
     checkValidatyB.setVisible(true);
     //*****************************
     JOptionPane.showMessageDialog(null,"    CARD PAYMENT HAS BEED DONE\n\n"+"THANK YOU FOR YOUR PAYMENT");
      checkSA.setText("");
      paymentSA.setText(""); 
      
           
      }
    catch (Exception ex) 
      {
      ex.printStackTrace();
      } 
     }
   });
   
   sutdowB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
    getShutDownFrame();
    //shutF.setVisible(true);
     }
   });
   
   
   cardB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   cardPay.setVisible(true);
     }
   });
   searchPBN.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    searchPB.setVisible(true);
    searchPBN.setVisible(false);
    paymentSA.setText("");
    
     }
   });
   searchPB.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     searchPB.setVisible(false);
    searchPBN.setVisible(true);
     }
   });
 }
 public void getCradPayment(){
 cardInfoL.setBounds(200,0,600,80);
 cardInfoL.setFont(fontBig);
 cardInfoL.setForeground(lightCol);

 cardNumber.setBounds(300,120,500,60);
 cardNumber.setFont(font);
 cardNumberL.setBounds(60,120,500,60);
 cardNumberL.setFont(font);
 cardNumberL.setForeground(lightCol);
 
 cardType.setBounds(300,190,500,60);
 cardType.setFont(font);
 cardTypeL.setBounds(120,190,250,60);
 cardTypeL.setFont(font);
 cardType.setEditable(false);
 cardTypeL.setForeground(lightCol);
 
 
 cardHolderName.setBounds(300,260,250,60);
 cardHolderName.setFont(font);
 cardHolderName.setEditable(false);
 cardHolderNameL.setBounds(130,260,500,60);
 cardHolderNameL.setFont(font);
 cardHolderNameL.setForeground(lightCol);
 
 
  
 checkValidatyB.setBounds(550,260,250,100);
 checkValidatyB.setForeground(lightCol);
 checkValidatyB.setFont(font);
 
 payB.setBounds(550,260,250,100);
 payB.setForeground(lightCol);
 payB.setFont(font);
 cardPay.setVisible(false);
 cardPay.setLayout(null);
 cardPay.setBounds(new Rectangle(0,120,882,600));
 cardPay.setBackground(deepCol);
 cardPay.add(cardNumberL);
 cardPay.add(cardNumber);
 cardPay.add(cardHolderName);
 cardPay.add(cardHolderNameL);
 cardPay.add(cardInfoL);
 cardPay.add(cardType);
 cardPay.add(cardTypeL);
 payB.setVisible(false);
 cardPay.add(payB);
 cardPay.add(checkValidatyB);
 
 checkValidatyB.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
 
 String cardN=cardNumber.getText();
 int total=getCardValidity(cardN);
 
 int length=cardN.length();
 if (length>=13&&length<=16){
 
      if(total%10==0){
     payB.setVisible(true);
     cardType.setText(getCardNumber(cardN));}
       else{
     JOptionPane.showMessageDialog(null,"INVALID CARD");
     payB.setVisible(false);
     }
     }
    }
 });
 
 payB.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
  checkValidatyB.setVisible(true);
  payB.setVisible(false);
  cardNumber.setText("");
  cardType.setText("");
  cardHolderName.setText("");
  paymentSA.setText("");
  
    }
   });
 }
 public String getCardNumber(String num){
 String card;
 String cardN=num;
 char firstNumber=cardN.charAt(0);
 int number1=Character.getNumericValue(firstNumber);
 char secondNumber=cardN.charAt(1);
 int number2=Character.getNumericValue(secondNumber);
 

 if(number1==4){
 card="VISA";
 }
 else if(number1==5){
 card="MASTER";
 
 }
  else if(number1==3&&number2==7){
 card="AMEX";
 
 }
  else if(number1==6){
 card="DISCOVER";
 
 }
 else{
 card="";
 }
  return card;
 }
 public int getCardValidity(String num1){
 String cardN=num1;
 int length=cardN.length();
 int evenTotal=0;
 int evenTotalEx=0;
 int finalEven;
 int oddTotal=0;
 for (int i=length-2; i>=0; i-=2){
   char evenP=cardN.charAt(i);
   int evenNum=Character.getNumericValue(evenP);
   int multiplied=evenNum*2;
   if(multiplied<10){
   evenTotal=evenTotal+multiplied;
   }
   if (multiplied>9){
   int extraEven;
   extraEven=multiplied-10;
   int newAdd=extraEven+1;
   evenTotalEx=evenTotalEx+newAdd;
   }
  }
  finalEven=evenTotal+evenTotalEx;
  for(int i=length-1;i>=0;i-=2){
   char evenP=cardN.charAt(i);
   int evenNum=Character.getNumericValue(evenP);
   oddTotal+=evenNum;
  }
  
  int finalTotal=finalEven+oddTotal;
  return finalTotal;
 }
 ////CHECK SEARCH BUTTON 
 private class ButtonSearch implements ActionListener{
public void actionPerformed(ActionEvent e){
 try {

 
   File fil = new File(checkSA.getText()+".txt");
   Scanner kb=new Scanner(fil);
   while(kb.hasNext()){
      paymentSA.append(kb.nextLine()+"\n");
     }
     
     

     }      
         catch (FileNotFoundException f) {
        }      
   }
   
 }
 
public void getShutDownFrame(){

JFrame shutF=new JFrame();
JPanel p=new JPanel();
JLabel label=new JLabel("Do you want to shut down the System?");
shutF.setSize(350,200);
shutF.add(p);

shutF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
shutF.setVisible(true);

exitB.setBounds(20,100,60,50);

exitNB.setBounds(200,100,60,50);
p.setLayout(null);
p.setBounds(0,0,350,200);
label.setBounds(10,5,320,100);
p.add(exitB);
p.add(exitNB);
p.add(label);
exitB.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
 System.exit(0);
  }
 });
   
exitNB.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
 shutF.setVisible(false);
  }
 });

}





public static void main (String[]args)
 {
   new Login();
 }
 }