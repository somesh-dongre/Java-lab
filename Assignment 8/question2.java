import java.awt.*;
import javax.swing.*;
import java.applet.*;
	
/* <applet code = "question2" width = 500 height = 500>
</applet>
*/		

public class question2 extends JApplet
{
	JLabel l1,l2,l3;
	JComboBox c1;
	String fname[];
	JRadioButton rb1,rb2;
	ButtonGroup g1;
	JList List;
	DefaultListModel dlm;
	JTextField t1;
	JButton b1,b2;
	
	public void init()
	{
		setLayout(null);
		l1 = new JLabel("Font");
		l1.setBounds(50,50,50,30);
		
		l2 = new JLabel("Font Style");
		l2.setBounds(200,50,100,30);

		l3 = new JLabel("Size");
		l3.setBounds(350,50,50,30);
		
		c1 = new JComboBox();
		c1.setBounds(50,100,100,30);
		fname = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(int i=0;i<fname.length;i++)
		{
			c1.addItem(fname[i]);
		}
		g1 = new ButtonGroup();
		rb1 = new JRadioButton("Bold");
		g1.add(rb1);
		rb1.setBounds(200,90,70,30);
	
		rb2 = new JRadioButton("Italic");
		g1.add(rb2);
		rb2.setBounds(200,120,70,30);

		dlm = new DefaultListModel();
		for(int i=0;i<73;i++)
		{
			dlm.addElement(String.valueOf(i));	
		}

		JList list = new JList(dlm);
		list.setBounds(350,90,50,50);
		JScrollPane jsp = new JScrollPane(list);	
		
		t1 = new JTextField("Hello Everyone !!");
		t1.setEditable(false);
		t1.setBounds(50,150,100,30);
		
		b1 = new JButton("Apply");
		b1.setBounds(200,150,90,30);

		b2 = new JButton("Exit");
		b2.setBounds(350,150,90,30);	

		add(l1);
		add(l2);
		add(l3);
		add(c1);
		add(rb1);
		add(rb2);
		add(t1);
		add(b1);	
		add(b2);
		add(list);
		add(jsp);
		setVisible(true);	
	}	
}
