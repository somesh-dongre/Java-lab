import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code = "MyMouse" width=300 height=300>
</applet>
*/

class MyMouse extends MouseAdapter
{
	AdapterDemo ad;
	public MyMouse(AdapterDemo ad)
	{
		this.ad = ad;
	}
	public void mouseDragged(MouseEvent me)
	{
		ad.showStatus("Dragged");
	}
	public void mouseMoved(MouseEvent me)
	{
		ad.showStatus("Moved");
	}
	public void mouseClicked(MouseEvent me)
	{
		ad.showStatus("Clicked");
	}
}
