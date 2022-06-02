import java.util.*;
import java.awt.*;
import java.applet.*;
import java.text.*;

/*
<applet code = "Program2" width = 600 height = 600>
</applet>
*/

public class Program2 extends Applet
{
	int ampm;
	public void paint(Graphics g)
	{
		Calendar cal = Calendar.getInstance();
	
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String date = formatter.format(d);
		g.drawString(date,20,20);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		String time = hour+":"+minute+":"+second;
		g.drawString(time,20,40);
		
		if(hour>=0 && hour<12)
			showStatus("Good Morning");
		else if(hour>=12 && hour<17)
			showStatus("Good Afternoon");
		else if(hour>=17 && hour<20)
			showStatus("Good Evening");
		else if(hour>=20 && hour<0)
			showStatus("Good Night");
	}
}
