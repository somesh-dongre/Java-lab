
//import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class student {
    int stud_no;
    String stud_name;
    float percentage;
   
	student(){}
	
	student(int stud_cnt,String stud_name,float percentage){
		
		this.stud_no=stud_cnt;
		this.stud_name= stud_name;
		this.percentage= percentage;
	}

	public String[] getArr(){
		String sarr[]={String.valueOf(stud_no),stud_name,String.valueOf(percentage)};
		return sarr;
	}
}
public class MeritList extends JFrame implements ActionListener{
    JFrame f ;
	JLabel l1,errorMsg,count_input, rollNo_input,name_input,percent_input,invalid_input;
	JTextField input_n,name_ip,percent_ip;
	JButton ok,submit;
	student st[];
	int N;
	 static int stud_cnt=0;
	 JPanel jp;
	
MeritList(){

        f= new JFrame("MeritList.");
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
        
		l1=new JLabel("Enter No of Students info you want to store:");
		input_n= new JTextField(10);
		ok= new JButton("OK");
		errorMsg=new JLabel();
	   
        f.add(l1);
		f.add(input_n);
		f.add(ok);
		f.add(errorMsg);
		
		ok.addActionListener(this);
		
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	
	//JLabel l1,errorMsg,count_input, rollNo_input,name_input,percent_input,invalid_input;
	//JTextField input_n,name_ip,percent_ip;
	//JButton ok,submit;

	public void getInput(){
		
		jp= new JPanel();
		
		count_input= new JLabel("enter "+N+" values");
		rollNo_input= new JLabel("");
		name_input= new JLabel("Enter Student Name  :");
		percent_input= new JLabel("Enter Percentage : ");
		invalid_input= new JLabel(); 
		
		name_ip= new JTextField(15);
		percent_ip= new JTextField(15);
		
		submit= new JButton("Submit");
		
	rollNo_input.setText("Roll No Assigned: "+(stud_cnt+1));

		jp.add(count_input);
		
		jp.add(rollNo_input);
		jp.add(name_input);
		
		jp.add(name_ip);
		jp.add(percent_input);
		
		jp.add(percent_ip);
		jp.add(invalid_input);
		jp.add(submit);
		
		submit.addActionListener(this);
		
		f.add(jp);
		f.setVisible(true);		
	
	}
	public void actionPerformed(ActionEvent ae){

		errorMsg.setText("");
		if(ae.getSource()==ok){
			try{
				N=Integer.parseInt(input_n.getText());
				
				if(N>0){
						st= new student[N];
					errorMsg.setText("Now Enter Information of "+N+" students:");
					input_n.setVisible(false);
					l1.setVisible(false);
					ok.setVisible(false);
					getInput();
				}
				else{
					//input invalid
					input_n.setText("");
					errorMsg.setText("Invalid Previous Input.");
				}
			
			}
			catch(Exception e){
						//input invalid
					input_n.setText("");
					errorMsg.setText("Invalid Previous Input.");
			}
			
			
		}
		else if(ae.getSource()==submit){
			String nm;
			float per;
			try{
			nm = name_ip.getText();
			per= Float.parseFloat(percent_ip.getText());
			
			invalid_input.setText("");

			if(per>=0.0 && per<=100.0){
				invalid_input.setText("Previous Student Info Saved.");
				st[stud_cnt]= new student(stud_cnt+1,nm,per);
				
				name_ip.setText("");
				percent_ip.setText("");
				//rollNo_input.setText("");
				rollNo_input.setText("Roll No Assigned: "+(stud_cnt+1));
				stud_cnt++;
				
				if(stud_cnt==N){
					//table format merit list
					invalid_input.setText("All info saved.");
					jp.setVisible(false);
					
					showMeritList();
				}
			}
			else{
				invalid_input.setText("Invalid Input");
				
			}
			}
			catch(Exception e){
					invalid_input.setText("Invalid Input error");
			}
		}
		
	}
	
	public void showMeritList(){
		String column[]={"RollNo","Name","Percentage"};
		String data[][]= new String[N][3];
	
		for(int i=0;i<N;i++){
			for(int j=0;j<N-i-1;j++)
			{	
				if(st[j].percentage<st[j+1].percentage){
					student temp= st[j];
					st[j]=st[j+1];
					st[j+1]=temp;
					
				}
			}
		}	

			System.out.println("Hello World");
			for(int i=0;i<N;i++){
				for(int j=0;j<3;j++){
					data[i][j]=st[i].getArr()[j];
				}
			}
			JTable jt= new JTable(data,column);
			//JPanel sp= new JPanel();
			JScrollPane sp= new JScrollPane(jt);
//			sp.add(jt);
			f.add(sp);
			f.setVisible(true);
			
		}
		
	
	public static void main(String []args){
		
		new MeritList();
	}
}