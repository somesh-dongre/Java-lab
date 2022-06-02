import java.io.*;

abstract class Staff
{
	String name,address;
}
	
class FullTimeStaff extends Staff
{
	String dept;
	double salary;

	
	
	FullTimeStaff(String name,String address,String dept,double salary)
	{

		this.name=name;
		this.address=address;
		this.dept=dept;
		this.salary=salary;
	}

	void display()
	{
		System.out.println("\nName= "+name);
		System.out.println("Address= "+address);	
		System.out.println("Department= "+dept);
		System.out.println("Salary= "+salary);	
	}
}

class PartTimeStaff extends Staff
{
	int hours;
	double rate;
	

	PartTimeStaff(String name,String address,int hours,double rate)
	{

		this.name=name;
		this.address=address;
		this.hours=hours;
		this.rate=rate;
	}

	void display()
	{
	
		System.out.println("\nName= "+name);
		System.out.println("Address= "+address);	
		System.out.println("Number of hours working= "+hours);
		System.out.println("Rate per hour= "+rate);	
	}	
}

class StaffMain
{
	public static void main(String args[]) throws IOException
	{
		int ch,hours;
		double salary,rate;
		System.out.println("Select any one:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("\n1.Full Time Staff");
			System.out.println("2.Part Time Staff");
			System.out.println("3.Exit");
			System.out.print("\nEnter your choice:");
			ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1: System.out.println("Enter the number of Full Time Staff:");
					int n=Integer.parseInt(br.readLine());
					FullTimeStaff f[]=new FullTimeStaff[n];
					for(int i=0;i<n;i++)
					{
						
						System.out.print("\nEnter name:");
						String name=br.readLine();

						System.out.print("\nEnter Address:");
						String address=br.readLine();
			
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
						f[i]=new FullTimeStaff(name,address,dept,salary);
					}
					for(int i=0;i<n;i++)
					{
						f[i].display();
					}
					break;

				case 2: System.out.println("Enter the number of Part Time Staff:");
					int m=Integer.parseInt(br.readLine());
					PartTimeStaff p[]=new PartTimeStaff[m];
					for(int i=0;i<m;i++)
					{
						System.out.print("\nEnter name:");
						String name=br.readLine();

						System.out.print("\nEnter Address:");
						String address=br.readLine();

						System.out.print("\nEnter number of hours:");
						while(true)
						{	
							hours=Integer.parseInt(br.readLine());
							if(hours>0)
								break;
							else
								System.out.println("working hours cannot be zero or negative!! Re-enter");
						}

						System.out.print("\nEnter the rate per hour:");
						while(true)
						{	
							rate=Double.parseDouble(br.readLine());
							if(rate>0)
								break;
							else
								System.out.println("Rate cannot be zero and negative!! Re-enter");
						}
						p[i]=new PartTimeStaff(name,address,hours,rate);
					}
					for(int i=0;i<m;i++)
					{
						p[i].display();
					}
					break; 

				case 3: System.out.println("Program Exit");
					break;
						
				default:System.out.println("Invalid choice");
					
			}
		}while(ch!=3);
	}
}

				
		
