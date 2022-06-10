import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class fontframe extends JFrame implements ActionListener
{
	JLabel font,font_style,size;
	JButton apply,exit;
	JTextField fontOpt;
	JComboBox fontFam;
	JRadioButton bold,italic;
	ButtonGroup radioButton;
	Box verticalBox;
	DefaultListModel listModel;
	String fonts[];
	JList list;

	fontframe()
	{
		font = new JLabel("Font");
		font_style = new JLabel("Font Style");
		size = new JLabel("Size");
		
		apply = new JButton("Apply");
		exit = new JButton("Exit");

		fontOpt = new JTextField("Hello Everyone");
		fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		fontFam = new JComboBox(fonts);

		bold = new JRadioButton("Bold");
		italic = new JRadioButton("Italic");

		radioButton = new ButtonGroup();

		radioButton.add(bold);
		radioButton.add(italic);

		listModel = new DefaultListModel();
		for(int i = 0;i<=60;i++)
		{
			listModel.addElement(String.valueOf(i+1));
		}

		list = new JList(listModel);
		JScrollPane scrollPane = new JScrollPane(list);
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
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
		add(scrollPane);

		add(fontOpt);
		add(apply);
		add(exit);

		apply.addActionListener(this);
		exit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == exit)
		{
			System.exit(0);
		}
		else
		{
			String font_style=radioButton.getSelection().getActionCommand();
			String font = (String)fontFam.getSelectedItem();
			int font_size = Integer.parseInt((String)list.getSelectedValue());
			String font_str = fontOpt.getText();
			Font font1;

			if(font_style.equalsIgnoreCase("bold"))
			{
				font1 = new Font(font,Font.BOLD,font_size);
			}
			else
			{
				font1 = new Font(font,Font.ITALIC,font_size);
			}
			fontOpt.setFont(font1);
		}
	}
	public static void main(String args[])
	{
		new fontframe();
	}
}
