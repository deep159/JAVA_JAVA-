import java.applet.*;
import java.awt.*;
public class App extends Applet
{
	public void paint(Graphics a)
	{
	a.setColor(Color.red);
	a.drawString("Hello",40,40);
	}
	
}
/*<applet code="App.class",width="400",height="200">
</applet>*/