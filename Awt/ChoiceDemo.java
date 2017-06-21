import java.awt.*;
import java.awt.event.*;

class ChoiceDemo extends Frame implements ItemListener
{
	Choice cities;
	Label l1;
	ChoiceDemo()
	{
		setSize(400,300);
		setVisible(true);
		setLayout(null);
		setLocation(100,100);
		
		cities=new Choice();
		cities.add("mohali");
		cities.add("ludhiana");
		cities.add("chandigarh");
		cities.addItemListener(this);
		cities.setBounds(100,100,100,30);
		add(cities);
		
		l1=new Label("");
		l1.setBounds(100,200,200,30);
		add(l1);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		String s=cities.getSelectedItem();
		l1.setText("city : "+s);
	}
	
	
	
	
	public static void main(String args[])
	{
		new ChoiceDemo();
	}
}