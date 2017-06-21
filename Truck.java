/*<applet code="Truck.java" width="500" height="400"></applet>*/
import java.applet.*;
import java.awt.*;
public class Truck extends Applet implements Runnable
{
	Font j;
	int x;
	int a,b,c,d,e,f,y,h,k;
	public void init()
	{
		j=new Font("arial",Font.BOLD,20);
		setFont(j);
		x=50;
		//y=50;
		a=300;
		b=85;
		c=215;
		d=322;
		e=102;
		f=232;
		y=339;
		h=342;
		k=80;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)  // while is used to make it run forever in loop
		{            //starting brace of while loop
			for(int i=50;i<=900;i++)
			{
				j=new Font("arial",Font.BOLD,20);
				setFont(j);
				try
				{
				Thread.sleep(15);	
				}
				catch(Exception e){}
				x++;
				a++;
				b++;
				c++;
				d++;
				e++;
				f++;
				y++;
				h++;
				k++;
				repaint();
			}
			for(int i=900;i>=50;i--)
			{
				j=new Font("arial",Font.BOLD,20);
				setFont(j);
				try
				{
				Thread.sleep(15);	
				}
				catch(Exception e){}
				x--;
				a--;
				b--;
				c--;
				d--;
				e--;
				f--;
				y--;
				h--;
				k--;
				repaint();
			}
			}  //closing brace of while loop
		}
public void paint(Graphics g)
{
	g.setColor(Color.white);
	g.fillRect(0,0,2000,204);
	g.setColor(Color.green);
	g.fillRect(0,207,2000,2000);
	g.setColor(Color.yellow);
	g.fillRect(x,50,250,130);
	g.setColor(Color.blue);
	g.drawString("Swaran Transport",k,80);
	g.setColor(Color.red);
	g.fillRect(a,90,95,90);
	g.setColor(Color.black);
	g.fillOval(b,155,50,50);
	g.fillOval(c,155,50,50);
	g.fillOval(d,155,50,50);
	g.setColor(Color.white);
	g.fillOval(e,173,15,15);
	g.fillOval(f,173,15,15);
	g.fillOval(y,173,15,15);
	g.setColor(Color.white);
	g.fillRoundRect(h,105,50,30,20,20);
	g.setColor(Color.black);
	g.drawLine(0,204,2000,204);
	g.drawLine(0,205,2000,205);
	g.drawLine(0,206,2000,206);

}
}