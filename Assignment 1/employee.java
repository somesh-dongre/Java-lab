import java.io.*;
class Employee
{
  String name;
  String position;
  double salary;
  static int cnt=0;

    Employee ()
  {
    this.name = null;
    this.position = null;
    this.salary = 0;
  }
  Employee (String n, String p, double s)
  {
    name = n;
    position = p;
    salary = s;
    count();
  }
  static void count()
  {
	cnt++;
	System.out.println("\n objects "+cnt+" created");
  }
  public String toString ()
  {
    return "Employee name : "+ name + " , Position : " + position + " , Salary : " + salary;
  }
}

class mainEmp
{
  public static void main (String args[]) throws IOException
  {

          	
    InputStreamReader in = new InputStreamReader(System.in);
 
    BufferedReader br = new BufferedReader(in);
	
    String name,position;
    double salary;  
    System.out.println("Enter how many employees : ");	
    int no = Integer.parseInt(br.readLine()); 

    Employee[] e = new Employee[no];
    System.out.println ("Enter Employee Details :");
	for(int i=0;i<no;i++)
	{
	
	
    System.out.println("Enter name of employee : ");	
    name = br.readLine();

    System.out.println("Enter Position : ");
    position = br.readLine();

    System.out.println("Enter Salary : ");
    while(true)
	{
    		salary = Double.parseDouble(br.readLine());
		if(salary>0)
			break;
		else
			System.out.println("\n Invalid Input !!");
	}
	e[i] = new Employee(name,position,salary);
	} 
	for(int i=0;i<no;i++)
	{
       		System.out.println (""+e[i]);
        }
  }
}
