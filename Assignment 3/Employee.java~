import java.io.*;

class Employee
{
	private int id;
	private String name;
	private String department;
	protected float salary;

	Employee()
	{
			
	}
	Employee(int id,String name,String department,float salary)
	{
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Department : "+department);
		System.out.println("Employee salary : "+salary);	
	}
	float getsalary()
	{
		return this.salary;	
	}
} 

class Manager extends Employee
{
	private float bonus;
	//private float salary;
	
	Manager(int id,String name,String department,float salary,float bonus)
	{
		super(id,name,department,salary);
		this.bonus=bonus;
		
	}
	public void display()
	{
		super.display();
		System.out.println("Bonus : "+bonus);				
		System.out.println("The total salary is : "+(super.getsalary()+bonus));
	}
	float gettotal()
	{
			return (super.getsalary() + bonus);
	}	
}

class MainEmp
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter How many Managers : ");	
	int no = Integer.parseInt(br.readLine());

	Manager[] m = new Manager[no];
		
	for(int i=0;i<no;i++)
	{
		int id=i+1;
		System.out.println("Enter Employee Name : ");
		String n = br.readLine();
		System.out.println("Enter Employee Department : ");
		String d = br.readLine();
		System.out.println("Enter Employee Salary : ");
		float s=0;		
		while(true)
		{
			s = Float.parseFloat(br.readLine());
			if(s>0)
				break;
			else
				System.out.println("Invalid Input!!");
		}
		System.out.println("Enter Bonus : ");
		float b=0;
		while(true)
		{
			b = Float.parseFloat(br.readLine());
			if(b>=0)
				break;
			else
				System.out.println("Invalid Input!!");
		}
		
	m[i] = new Manager(id,n,d,s,b);			
	}
	for(int i=0;i<m.length;i++)
	{
		m[i].display();
	}
	
	System.out.println();
	float max=0;
	
	for(int i=0;i<m.length;i++)
	{
		if(max<=m[i].gettotal())
			{
				max = m[i].gettotal();
				
				System.out.println("Highest salary details-\n");	
				m[i].display();		
			}
	}

		
	    
   }

}
