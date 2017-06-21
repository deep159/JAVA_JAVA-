// Awt Demo
import java.awt.*;
class FrameDemo
{
	Label l1;
	FrameDemo()
	{
		Frame f=new Frame("Student Record");
		f.setSize(400,300);
		f.setLocation(100,50);
		f.setVisible(true);
		
		l1=new Label("aaa");
		f.add(l1);
	}
	public static void main(String args[])
	{
		new FrameDemo();
		new FrameDemo();
	}
}