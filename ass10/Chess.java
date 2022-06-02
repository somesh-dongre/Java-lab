import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Program2 extends JFrame implements ActionListener 
{
	JLabel boxes[]=new JLabel[16];
	JButton btnUp,btnDown,btnLeft,btnRight;
	int currentPos =13;
	
	Color black=Color.BLACK;
	Color white=Color.WHITE;
	Color temp;

	Program2()
	{
		setSize(650,650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		setLayout(new GridLayout(5,4)); 

		for(int i=1;i<=16;i++)
		{
			boxes[i-1]=new JLabel();
			if(i%2==0)
			{
				boxes[i-1].setBackground(black);
				boxes[i-1].setOpaque(true);
			}
			else
			{
				boxes[i-1].setBackground(white);
				boxes[i-1].setOpaque(true);
			}
			if(i%4==0)
			{
				temp=black;
				black=white;
				white=temp;
			}
			add(boxes[i-1]);
		}
		btnUp=new JButton("Up");
		btnDown=new JButton("Down");
		btnLeft=new JButton("Left");
		btnRight=new JButton("Right");

		add(btnUp);
		add(btnDown);
		add(btnLeft);
		add(btnRight);

		btnUp.addActionListener(this);
		btnDown.addActionListener(this);
		btnLeft.addActionListener(this);
		btnRight.addActionListener(this);

		changePos();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnUp)
		{
			if((currentPos-4)>=0)
			{
				boxes[currentPos].setText("");
				currentPos -=4;
				changePos();
			}
			else
			{
				JOptionPane.showMessageDialog(btnUp,"Up Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		else if(ae.getSource()==btnDown)
		{
			if((currentPos+4)<16)
			{
				boxes[currentPos].setText("");
				currentPos +=4;
				changePos();
			}
			else
			{
				JOptionPane.showMessageDialog(btnDown,"Down Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(ae.getSource()==btnLeft)
		{
			if((currentPos-1)>=0)
			{
				boxes[currentPos].setText("");
				currentPos -=1;
				if((currentPos)==3||(currentPos)==7||(currentPos)==11)
				{
					currentPos +=1;
					changePos();
					JOptionPane.showMessageDialog(btnLeft,"Left Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					changePos();	
				}
			}
			else
			{
				changePos();
				JOptionPane.showMessageDialog(btnLeft,"Left Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
			}
		}
		else
		{
			if((currentPos+1)<16)
			{
				boxes[currentPos].setText("");
				currentPos +=1;
				if((currentPos)==4||(currentPos)==8||(currentPos)==12)
				{
					currentPos -=1;
					changePos();
					JOptionPane.showMessageDialog(btnRight,"Right Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					changePos();	
				}
			}
			else
			{
				changePos();
				JOptionPane.showMessageDialog(btnRight,"Right Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	void changePos()
	{
		boxes[currentPos].setText("*");
		boxes[currentPos].setFont(new Font("Curier",Font.BOLD,25));
		boxes[currentPos].setHorizontalAlignment(JLabel.CENTER);
	
		if(boxes[currentPos].getBackground()==Color.BLACK)
		{
			boxes[currentPos].setForeground(Color.WHITE);
		}
	}
}
public class Chess
{
	public static void main(String args[])
	{
		new Program2();
	}
}

























