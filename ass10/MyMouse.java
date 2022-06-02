import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = MyMouse width = 400 height = 400>
</applet>
*/

public class MyMouse extends MouseAdapter
{
	AdapterDemo ad;
	public MyMouse(AdapterDemo ad)
	{
		this.ad=ad;
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
