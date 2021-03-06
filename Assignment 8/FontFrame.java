import java.awt.*;
import javax.swing.*;

class FontFrame extends JFrame
{
	JLabel font,font_style,size;
	JButton btnApply,btnExit;
	JTextField fontOpt;
	JComboBox fontFam;
	JRadioButton bold,italic;
	ButtonGroup radioButton;
	Box verticalBox;
	DefaultListModel listModel;
	String fonts[];
	JScrollPane scroll;
	JList list;

	FontFrame()
	{
		font = new JLabel("Font");
		font_style = new JLabel("Font Style");
		size = new JLabel("Size");
		
		btnApply = new JButton("Apply");
		btnExit = new JButton("Exit");

		fontOpt = new JTextField("Hello Everyone");
		fontOpt.setEditable(false);
		fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		fontFam = new JComboBox(fonts);

		bold = new JRadioButton("Bold");
		italic = new JRadioButton("Italic");

		radioButton = new ButtonGroup();

		radioButton.add(bold);
		radioButton.add(italic);

		listModel = new DefaultListModel();
		String[] fontSizes = new String[50];
		for(int i = 0;i<=50;i++)
		{
			listModel.addElement(String.valueOf(i+10));
		}

		list = new JList(listModel);
		scroll = new JScrollPane(list);

scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.add(bold);
		bold.setActionCommand("bold");

		verticalBox.add(italic);
		italic.setActionCommand("italic");

		setSize(550,450);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,3));

		add(font);
		add(font_style);
		add(size);

		add(fontFam);
		add(verticalBox);
		add(scroll);

		add(fontOpt);
		add(btnApply);
		add(btnExit);
	}
	public static void main(String args[])
	{
		new FontFrame();
	}
}
