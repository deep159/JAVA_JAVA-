import java.awt.*;
import javax.swing.*;

class FrameDemo extends JFrame
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	FrameDemo()
	{
	super("swaran");
	setSize(500,700);
	setLocation(10,10);
	setVisible(true);
	setLayout(null);
	
	l1=new JLabel("username: ");
	l1.setBounds(10,30,70,20);
	add(l1);
	l2=new JLabel("password: ");
	l2.setBounds(10,60,70,20);
	add(l2);
	t1=new JTextField(10);
	t1.setBounds(110,33,150,20);
	add(t1);
	}
	
	public static void main(String args[])
	{
	new FrameDemo();
}}