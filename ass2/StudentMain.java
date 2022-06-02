import MScCAI.*;
import MScCAII.*;
import java.io.*;

class Student
{
	static int rno=1;
	String name;
	int rollNo,MScCAIMarks,MScCAIIMarks,TotalMarks;
	
	Student(){}
	
	Student(String name,int MScCAIMarks,int MScCAIIMarks)
	{
		rollNo=rno;
		rno++;		
		this.name=name;
		this.MScCAIMarks=MScCAIMarks;
		this.MScCAIIMarks=MScCAIIMarks;
	}
	
	String grade;
	String calgrade()
	{
		float per;
		per=(float)(((MScCAIMarks+MScCAIIMarks)*100)/400);
		if(per>=70)
			grade="A";
		else if(per>=60)
			grade="B";
		else if(per>=50)
			grade="C";
		else if(per>=40)
			grade="Pass";
		else
			grade="Fail";
		return grade;
	}
	
	public String toString()
	{
		return ("Roll no="+rollNo+"\tName="+name+"\tMScCAIMarks="+MScCAIMarks+"\tMScCAIIMarks="+MScCAIIMarks+"\tGrade="+grade);
	}
}

class StudentMain
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the count of students: ");
		int n=Integer.parseInt(br.readLine());
		Student s[]=new Student[n];	

		MScCAIMarks mca1=new MScCAIMarks();
		MScCAIIMarks mca2=new MScCAIIMarks();

		int sem1,sem2,ca1marks,ca2marks;
		String name;

		for(int i=0;i<n;i++)
		{
			System.out.println("Roll No="+Student.rno);
			System.out.println("Enter the name of student:");
			name=br.readLine();
			
		
			System.out.println("Enter MScCAIMarks of student:");
			System.out.println("Enter Sem I marks of student:");
			while(true)
			{	
				sem1=Integer.parseInt(br.readLine());
				if(sem1>=0 && sem1<=100)
					break;
				else
					System.out.println("Please enter marks between 0 to 100");
			}
	
			System.out.println("Enter Sem II marks of student:");
			while(true)
			{	
				sem2=Integer.parseInt(br.readLine());
				if(sem2>=0 && sem2<=100)
					break;
				else
					System.out.println("Please enter marks between 0 to 100");
			}
			mca1=new MScCAIMarks(sem1,sem2);
			ca1marks=mca1.TotalMarks(sem1,sem2);

			System.out.println("Enter MScCAIIMarks of student:");
			System.out.println("Enter Sem I marks of student:");
			while(true)
			{	
				sem1=Integer.parseInt(br.readLine());
				if(sem1>=0 && sem1<=100)
					break;
				else
					System.out.println("Please enter marks between 0 to 100");
			}
	
			System.out.println("Enter Sem II marks of student:");
			while(true)
			{	
				sem2=Integer.parseInt(br.readLine());
				if(sem2>=0 && sem2<=100)
					break;
				else
					System.out.println("Please enter marks between 0 to 100");
			}
			mca2=new MScCAIIMarks(sem1,sem2);
			ca2marks=mca2.TotalMarks(sem1,sem2);

			s[i]=new Student(name,ca1marks,ca2marks);
			s[i].calgrade();
		}

		System.out.println("\nResult of students ");
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]+"\n");
		}
	}
}
		
	

