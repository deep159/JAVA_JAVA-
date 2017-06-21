import java.awt.*;
import java.awt.event.*;

class CheckBoxDemo extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	Label l1;
	CheckBoxDemo()
	{
		setSize(400,300);
		setVisible(true);
		setLayout(null);
		setLocation(100,100);
	
		l1=new Label("");
		l1.setBounds(100,200,200,30);
		add(l1);
		
		c1=new Checkbox("PHP");
		c1.setBounds(100,50,100,30);
		c1.addItemListener(this);
		add(c1);
		
		c2=new Checkbox("ANDROID");
		c2.setBounds(100,90,100,30);
		c2.addItemListener(this);
		add(c2);
		
		c3=new Checkbox("JAVA");
		c3.setBounds(100,130,100,30);
		c3.addItemListener(this);
		add(c3);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==c1)
		{
			if(c1.getState()==true)
			{
			l1.setText(c1.getLabel());	
			}
			else
			{
			l1.setText("");	
			}
			
		}
		if(e.getSource()==c2)
		{
			String s=c2.getLabel();
			l1.setText(s);
		}
		if(e.getSource()==c3)
		{
			l1.setText(c3.getLabel());
		}
	}
	
	public static void main(String args[])
	{
		new CheckBoxDemo();
	}
}