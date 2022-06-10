import java.awt.*;
import java.applet.*;

/* <Applet code = "MyApplet" width = 400 height = 400>
</Applet>*/

public class MyApplet extends Applet
{
	String msg = null;
	String msg1 = null;
	String msg2 = null;
		
	public void init()
	{
		setBackground(Color.blue);
		msg = "Inside Init method !!!";
	}

	public void start()
	{
		msg1 = "Inside Start Method !!";
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.drawString("First Applet Program !!",120,130);
		msg2 = "Inside Paint Method !!";
		g.drawString(msg,120,40);
		g.drawString(msg1,120,80);
		g.drawString(msg2,120,100);
	}
}
