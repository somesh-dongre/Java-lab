import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ExtraQ5 extends JFrame implements ActionListener
//,AdjustmentListener
{
	JScrollBar red1,green1,blue1,red,green,blue;
	int fred1,fblue1,fgreen1,fred,fblue,fgreen ;
	JLabel Welcome;
	JButton Apply,select1,select;
	JPanel colorChange;
	ExtraQ5()
	{
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(5,1));
		p.add(p1);
		
		JLabel l1 = new JLabel("Background");
		p1.add(l1);
		
		 red = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
		p1.add(red);
		
		 green = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
		p1.add(green);
		
		 blue = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
		p1.add(blue);
		
		 select = new JButton("Select");
		p1.add(select);  
		select.addActionListener(this);
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5,1));
		p.add(p2);
		
		JLabel l2 = new JLabel("Foreground");
		p2.add(l2);
		
		 red1 = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
		//red1.addAdjustmentListener(this);
		p2.add(red1);
		
		 green1 = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
		//green1.addAdjustmentListener(this);
		p2.add(green1);
		
		 blue1 = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
		//blue1.addAdjustmentListener(this);
		p2.add(blue1);
		
		select1 = new JButton("Select");
		p2.add(select1); 
		select1.addActionListener(this);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(2,1));
		p.add(p3);
		
		 colorChange= new JPanel();
		Welcome = new JLabel("Welcome",JLabel.CENTER);
		//Welcome.setAlignment();
		//Welcome.setText("Welcome");
		colorChange.add(Welcome);
		
		p3.add(colorChange);
		
		Apply = new JButton("Apply");
		Apply.addActionListener(this);
		p3.add(Apply);
		
		f.add(p);
		f.setSize(600,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//public void adjustmentValueChanged(AdjustmentEvent ae)
	//{
	//	fred = red.getValue();
	//	fgreen = green.getValue();
	//	fblue = blue.getValue();	
	
	//	fred1 = red1.getValue();
		//fgreen1 = green1.getValue();
		//fblue1 = blue1.getValue();	
	
	
	//}	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==select)
		{
				fred = red.getValue();
				fgreen = green.getValue();
				fblue = blue.getValue();
		}
		if(ae.getSource()==select1)
		{
			fred1 = red1.getValue();
			fgreen1 = green1.getValue();
			fblue1 = blue1.getValue();		
		}
		
	
		if(ae.getSource()==Apply)
		{
			System.out.println(fred+" "+fgreen+" "+fblue+" "+fred1+" "+fgreen1+" "+fblue1);
			Welcome.setForeground(new Color(fred1,fgreen1,fblue1));
			colorChange.setBackground(new Color(fred,fgreen,fblue));
		}
	}
	public static void main(String args[])
	{
		new ExtraQ5();
	}	
}
		
