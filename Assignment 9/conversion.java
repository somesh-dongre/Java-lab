import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class conversion extends JFrame implements ActionListener
{
  JLabel BinaryResult, OctalResult, HexResult,label;
  JTextField t1;
  JButton ConvertButton, ExitButton;
  Container container;	    
conversion()
  {
    JFrame f = new JFrame ("Number Conversion");
      f.setSize (400, 200);
      container = getContentPane();	
      f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      f.setLayout (new GridLayout (5, 2));
      JLabel decimal = new JLabel ("Decimal");
      t1 = new JTextField (20);
	t1.setEditable(true);
	container.add(t1);
	container.add(label = new JLabel());	
	t1.addKeyListener(new KeyAdapter()
{
	public void keyPressed(KeyEvent ke)
	{
		String value = t1.getText();
		int l = value.length();
		if(ke.getKeyChar() >= '0' && ke.getKeyChar() <='9' || ke.getKeyChar() == '\b'	 || ke.getKeyChar() == (char)127)
		{
			t1.setEditable(true);
			label.setText("");		
		}
		else
		{
			t1.setEditable(false);
			label.setText("Enter only numbers (0-9)");
		}
	}
});	
    
    JLabel Binary = new JLabel ("Binary");
    BinaryResult = new JLabel ();
    JLabel Octal = new JLabel ("Octal");
    OctalResult = new JLabel ();
    JLabel Hex = new JLabel ("Hexadecimal");
    HexResult = new JLabel ();
    ConvertButton = new JButton ("Convert");
    ConvertButton.addActionListener (this);
    ExitButton = new JButton ("Exit");
    ExitButton.addActionListener (this);
    f.add (decimal);
    f.add (t1);
    f.add (Binary);
    f.add (BinaryResult);
    f.add (Octal);
    f.add (OctalResult);
    f.add (Hex);
    f.add (HexResult);
    f.add (ConvertButton);
    f.add (ExitButton);
    f.setVisible (true);
  }
  public void actionPerformed (ActionEvent ae)
  {
    if (ae.getSource () == ConvertButton)
      {
	String decimal = t1.getText ();
	int d = Integer.valueOf (decimal);
	BinaryResult.setText (Integer.toBinaryString (d));
	OctalResult.setText (Integer.toOctalString (d));
	HexResult.setText (Integer.toHexString (d));
      }
    if (ae.getSource () == ExitButton)
      {
	System.exit (0);
      }
  }
  public static void main (String args[])
  {
    new conversion();
  }
}
