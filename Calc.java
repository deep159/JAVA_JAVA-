import java.awt.*;
import java.awt.event.*;
class Calc extends Frame
{
	TextField t1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,beq,badd,bmin,bdiv,bmul;
	
	
	
	Calc()
	{
		//super (Frame);
		setSize(330,500);
		setLocation(300,200);
		setVisible(true);
		setLayout(null);
		
		t1=new TextField(10);
		t1.setBounds(30,50,280,50);
		b1=new Button("1");
		b1.setBounds(30,150,50,50);
		b2=new Button("2");
		b2.setBounds(100,150,50,50);
		b3=new Button("3");
		b3.setBounds(170,150,50,50);
		b4=new Button("4");
		b4.setBounds(30,230,50,50);
		b5=new Button("5");
		b5.setBounds(100,230,50,50);
		b6=new Button("6");
		b6.setBounds(170,230,50,50);
		b7=new Button("7");
		b7.setBounds(30,310,50,50);
		b8=new Button("8");
		b8.setBounds(100,310,50,50);
		b9=new Button("9");
		b9.setBounds(170,310,50,50);
		b0=new Button("0");
		b0.setBounds(100,390,50,50);
		bdot=new Button(".");
		bdot.setBounds(30,390,50,50);
		beq=new Button("=");
		beq.setBounds(170,390,50,50);
		badd=new Button("+");
		badd.setBounds(240,150,50,50);
		bmin=new Button("-");
		bmin.setBounds(240,230,50,50);
		bdiv=new Button("/");
		bdiv.setBounds(240,310,50,50);
		bmul=new Button("*");
		bmul.setBounds(240,390,50,50);
		
		
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(bdot);
		add(beq);
		add(badd);
		add(bmin);
		add(bdiv);
		add(bmul);
	}
	
	
	
	public static void main(String args[])
{
new Calc();


}
}