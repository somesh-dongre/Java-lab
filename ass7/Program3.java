import java.applet.*;
import java.awt.*;

/*<applet code="Program3" width=400 height=400>
</applet>*/

public class Program3 extends Applet
{

	public void paint(Graphics g)
	{
		String f[];
		int a=20;
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		f=ge.getAvailableFontFamilyNames();
		for(int i=0;i<f.length;i++)
		{
			g.drawString(f[i],10,a);
			a=a+20;
		}
	}
}

			