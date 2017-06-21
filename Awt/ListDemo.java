import java.awt.*;
import java.awt.event.*;

class ListDemo extends Frame implements ItemListener
{
	List hobbies;
	Label l1;
	ListDemo()
	{
		setSize(400,300);
		setVisible(true);
		setLayout(null);
		setLocation(100,100);
		
		hobbies=new List();
		hobbies.add("Reading");
		hobbies.add("Singing");
		hobbies.add("Gaming");
		hobbies.add("writting");
		hobbies.add("Reading");
		hobbies.add("Singing");
		hobbies.add("Gaming");
		hobbies.add("writting");
		
		hobbies.setBounds(100,100,100,50);
		hobbies.addItemListener(this);
		add(hobbies);
		
		l1=new Label("");
		l1.setBounds(250,100,200,30);
		add(l1);
		
	}

	public void itemStateChanged(ItemEvent e)
	{
		String s=hobbies.getSelectedItem();
		l1.setText(s);
	}
	
	public static void main(String args[])
	{
		new ListDemo();
	}
}