import java.io.*;

abstract class Staff
{
	String name,address;
	Staff() {}
	Staff(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	void Display()
	{
		System.out.println("\nName : "+name+"\nAddress : "+address);
	}
}

class FullTimeStaff extends Staff
{
	String dept;
	float salary;
	FullTimeStaff() {}
	FullTimeStaff(String name, String address, String dept, float salary)
	{
		super(name,address);
		this.dept = dept;
		this.salary = salary;
	}
	void Display()
	{
		super.Display();
		System.out.println("Department : "+dept+"\nSalary : "+salary);
	}	 
}

class PartTimeStaff extends Staff
{
	float NoOfHrs,RatePerHr;
	PartTimeStaff() {}
	PartTimeStaff(String name, String address, float NoOfHrs, float RatePerHr)
	{
		super(name,address);
		this.NoOfHrs = NoOfHrs;
		this.RatePerHr = RatePerHr;
	}
	void Display()
	{
		super.Display();
		System.out.println("No. of hours : "+NoOfHrs+"\nRate Per Hour : "+RatePerHr);
	}
}  

class StaffMain
{
	public static void main(String args[]) throws IOException
 	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int ch;
		do
		{
			System.out.println("\n1.Full Time Staff\n2.Part Time Staff\n3.Exit");
			System.out.print("Enter your choice : ");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: System.out.print("Enter number of staff : ");
					int n = Integer.parseInt(br.readLine());
					FullTimeStaff FTS[] = new FullTimeStaff[n];
					String name,address,dept;
					float salary;
					for(int i=0; i<n; i++)
					{
						System.out.print("\nEnter name : ");
						name = br.readLine();
						System.out.print("Enter address : ");
						address = br.readLine();
						System.out.print("Enter department : ");
						dept = br.readLine();
						System.out.print("Enter salary : ");
						while(true)
						{
							salary = Float.parseFloat(br.readLine());
							if(salary>0)
								break;
							else
								System.out.print("Invalid salary input, please re-enter salary : ");
						}
						FTS[i] = new FullTimeStaff(name,address,dept,salary);
					}
					System.out.println("\nFull Time Staff Details : ");
					for(int i=0; i<n; i++)
					{
						FTS[i].Display();
					}
					break;
				case 2: System.out.print("Enter number of staff : ");
					int n1 = Integer.parseInt(br.readLine());
					PartTimeStaff PTS[] = new PartTimeStaff[n1];
					String name1,address1;
					float NoOfHrs,RatePerHr;
					for(int i=0; i<n1; i++)
					{
						System.out.print("\nEnter name : ");
						name1 = br.readLine();
						System.out.print("Enter address : ");
						address1 = br.readLine();
						System.out.print("Enter No of hrs : ");
						NoOfHrs = Float.parseFloat(br.readLine());
						System.out.print("Enter Rate per hrs : ");
						while(true)
						{
							RatePerHr = Float.parseFloat(br.readLine());
							if(RatePerHr>0)
								break;
							else
								System.out.print("Invalid Rate per hour input, please re-enter : ");
						}
						PTS[i] = new PartTimeStaff(name1,address1,NoOfHrs,RatePerHr);
					}
						System.out.println("\nPart Time Staff Details : ");
					for(int i=0; i<n1; i++)
					{
						PTS[i].Display();
					}
					break;
				case 3: break;
				
				default:System.out.println("Invalid choice");
				
			}
		}while(ch!=3);	
	}
}
