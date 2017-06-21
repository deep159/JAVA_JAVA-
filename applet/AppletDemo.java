/*
<applet code="AppletDemo.java" width="400" height="400"></applet>
*/
import java.applet.*;
import java.awt.*;

public class AppletDemo extends Applet implements Runnable
{
	Font f;
	int x;
	int y;
	public void init()
	{
		f=new Font("arial",Font.BOLD,20);
		setFont(f);
		x=50;
		y=50;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
		for(int i=50;i<=300;i++)
		{
			f=new Font("arial",Font.BOLD,i);
			setFont(f);
			try
			{
			Thread.sleep(6);	
			}
			catch(Exception e){}
			x++;
			repaint();
		}
		for(int i=50;i<=300;i++)
		{
			
			try
			{
			Thread.sleep(6);	
			}
			catch(Exception e){}
			y++;
			repaint();
		}
		for(int i=300;i>=50;i--)
		{
			f=new Font("arial",Font.BOLD,i);
			setFont(f);
			try
			{
			Thread.sleep(6);	
			}
			catch(Exception e){}
			x--;
			repaint();
		}
		for(int i=300;i>=50;i--)
		{
			
			try
			{
			Thread.sleep(6);	
			}
			catch(Exception e){}
			y--;
			repaint();
		}
		for(int i=50;i<=300;i++)
		{
			try
			{
			Thread.sleep(6);	
			}
			catch(Exception e){}
			x++;
			y++;
			repaint();
		}
		for(int i=300;i>=50;i--)
		{
			try
			{
			Thread.sleep(6);	
			}
			catch(Exception e){}
			y--;
			x--;
			repaint();
		}
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawString("Jaspal",x,y);
	}
}