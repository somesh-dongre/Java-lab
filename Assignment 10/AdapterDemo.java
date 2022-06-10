import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code = "AdapterDemo" width=300 height=300>
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
