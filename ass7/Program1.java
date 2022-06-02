import java.applet.*;
import java.awt.*;

/*<applet code="Program1" width=400 height=200>
</applet>*/

public class Program1 extends Applet
{
	public void init()
	{
		Label l1=new Label("Mouse X");
		Label l2=new Label("Mouse X cordinate");
		Label l3=new Label("Mouse Y");
		Label l4=new Label("Mouse Y cordinate");
		setLayout(new GridLayout(3,2));
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	}
}
