import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "Program1" width = 300 height = 200>
</applet>
*/

public class Program1 extends Applet implements MouseMotionListener
{
	Label l2,l4,l3,l1;

	public void init()
    	{
        	l1 = new Label("Mouse x");
		
		l2=new Label(); 
		l2.addMouseMotionListener(this);
	
		Label l3 = new Label("Mouse Y");

		l4=new Label();
		l4.addMouseMotionListener(this);

		addMouseMotionListener(this);

		setLayout(new GridLayout(3,2));
	
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	}

	public void mouseDragged(MouseEvent e)
	{}

	public void mouseMoved(MouseEvent e)
    	{
        	l2.setText(String.valueOf(e.getX()));
		l4.setText(String.valueOf(e.getY()));
    	}
}	
