import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mouse extends JFrame implements MouseMotionListener
{
	static JLabel l1,l2,l3,l4;
	mouse()
	{}
	public static void main(String args[])
    	{
        	JFrame f = new JFrame("MouseMotionListener");
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		l1 = new JLabel("Mouse X");
 		l2 = new JLabel("Mouse Y");
		l3 = new JLabel("Mouse X coordinate");
		l4 = new JLabel("Mouse Y coordinate");
		mouse m = new mouse();
		f.addMouseMotionListener(m);
		p.setLayout(new GridLayout(3,2));
		p.add(l1);
        	p.add(l3);
		p.add(l2);
        	p.add(l4);
		f.add(p);
        	f.show();
		f.setVisible(true);
	}
	public void mouseDragged(MouseEvent e)
	{}
	public void mouseMoved(MouseEvent e)
    	{
        	l3.setText(String.valueOf(e.getX()));
		l4.setText(String.valueOf(e.getY()));
    	}
}	
