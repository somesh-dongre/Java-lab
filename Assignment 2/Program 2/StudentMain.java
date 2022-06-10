import java.io.*;
import MScCAI.*;
import MScCAII.*;

class Student
{
	String name;	
	static int roll;
	int r,total=0,caI,caII;
	String grade;
	
	public Student(String name,int caI,int caII)
	{
		this.name=name;
		r=roll;
		roll++;
		this.caI=caI;
		this.caII=caII;
	}	
	public void Grade()
	{
		int total=caI+caII;
		float per=(total*100)/400;
		if(per>70)
			grade="A";
		else if(per>=60)
			grade="B";
		else if(per>=50)
			grade="C";
		else if(per>=40)
			grade="Pass";
		else 
			grade="Fail";
	}
	public String toString()
	{
		return "\nRoll no : " + r + "\n Name : "+name+"\n MSc CA I : "+caI+"\n MSc CA II : "+caII+"\n Grade : "+grade;  
	}
}
class StudentMain
{
	public static void main(String[] args) throws IOException
	{
	int m1,m2,m3,m4,caI,caII;
	
	String name;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter how many student : ");
	int n = Integer.parseInt(br.readLine());

	Student s[]=new Student[n];
	MScCAIMarks ob1[] = new MScCAIMarks[n];
	MScCAIIMarks ob2[] = new MScCAIIMarks[n];
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Roll no : "+Student.roll);
		System.out.println("\n Enter Name : ");
		name = br.readLine();
	
		System.out.println("Enter MSC CA I sem 1 marks : ");
		while(true)
		{
			m1=Integer.parseInt(br.readLine());
			if(m1>=0 && m1<=100)
				break;
			else
				System.out.println("Invalid Marks !!");		
		}
		System.out.println("Enter MSC CA I sem 2 marks : ");
		while(true)
		{
			m2=Integer.parseInt(br.readLine());
			if(m2>=0 && m2<=100)
				break;
			else
				System.out.println("Invalid Marks !!");		
		}
		System.out.println("Enter MSC CA II sem 1 marks : ");
		while(true)
		{
			m3=Integer.parseInt(br.readLine());
			if(m3>=0 && m3<=100)
				break;
			else
				System.out.println("Invalid Marks !!");		
		}
		System.out.println("Enter MSC CA II sem 2 marks : ");
		while(true)
		{
			m4=Integer.parseInt(br.readLine());
			if(m4>=0 && m4<=100)
				break;
			else
				System.out.println("Invalid Marks !!");		
		}
		ob1[i] = new MScCAIMarks(m1,m2);
		caI = ob1[i].total();
		
		ob2[i] = new MScCAIIMarks(m3,m4);
		caII = ob2[i].total();
		
		s[i] = new Student(name,caI,caII);
		s[i].Grade();	
	} 
	for(int i=0;i<n;i++)
	{
		System.out.println(s[i]);
	}	
 }
}
