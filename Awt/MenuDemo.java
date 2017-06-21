import java.awt.*;
import java.awt.event.*;

class MenuDemo extends Frame implements ActionListener
{
	MenuBar mBar;
	Menu color,subMenu;
	MenuItem green,red,blue,dark,light,medium;
	MenuShortcut shortcut1,shortcut2;
	
	MenuDemo()
	{
		setSize(400,300);
		setVisible(true);
		setLayout(null);
		setLocation(100,100);
		
		shortcut1=new MenuShortcut(KeyEvent.VK_X);
		shortcut2=new MenuShortcut(KeyEvent.VK_Z);
		
		mBar=new MenuBar();
		setMenuBar(mBar);
		
		color=new Menu("select");
		mBar.add(color);
		
		green=new MenuItem("green");
		green.addActionListener(this);
		green.setShortcut(shortcut1);
		
		red=new MenuItem("red");
		red.setShortcut(shortcut2);
		red.addActionListener(this);
		
		blue=new MenuItem("blue");
		blue.addActionListener(this);
		
		subMenu=new Menu("options");
		dark=new MenuItem("dark");
		light=new MenuItem("light");
		medium=new MenuItem("medium");
		subMenu.add(dark); subMenu.add(light); subMenu.add(medium);
		
		
		color.add(green); color.add(red); color.add(blue);
		color.addSeparator();
		color.add(subMenu);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==green)
		{
			setBackground(Color.green);
		}
		if(e.getSource()==red)
		{
			setBackground(Color.red);
		}
		if(e.getSource()==blue)
		{
			setBackground(Color.blue);
		}
	}
	
	
	public static void main(String args[])
	{
		new MenuDemo();
	}
}