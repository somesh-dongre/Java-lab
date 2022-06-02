import java.awt.*;
import javax.swing.*;

class Program2 extends JFrame
{
	JLabel l1,l2,l3;
	JComboBox fontFam;
	String[] fonts;
	JRadioButton rb1,rb2;
	ButtonGroup g1;
	JList list;
	DefaultListModel listModel;
	JTextField t1;
	JButton b1,b2;
	Box verticalBox;
	JScrollPane scroll;


	Program2()
	{
		//Created labels
		l1 = new JLabel("Font");
		l2 =  new JLabel("Font Style");
		l3 = new JLabel("Size");

		//Create drop-down list
		fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		fontFam = new JComboBox(fonts);

		//Created radio buttons 
		rb1 = new JRadioButton("Bold");
		rb2 = new JRadioButton("Italic");
		g1 = new ButtonGroup();
		g1.add(rb1);
		g1.add(rb2);

		Box verticalBox = Box.createVerticalBox();
		verticalBox.add(rb1);
		verticalBox.add(rb2);

		//Created font size list 
		listModel = new DefaultListModel();
		String[] fontSizes = new String[50];

		for(int i=0;i<=50;i++){
			listModel.addElement(String.valueOf(i+1));
		}

		list = new JList(listModel);
		scroll = new JScrollPane(list);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		//created text field
		t1 = new JTextField("Hello Everyone");
		t1.setEditable(false);


		//created buttons
		b1 = new JButton("Apply");
		b2 = new JButton("Exit");

		setSize(550,450);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,3));
	
		add(l1);
		add(l2);
		add(l3);

		add(fontFam);
		add(verticalBox);
		add(scroll);
	
		add(t1);	
		add(b1);
		add(b2);
	}
	public static void main(String[] args)
	{
		new Program2();
	}

}
	


	
















		

		

	
	









