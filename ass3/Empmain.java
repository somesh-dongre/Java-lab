import java.io.*;
class Employee
{
	private static int eid=1;
	private int id;
	private String name,dept;
	protected double salary;
	
	Employee(){
	}

	Employee(String name,String dept,double salary)
	{
		id=eid;
		eid++;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}

	void display()
	{
		System.out.println("ID="+id);
		System.out.println("Name="+name);
		System.out.println("Department="+dept);
		System.out.println("Salary="+salary);	
	}

}

class Manager extends Employee
{
	private double bonus;

	Manager()
	{	
	}

	Manager(String name,String dept,double salary,double bonus)
	{
		super(name,dept,salary);
		this.bonus=bonus;
	}
	
	void display()
	{
		super.display();
		System.out.println("Bonus="+bonus);
		
	}

	double computesal()
	{
		return bonus + super.salary;
	}	

}

class Empmain
{
	public static void main(String args[]) throws IOException
	{
		double salary;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the no. of employees: ");
		int n=Integer.parseInt(br.readLine());
		
		Manager ob[]=new Manager[n];
		double sal[]=new double[n];

		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter name:");
			String name=br.readLine();
		
			System.out.print("\nEnter Department:");
			String dept=br.readLine();

			System.out.print("\nEnter Salary:");
			while(true)
			{	
				salary=Double.parseDouble(br.readLine());
				if(salary>0)
					break;
				else
					System.out.println("Salary cannot be zero and negative!! Re-enter");
			}
			double bonus=salary*0.5;
			ob[i]=new Manager(name,dept,salary,bonus);
			sal[i]=ob[i].computesal();
		}

		System.out.println("\n\n------------Details of Employees---------");
		for(int i=0;i<n;i++)
		{
			ob[i].display();
			System.out.println("Total salary is : "+ob[i].computesal());
		}

		double max=sal[0];		
		for(int i=0;i<n;i++)
		{
			if(sal[i]>max)
				max=sal[i];
		}
		
		System.out.println("\nEmployees having maximum salary:");
		for(int i=0;i<n;i++)
		{
			if(ob[i].computesal()==max)
			{	
				ob[i].display();
				System.out.println("Total salary : "+ob[i].computesal());
			}
		}
	}
}			


				
				

			
	
	
