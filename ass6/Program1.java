import java.awt.*;
import java.applet.*;

/*		
<applet code = "Program1" width = 300 height = 200>
</applet>
*/

public class Program1 extends Applet
{
	String msg,msg1;
	public void init()
	{
		msg = "Init Method";
	}
	public void start()
	{
		msg1 = "Start Method";
	}
	public void paint(Graphics g)
	{
		setBackground(Color.blue);
		//setForeground(Color.yellow);
		g.setColor(Color.yellow);
		g.drawString(msg,20,20);
		g.drawString(msg1,20,40);
		g.drawString("Paint Method",20,60);
	}
	
}
