import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "Program1" width = 400 height = 300>
</applet>
*/

public class Program1 extends Applet implements KeyListener 
{
	String msg="";
	String keyCode="";

	public void init()
	{
		addKeyListener(this);
	}

	public void keyReleased(KeyEvent k)
	{
		showStatus("Key Released");
		repaint();
	}
	
	public void keyTyped(KeyEvent k)
	{
		char key1=k.getKeyChar();
		msg +=(char)key1;
		showStatus("Key Typed");
		repaint();
	}

	public void keyPressed(KeyEvent k)
	{
		int key=k.getKeyCode();
		
		switch(key)
		{
			case KeyEvent.VK_F1:
				msg=msg+"F1";
				break;

			case KeyEvent.VK_F2:
				msg=msg+"F2";
				break;

			case KeyEvent.VK_F3:
				msg=msg+"F3";
				break;

			case KeyEvent.VK_F4:
				msg=msg+"F4";
				break;

			case KeyEvent.VK_F5:
				msg=msg+"F5";
				break;
			
			case KeyEvent.VK_F6:
				msg=msg+"F6";
				break;

			case KeyEvent.VK_F7:
				msg=msg+"F7";
				break;

			case KeyEvent.VK_F8:
				msg=msg+"F8";
				break;

			case KeyEvent.VK_F9:
				msg=msg+"F9";
				break;

			case KeyEvent.VK_F10:
				msg=msg+"F10";
				break;

			case KeyEvent.VK_F11:
				msg=msg+"F11";
				break;

			case KeyEvent.VK_F12:
				msg=msg+"F12";
				break;

			case KeyEvent.VK_RIGHT:
				msg=msg+"RIGHT";
				break;

			case KeyEvent.VK_LEFT:
				msg=msg+"LEFT";
				break;

			case KeyEvent.VK_UP:
				msg=msg+"UP";
				break;

			case KeyEvent.VK_DOWN:
				msg=msg+"DOWN";
				break;

			case KeyEvent.VK_CONTROL:
				msg=msg+"CONTROL";
				break;

			case KeyEvent.VK_ALT:
				msg=msg+"ALT";
				break;

			case KeyEvent.VK_DELETE:
				msg=msg+"DELETE";
				break;

			case KeyEvent.VK_PAGE_UP:
				msg=msg+"PAGE_UP";
				break;

			case KeyEvent.VK_PAGE_DOWN:
				msg=msg+"PAGE_DOWN";
				break;

			case KeyEvent.VK_ENTER:
				msg=msg+"ENTER";
				break;

			case KeyEvent.VK_SHIFT:
				msg=msg+"SHIFT";
				break;

			case KeyEvent.VK_ESCAPE:
				msg=msg+"ESCAPE";
				break;
		}
	
		repaint();
		showStatus("Key Pressed");
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,70,50);
	
	}
}
			



	
	























