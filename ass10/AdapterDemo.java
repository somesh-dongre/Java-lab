import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = AdapterDemo width = 300 height = 200>
</applet>
*/

public class AdapterDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouse(this));
		addMouseMotionListener(new MyMouse(this));
	}
}
