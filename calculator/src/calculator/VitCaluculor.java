package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class VitCaluculor extends  WindowAdapter implements ActionListener {

	// create display to show result
	Frame f ;
	// label to display output
	Label t1;
	//TextField t1;
	
	double xd;
	double num1,num2,check;
	// Button for use operations
	
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bEqual, bDel, bSin;
	Button bCos, bSec, bCot, bCosec, bTan, bLog, bSqrt, bSqre, bCube;
	Button badd, bsub, bmult, bdiv, bDot,bmod,bclr;
	VitCaluculor() {
		f= new Frame("VIT_CALCULATOR");
		f.setBackground(Color.darkGray);
		t1=new Label(); 
		//t1 = new TextField();
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setBounds(20,50,310,60);
		// set button name separately
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b8 = new Button("8");
		b7 = new Button("7");
		b9 = new Button("9");
		b0 = new Button("0");
		bDot = new Button(".");
		bCos = new Button("Cos");
		bSin = new Button("Sin");
		bTan = new Button("Tan");
		bSec = new Button("Sec");
		bCot = new Button("Cot");
		bCosec = new Button("Cosec");
		bLog = new Button("Log");
		bSqre = new Button("X^2");
		bSqrt = new Button("Sqrt");
		bCube = new Button("Cube");
		badd = new Button("+");
		bsub = new Button("-");
		bmult = new Button("*");
		bdiv = new Button("/");
		bDel = new Button("DEL");
		bEqual = new Button("=");
		bmod = new Button("%");
		bclr = new Button("CLR");

		// set position of each button
		bSin.setBounds(20, 150, 60, 30);
		bCos.setBounds(85, 150, 60, 30);
		bTan.setBounds(150, 150, 60, 30);
		bLog.setBounds(215, 150, 60, 30);
		bSqrt.setBounds(280, 150, 60, 30);
		bSec.setBounds(20, 190, 60, 30);
		bCot.setBounds(85, 190, 60, 30);
		bCosec.setBounds(150,  190, 60, 30);
		bSqre.setBounds(215,  190, 60, 30);
		bCube.setBounds(280,  190, 60, 30);
		b7.setBounds(20, 224, 60, 30);
		b8.setBounds(85,  224, 60, 30);
		b9.setBounds(150,  224, 60, 30);
		bdiv.setBounds(215,  224, 60, 30);
		bDel.setBounds(280,  224, 60, 30);
		b4.setBounds(20,  259, 60, 30);
		b5.setBounds(85,  259, 60, 30);
		b6.setBounds(150,  259, 60, 30);
		bmult.setBounds(215,  259, 60, 30);
		bmod.setBounds(280,  259, 60, 30);
		b1.setBounds(20, 294, 60, 30);
		b2.setBounds(85,  294, 60, 30);
		b3.setBounds(150,  294, 60, 30);
		bsub.setBounds(215,  294, 60, 30);
		badd.setBounds(280,  294, 60, 30);
		b0.setBounds(20, 328, 60, 30);
		bDot.setBounds(85,  328, 60, 30);
		bEqual.setBounds(150,  328, 126, 30);
		bclr.setBounds(282,  328,  60, 30);

		f.addWindowListener(this);
		// add listener to button
		
		b1.addActionListener(this); 
		b2.addActionListener(this);  
		b3.addActionListener(this);  
		b4.addActionListener(this);  
		b5.addActionListener(this); 
		b6.addActionListener(this); 
		b7.addActionListener(this); 
		b8.addActionListener(this); 
		b9.addActionListener(this);  
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmult.addActionListener(this);
		bdiv.addActionListener(this);		
		bmod.addActionListener(this);
		bclr.addActionListener(this); 
		bEqual.addActionListener(this);
		bDel.addActionListener(this);
		bSqre.addActionListener(this);
		bCube.addActionListener(this);
		bSin.addActionListener(this);
		bCos.addActionListener(this);
		bTan.addActionListener(this);
		bSec.addActionListener(this);
		bCosec.addActionListener(this);
		bCot.addActionListener(this);
		bSqrt.addActionListener(this);
		bLog.addActionListener(this);

		
		// adding all button to the frame
		
		f.add(t1);
		f.add(bSin);
		f.add(bCos);
		f.add(bTan);
		f.add(bSec);
		f.add(bCot);
		f.add(bCosec);
		f.add(bLog);
		f.add(bSqre);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bDel);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bdiv);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bmult);
		f.add(b0);
		f.add(bDot);
		f.add(bEqual);
		f.add(badd);
		f.add(bSqrt);
		f.add(bsub);
		f.add(bCube);
		f.add(bmod);
		f.add(bclr);
		f.setSize(380, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
    //FOR CLOSING THE WINDOW
public void windowClosing(WindowEvent e) {
f.dispose();
}

public void actionPerformed(ActionEvent e){ 
	  String z,zt;
	                        //NUMBER BUTTON 
	if(e.getSource()==b1){
	 zt=t1.getText();
	  z=zt+"1";
	  t1.setText(z);
	}
	if(e.getSource()==b2){
	zt=t1.getText();
	z=zt+"2";
	t1.setText(z);
	}
	if(e.getSource()==b3){
	  zt=t1.getText();
	  z=zt+"3";
	  t1.setText(z);
	}
	if(e.getSource()==b4){
	  zt=t1.getText();
	  z=zt+"4";
	  t1.setText(z);
	}
	if(e.getSource()==b5){
	  zt=t1.getText();
	  z=zt+"5";
	  t1.setText(z);
	}
	if(e.getSource()==b6){
	  zt=t1.getText();
	  z=zt+"6";
	  t1.setText(z);
	}
	if(e.getSource()==b7){
	  zt=t1.getText();
	  z=zt+"7";
	  t1.setText(z);
	}
	if(e.getSource()==b8){
	  zt=t1.getText();
	  z=zt+"8";
	  t1.setText(z);
	}
	if(e.getSource()==b9){
	  zt=t1.getText();
	  z=zt+"9";
	  t1.setText(z);
	}
	if(e.getSource()==b0){
	  zt=t1.getText();
	  z=zt+"0";
	  t1.setText(z);
	}

	if(e.getSource()==bDot){  //ADD DECIMAL PTS
	  zt=t1.getText();
	  z=zt+".";
	  t1.setText(z);
	}

	if(e.getSource()==bDel){  // FOR  BACKSPACE
	  zt=t1.getText();
	  try{
	    z=zt.substring(0, zt.length()-1);
	    }catch(StringIndexOutOfBoundsException f){return;}
	  t1.setText(z);
	}
	                //AIRTHMETIC BUTTON
	if(e.getSource()==badd){                     //FOR ADDITION
	  try{
	    num1=Double.parseDouble(t1.getText());
	    }catch(NumberFormatException f){
	      t1.setText("Invalid Format");
	      return;
	    }
	  z="";
	  t1.setText(z);
	  check=1;
	}
	if(e.getSource()==bsub){                    //FOR SUBTRACTION
	  try{
	    num1=Double.parseDouble(t1.getText());
	    }catch(NumberFormatException f){
	      t1.setText("Invalid Format");
	      return;
	    }
	  z="";
	  t1.setText(z);
	  check=2;
	}
	if(e.getSource()==bmult){                   //FOR MULTIPLICATION
	  try{
	    num1=Double.parseDouble(t1.getText());
	    }catch(NumberFormatException f){
	      t1.setText("Invalid Format");
	      return;
	    }
	  z="";
	  t1.setText(z);
	  check=3;
	}
	if(e.getSource()==bdiv){                   //FOR DIVISION
	  try{
	    num1=Double.parseDouble(t1.getText());
	    }catch(NumberFormatException f){
	      t1.setText("Invalid Format");
	      return;
	    }
	  z="";
	  t1.setText(z);
	  check=4;
	}
	if(e.getSource()==bmod){                  //FOR MOD/REMAINDER
	  try{
	    num1=Double.parseDouble(t1.getText());
	    }catch(NumberFormatException f){
	      t1.setText("Invalid Format");
	      return;
	    }
	  z="";
	  t1.setText(z);
	  check=5;
	}
	if(e.getSource()==bSqre){                  //FOR Square
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  String sq = ""+num1*num1;
		  z="";
		  t1.setText(sq);
		  
		}
	
	if(e.getSource()==bSqrt){                  //FOR SquareRoot
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  String sqr = ""+Math.sqrt(num1);
		  z="";
		  t1.setText(sqr);
		  
		}
	
	if(e.getSource()==bLog){                  //FOR Log
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  String lg = ""+Math.log10(num1);
		  z="";
		  t1.setText(lg);
		  
		}
	
	
	if(e.getSource()==bCube){                  //FOR Cube
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  String cu = ""+num1*num1*num1;
		  z="";
		  t1.setText(cu);
		  
		}
	
	if(e.getSource()==bSin){                  //FOR Sin
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  double rad = Math.toRadians(num1);
		  String si = ""+Math.sin(rad);
		  z="";
		  t1.setText(si);
		  
		}
	
	if(e.getSource()==bCos){                  //FOR Cose
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  double rad = Math.toRadians(num1);
		  String cos = ""+Math.cos(rad);
		  z="";
		  t1.setText(cos);
		  
		}

	if(e.getSource()==bTan){                  //FOR Tan
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  double rad = Math.toRadians(num1);
		  String tan = ""+Math.tan(rad);
		  z="";
		  t1.setText(tan);
		  
		}


	if(e.getSource()==bSec){                  //FOR Sec
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  double rad = Math.toRadians(num1);
		  double scx = 1/Math.cos(rad);
		  String se = ""+scx;
		  z="";
		  t1.setText(se);
		  
		}
	if(e.getSource()==bCosec){                  //FOR Cosec
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  double rad = Math.toRadians(num1);
		  double cose = 1/Math.sin(rad);
		  String cse = ""+cose;
		  z="";
		  t1.setText(cse);
		  
		}
	
	if(e.getSource()==bCot){                  //FOR Cot
		  try{
		    num1=Double.parseDouble(t1.getText());
		    }catch(NumberFormatException f){
		      t1.setText("Invalid Format");
		      return;
		    }
		  double rad = Math.toRadians(num1);
		  double tn = 1/Math.tan(rad);
		  String ten = ""+tn;
		  z="";
		  t1.setText(ten);
		  
		}

	
	
	                         //RESULT BUTTON
	if(e.getSource()== bEqual){          
	  try{
	    num2=Double.parseDouble(t1.getText());
	    }catch(Exception f){
	      t1.setText("ENTER NUMBER FIRST ");
	      return;
	    }
	  if(check==1)
	    xd =num1+num2;
	  if(check==2)
	    xd =num1-num2;
	  if(check==3)
	    xd =num1*num2;
	  if(check==4)
	    xd =num1/num2; 
	  if(check==5)
	    xd =num1%num2;    
	   
	  t1.setText(String.valueOf(xd));
	}
	                        //FOR CLEARING THE LABEL and Memory
	if(e.getSource()==bclr){
	  num1=0;
	  num2=0;
	  check=0;
	  xd=0;
	   z="";
	   t1.setText(z);
	   } 

	}  

	public static void main(String args[]) {
		VitCaluculor ly = new VitCaluculor();
	}


}
