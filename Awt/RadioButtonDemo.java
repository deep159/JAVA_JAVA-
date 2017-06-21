import java.awt.*;
import java.awt.event.*;

class RadioButtonDemo extends Frame implements ItemListener
{
	CheckboxGroup fruits;
	Checkbox c1,c2,c3;
	Label l1;
	
	RadioButtonDemo()
	{
		setSize(400,300);
		setVisible(true);
		setLayout(null);
		setLocation(100,100);
	
		l1=new Label("");
		l1.setBounds(100,200,200,30);
		add(l1);
		
		fruits=new CheckboxGroup();
		
		c1=new Checkbox("Apple",fruits,false);
		c1.setBounds(100,50,100,30);
		c1.addItemListener(this);
		add(c1);
		
		c2=new Checkbox("Mango",fruits,false);
		c2.setBounds(100,90,100,30);
		c2.addItemListener(this);
		add(c2);
		
		c3=new Checkbox("Berry",fruits,true);
		c3.setBounds(100,130,100,30);
		c3.addItemListener(this);
		add(c3);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==c1)
		{
			l1.setText(c1.getLabel());
		}
		if(e.getSource()==c2)
		{
			l1.setText(c2.getLabel());
		}
		if(e.getSource()==c3)
		{
			l1.setText(c3.getLabel());
		}
	}
	
	public static void main(String args[])
	{
		new RadioButtonDemo();
	}
}