import java.io.*;
class Student
{
	static int roll=1;
	String name;
	float per;
	int rno;

	Student()
	{
	}
	
	Student(String name,float per)
	{
		rno=roll;
		roll++;		
		this.name=name;
		this.per=per;
	}

	static void sortStudent(Student stud[])
	{
		Student temp=new Student();
		for(int i=0;i<stud.length;i++)
		{
			for(int j=0;j<stud.length-i-1;j++)
			{		
				if(stud[j].per<stud[j+1].per)
				{
					temp=stud[j];
					stud[j]=stud[j+1];
					stud[j+1]=temp;
				}
			}
		}	
	}

	public String toString()
	{
		return ("Roll no="+rno+"\tName="+name+"\tPercentage="+per);
	}
	
}
class Studentdemo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		float per;

		System.out.println("Enter the count of students: ");
		int n=Integer.parseInt(br.readLine());
		Student s[]=new Student[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Roll No="+Student.roll);
			System.out.println("Enter the name of student:");
			name=br.readLine();
			
			System.out.println("Enter percentage of student:");
			while(true)
			{	
				per=Float.parseFloat(br.readLine());
				if(per>0)
					break;
				else
					System.out.println("Percentage cannot be negative!!Re-enter");
			}
			
			s[i]=new Student(name,per);
		}
	
		System.out.println("\n...Before Sorting...");
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
		
		Student.sortStudent(s);
		System.out.println("\n...After Sorting...");
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}
		
		
			
				
		
