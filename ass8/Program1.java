import java.awt.*;
import javax.swing.*;

class Program1 extends JFrame
{
	JButton b1,b2;
	JLabel l1,l2,l4,l5,l7,l8,l10;
	JTextField t1;
	Program1()
	{
	
		JFrame frm = new JFrame("Number Conversion");
		frm.setSize(400,200);
		frm.setLayout(new GridLayout(5,2));
	
		JLabel l1 = new JLabel("Decimal");
		JTextField t1 = new JTextField(10);
		t1.setEditable(false);
		JLabel l2 = new JLabel("Binary");
		
		JLabel l4 = new JLabel("Result in Binary");
		JLabel l5 = new JLabel("Octal");
		
		JLabel l7 = new JLabel("Result in Octal");
		JLabel l8 = new JLabel("Hexadecimal");
		
		JLabel l10 = new JLabel("Result in Hexadecimal");
		JButton b1 = new JButton("Convert");
		JButton b2 = new JButton("Exit");

		frm.add(l1);
		frm.add(t1);
		frm.add(l2);
		
		frm.add(l4);
		frm.add(l5);
		
		frm.add(l7);
		frm.add(l8);
		
		frm.add(l10);
		frm.add(b1);
		frm.add(b2);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new Program1();
	}
}

