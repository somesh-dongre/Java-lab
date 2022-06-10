import java.awt.*;
import java.applet.*;

/*<applet code = "fonts" width = 600 height = 600>
</applet>
*/

public class fonts extends Applet
{
	public void paint(Graphics g)
	{
		String FontList[];
		int y=20;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList = ge.getAvailableFontFamilyNames();

		for(int i = 0;i < FontList.length;i++)
		{
			g.drawString(FontList[i],10,y);
			y+=20;
		}
	}
}
