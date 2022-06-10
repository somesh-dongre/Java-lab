import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "Amouse" width=500 height=500>
 * </applet>
 * */

public  class Amouse extends Applet implements MouseMotionListener
{
	Label l1,l2,l3,l4;
	public void init()
	{
		Label l1 = new Label("Mouse X");
		l2 = new Label("Mouse X Coordinate");
		l2.addMouseMotionListener(this);
		
		Label l3 = new Label("Mouse Y");
		l4 = new Label("Mouse Y Coordinate");
		l4.addMouseMotionListener(this);

		addMouseMotionListener(this);
		setLayout(new GridLayout(3,2));
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	}
	public void mouseDragged(MouseEvent me)
	{}
	public void mouseMoved(MouseEvent me)
	{
		l2.setText(String.valueOf(me.getX()));
		l4.setText(String.valueOf(me.getY()));
	}
}

