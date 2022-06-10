import java.awt.*;
import java.applet.*;
import java.util.*;

/*<applet code = "vowels" width=500 height=500>
*<param name = "Message" value = "First AWT Program">
*</applet>
*/

public class vowels extends Applet
{
	String msg = null;
	public void init()
	{
		msg = getParameter("Message");
	}	
		
	public void paint(Graphics g)
	{
		String msg1 = "";
		boolean flag=false;
		g.drawString(msg,50,25);
		for(int i=0;i<msg.length();i++)
		{
			if(msg.charAt(i)=='a' || msg.charAt(i)=='e'|| msg.charAt(i)=='i' || msg.charAt(i)=='o' || msg.charAt(i)=='u' || msg.charAt(i)=='A' || msg.charAt(i)=='E' || msg.charAt(i)=='I' || msg.charAt(i)=='O' || msg.charAt(i)=='U')
			{
					if(flag=false)
					{
						msg1=""+msg.charAt(i);
						flag=true;
					}
					else
						msg1 += " "+msg.charAt(i);	
			}
			showStatus("Vowels in the given String : "+msg1);			
		}	
	}
}
