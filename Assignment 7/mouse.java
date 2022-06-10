import java.awt.*;
import java.applet.*;

/*<applet code = "mouse" height = 500 width = 500>
</applet>*/
	
public class mouse extends Applet
{
	public void init()
	{
		Label l1 = new Label("Mouse X");
		Label l2 = new Label("Mouse X co-ordinate");
		Label l3 = new Label("Mouse Y");
		Label l4 = new Label("Mouse Y co-ordiante");

		setLayout(new GridLayout(3,2));
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	}
}
