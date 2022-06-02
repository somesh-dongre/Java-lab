import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Program2 extends JFrame implements ActionListener
{
	JLabel BinaryResult,OctalResult,HexResult,label;
	JTextField t1;
	JButton convert,exit;
	Container container;
	Program2()
	{
		JFrame f=new JFrame("Number conversion");
		f.setSize(400,200);
		
		container = getContentPane();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(5,2)); 
	 	 
		JLabel decimal=new JLabel("Decimal");
				 
	
		t1=new JTextField(20);
		t1.setEditable(true);
		container.add(t1);
		container.add(label=new JLabel());
		t1.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent ke)
			{
				String value=t1.getText();
				int l=value.length();
				char ch=ke.getKeyChar();
				if(ch>='0' && ch<='9' || ch=='\b' || ch==(char)127)
				{
					t1.setEditable(true);
				}

				else
				{
					t1.setEditable(false);
				}
			}
	
		});

		
		JLabel Binary=new JLabel("Binary:");
		BinaryResult=new JLabel("");
		
		JLabel Octal=new JLabel("Octal:");
		OctalResult=new JLabel("");

		JLabel Hex=new JLabel("Hexadecimal:");
		HexResult=new JLabel(" ");
		
		convert=new JButton("convert");
		convert.addActionListener(this);
		
		exit=new JButton("exit");
		exit.addActionListener(this);

		f.add(decimal);
		f.add(t1);
		 
		f.add(Binary);
		f.add(BinaryResult);
		
		f.add(Octal);
		f.add(OctalResult);

		f.add(Hex);
		f.add(HexResult);
		
		f.add(convert);
		f.add(exit);

		f.setVisible(true);
		 
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		 JButton btn = (JButton)ae.getSource();
		 if(btn==convert)
		 {
			String dec=t1.getText();
			int n=Integer.valueOf(dec);
			BinaryResult.setText(Integer.toBinaryString(n));
			OctalResult.setText(Integer.toOctalString(n));
			HexResult.setText(Integer.toHexString(n));
		 }
		 if(btn==exit)
		 {
			System.exit(0);
		 }

	}
	public static void main(String[] args)
	{
		new Program2();
	}
}
