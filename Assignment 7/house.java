import java.applet.*;
import java.awt.*;

/*<applet code = "house" width = 500 height = 500>
*</applet>
*/

public class house extends Applet
{
	public void paint(Graphics g)
	{
		int x[] = {300,400,190};
		int y[] = {30,220,220};
		int numpoints = 3;
		String msg=null;
		Font f = new Font("",Font.BOLD,18);
		
		//Roof
		Color c = new Color(255,0,0);
		g.setColor(c);
		g.fillPolygon(x,y,numpoints);

		//Wall
		c = new Color(255,255,0);
		g.setColor(c);
		g.fillRect(190,220,210,220);
		
		//Door
		c = new Color(255,255,255);
		g.setColor(c);
		g.fillRect(255,320,80,120);
		
		g.setFont(f);
		msg = "जय भोलेनाथ ";
		g.setColor(Color.red);
		g.drawString(msg,250,250);
	}

}

//जय भोलेनाथ
