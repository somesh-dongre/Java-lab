import java.io.*;

class Employee
{
	private int id;
	private String name;
	private String dept;
	protected double salary;
	static int  eid = 1;
	
	Employee() {}
	
	Employee(String name, String dept, double salary)
	{
		id = eid;
		eid++;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
		
	void display()
	{
		System.out.println("\nEmployee Id : "+id+"\nEmployee Name : "+name+"\nEmployee Department : "+dept+"\nEmployee Salary : "+salary);
	}
}

class Manager extends Employee
{
	private double bonus = 0.3;
	Manager() {}
	
	Manager(String name, String dept, double salary)
	{
		super(name,dept,salary);
	}
	
	void sort(Manager M[])
	{
		Manager temp;
		for(int i=0; i<M.length; i++)
		{
			for(int j=0; j<M.length-i-1; j++)
			{
				if(M[j].salary<M[j+1].salary)
				{
					temp = M[j];
					M[j] = M[j+1];
					M[j+1] = temp;
				}
			}
		}
	}

	void display()
	{
		super.display();
		System.out.println("Salary with Bonus: "+(super.salary+super.salary*bonus));
	}
}
 
class EmployeeMain
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of Managers : ");
		int n = Integer.parseInt(br.readLine());
		String name,dept;
		double salary;
		Manager M[] = new Manager[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("\nEmployee ID : "+Employee.eid);
			System.out.print("Enter name of the Employee : ");
			name = br.readLine();
			System.out.print("Enter name of the Department : ");
			dept = br.readLine();
			System.out.print("Enter salary of the Employee : ");
			while(true)
			{
				salary = Double.parseDouble(br.readLine());
				if(salary>0)
					break;
				else
					System.out.print("Invalid salary input, please re-enter salary :  ");
			}			
			M[i] = new Manager(name,dept,salary);
		}
		Manager m=new Manager();
		m.sort(M);
		
		Manager max = M[0];
		System.out.println("\nManagers with maximum salary : ");
		for(int i=0; i<n; i++)
		{
			if(M[i].salary==max.salary)
				M[i].display();
			else 
				break;
		}
	}
}
			 
