import java.applet.*;
import java.awt.*;

/*<applet code="Program2" width=600 height=600>
</applet>*/

public class Program2 extends Applet
{
	public void paint(Graphics g)
	{
		int x[]={300,400,190};
		int y[]={30,220,220};
		int no=3;
		Color c=new Color(255,0,0);
		g.setColor(c);
		g.fillPolygon(x,y,no);
		c=new Color(255,255,0);
		g.setColor(c);
		g.fillRect(190,220,210,220);
		c=new Color(255,255,255);
		g.setColor(c);
		g.fillRect(255,320,80,120);
		
	}
}
