//import java.util.*;
import java.awt.*;
import java.applet.*;

/*
<applet code="Program3" width=300 height=200>
<param name = str value = Mrunmai>
</applet>
*/

public class Program3 extends Applet
{
	String Str,vowel="";
	public void paint(Graphics g)
	{
		Str = getParameter("str");
		g.drawString(Str,20,20);
		
		char[] StrArr = Str.toCharArray();
		for(char ch: StrArr)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowel += ch+" ";
			}
		}
		showStatus(vowel);
	}
}
