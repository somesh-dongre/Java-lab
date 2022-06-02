import java.io.*;
class Employee
{
	String name,position;
	float salary;
	static int count;
	
	Employee()
	{
	}
	
	Employee(String name,String position,float salary)
	{
		this.name=name;
		this.position=position;
		this.salary=salary;
		count++;
	}
	
	public String toString()
	{
		return ("Employee name="+name+"\nEmployee position="+position+"\nEmployee salary="+salary);	
	}
}

class Employeedemo
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		float sal;
		System.out.println("Enter no. of employees:");
		int n=Integer.parseInt(br.readLine());
		Employee emp[]=new Employee[n];		

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee name:");			
			String nm=br.readLine();
			System.out.println("Enter Employee position:");
			String pos=br.readLine();
			while(true)
			{
				System.out.println("Enter Employee salary:");
				sal=Float.parseFloat(br.readLine()); 	
				if(sal>0)
					break;
				else
					System.out.println("Re-enter");
			}
			emp[i]=new Employee(nm,pos,sal);
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println("\nDetails of employee"+(i+1));
			System.out.println(emp[i]);
		}
		System.out.println("\nObject count= "+Employee.count);
	}
}
