import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code = "keyboard" width=400 height=400>
</applet>
*/

public class keyboard extends Applet implements KeyListener
{
    String msg = "";
    String keyCode = "";
 
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
    	char key1 = k.getKeyChar();
	msg += key1 + " ";
        showStatus("Key Typed");
        repaint();
    }
 
    public void keyPressed(KeyEvent k)
    {
	int key = k.getKeyCode();
	switch(key)
        {
        	//setText(""+key);
            case KeyEvent.VK_F1:
                msg += "F1 ";
                break;
            case KeyEvent.VK_F2:
                msg+= "F2 ";
                break;
            case KeyEvent.VK_F3:
                msg += "F3 ";
                break;
            case KeyEvent.VK_F4:
                msg += "F4 ";
                break;
            case KeyEvent.VK_F5:
                msg += "F5 ";
                break;
            case KeyEvent.VK_F6:
                msg += "F6 ";
                break;
            case KeyEvent.VK_F7:
                msg += "F7 ";
                break;
            case KeyEvent.VK_F8:
                msg += "F8 ";
                break;
            case KeyEvent.VK_F9:
                msg += "F9 ";
                break;
            case KeyEvent.VK_F10:
                msg += "F10 ";
                break;
            case KeyEvent.VK_F11:
                msg += "F11 ";
                break;
            case KeyEvent.VK_F12:
                msg += "F12 ";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "RIGHT ";
                break;
            case KeyEvent.VK_LEFT:
                msg += "LEFT ";
                break;
            case KeyEvent.VK_UP:
                msg += "UP ";
                break;
            case KeyEvent.VK_DOWN:
                msg += "DOWN ";
                break;
            case KeyEvent.VK_TAB:
                msg += "";
                break;
            case KeyEvent.VK_BACK_SPACE:
               msg += "BACK SPACE";
               break;
            case KeyEvent.VK_DELETE:
                msg += "DELETE";
                break;
	    case KeyEvent.VK_INSERT:
		msg += "INSERT";
		break;
	    case KeyEvent.VK_HOME:
		msg += "HOME";
		break;
	    case KeyEvent.VK_PAGE_UP:
		msg += "PAGE UP";
		break;
	    case KeyEvent.VK_PAGE_DOWN:
		msg += "PAGE DOWN";
		break;
	    case KeyEvent.VK_END:
		msg += "END";
		break;					
	    	
        }
	repaint();
        showStatus("Key Pressed");
        repaint();
    }
 
    public void paint(Graphics g)
    {
        g.drawString(msg, 50, 50);
        g.drawString(keyCode, 50, 100);
    }
}
