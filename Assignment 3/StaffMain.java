import java.io.*;	

abstract class Staff
{
	String name,address;

}

class FullTimeStaff extends Staff
{
	String department;
	double salary;
	
	public void accept() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name : ");
		name = br.readLine();

		System.out.println("Enter department : ");
		department = br.readLine();

		System.out.println("Enter address : ");
		address = br.readLine();		

		System.out.println("Enter salary : ");
		while(true)
		{
			salary = Double.parseDouble(br.readLine());
			if(salary>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}	
	}
	public void display()
	{
		System.out.println("\nEmployee name : "+name);
		System.out.println("Employee department : "+department);
		System.out.println("Employee address : "+address);
		System.out.println("Employee salary : "+salary);
	
	}
}

class PartTimeStaff extends Staff
{
	int hours,rate;
	
	public void accept() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name : ");
		name = br.readLine();

		System.out.println("Enter address : ");
		address = br.readLine();		

		System.out.println("Enter the no of hours : ");
		while(true)
		{
			hours = Integer.parseInt(br.readLine());
			if(hours>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}
		System.out.println("Enter the rate per hour : ");
		while(true)
		{
			rate = Integer.parseInt(br.readLine());
			if(rate>0)
				break;
			else
				System.out.println("Invalid Input !!!");
		}	
	}
	public void display()
	{
		System.out.println("Employee name : "+name);
		System.out.println("Employee address : "+address);
		System.out.println("No of working hours : "+hours);
		System.out.println("Rate per hour : "+rate);	
	}
}

public class StaffMain
{
	public static void main(String args[]) throws IOException
	{
		int i,ch;	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	do
	  {		
		System.out.println("Select option : ");
		System.out.println("1 : Full Time Staff ");
		System.out.println("2 : Part Time Staff ");	
		System.out.println("3 : EXIT");
	        ch = Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
				System.out.println("Enter number of Full Time Staff : ");
				int n = Integer.parseInt(br.readLine());
				FullTimeStaff[] f = new FullTimeStaff[n];
				for(i=0;i<n;i++)
				{
					f[i]=new FullTimeStaff();
					f[i].accept();
				}
				for(i=0;i<n;i++)
				{
					f[i].display();
				}
				break;

			case 2:
				System.out.println("Enter number of Part Time Staff : ");
				int m = Integer.parseInt(br.readLine());
				PartTimeStaff[] p = new PartTimeStaff[m];
				for(i=0;i<m;i++)
				{
					p[i]=new PartTimeStaff();
					p[i].accept();
				}
				for(i=0;i<m;i++)
				{
					p[i].display();
				}
				break;
			case 3:
				break;	
		}		
	}while(ch!=3);

		
	}

}
