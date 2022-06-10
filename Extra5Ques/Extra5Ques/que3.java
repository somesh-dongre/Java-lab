import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class que3 extends JFrame implements ActionListener{
	JLabel inputMsg, ErrorMsg;
	int num[];
	
	JTextField input;
	JButton ok;
		JProgressBar []jp;
		JFrame frm;
		
	que3(){
		num = new int[5];
		
		createUIForInput();
		
	}

	private void createUIForInput() {
		frm= new JFrame("Question3");
		frm.setTitle("progress bar");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		
//		JDialog.setDefaultLookAndFeelDecorated(true);
		
		
		input= new JTextField(10); 
		inputMsg= new JLabel("Enter a number between 1 to 5 and press Enter(enter -1 to stop )");
		ok=new JButton("OK");
		ErrorMsg= new JLabel();
		
		//d1 = new JDialog(this,"Enter number",true);

		//d1.setSize(300,300);
		
	//	d1.setLayout(new FlowLayout());
		frm.add(inputMsg);
		frm.add(input);
		frm.add(ErrorMsg);
		frm.add(ok);
		ok.addActionListener(this);


		frm.setSize(800,300);
	
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		//String ip;
		int ip;
		
		if(ae.getSource()== ok){
			ErrorMsg.setText("");
			try{
				ip= Integer.parseInt(input.getText());
					
					if(ip>=1 && ip<=5){
						num[ip-1]++;
						input.setText("");
					}else if(ip == -1){
						input.setEnabled(false);
						ok.setEnabled(false);
						inputMsg.setText("Cannot furthur input values.");
						showCount();
						
					}else{
						//invalid input
						ErrorMsg.setText("Invalid Previous input.");
						input.setText("");
					}
			}
			catch(Exception e){
				//later invalid input'	//invalid input
						ErrorMsg.setText("Invalid Previous input.");
						input.setText("");
			}
			
		}
	}
	private void showCount(){
		JPanel p= new JPanel();
		jp= new JProgressBar[5];
		for(int i=0;i<5;i++)
		{	jp[i]=new JProgressBar();
				jp[i].setString("Count Of "+(i+1)+":"+num[i]);
			//jp[i].setBounds(40,40,160,30);   
			jp[i].setValue(num[i]);
			jp[i].setStringPainted(true);    
			p.add(jp[i]);
			//jp[i].setVisible(true);
		}
		frm.add(p);
		frm.setVisible(true);
	}
		
	
	public static void main(String[] args){
		
		new que3();
	}
}