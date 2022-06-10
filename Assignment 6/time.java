import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;

/*<applet code="time" width=400 height=400>
</applet>*/

public class time extends Applet
{
	public void paint(Graphics g)
	{
		Calendar c = Calendar.getInstance();
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String time = ""+hour+":"+hour+":"+second;
		g.drawString(time,120,120);
		String strDate = sd.format(d);
		g.drawString(strDate,120,140);

		if((hour>=0)&&(hour<12))
			showStatus("Good Morning!!");
		else if((hour>=12)&&(hour<17))
			showStatus("Good Afternoon!!");
		else if((hour>=17)&&(hour<20))
			showStatus("Good Evening!!");
	}

}
