import java.io.*;

class Vehicle
{
	private String company;
	private float price;
	
	public void accept() throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println(" Enter Companay Name : ");
		company = br.readLine();
		System.out.println("Enter price : ");

		while(true)
		{
			price = Float.parseFloat(br.readLine());		
			if(price > 0)
				break;
			else
				System.out.println("Invalid price !!");	
				System.out.println(" Enter Valid price : ");		
		}		

	}

public void display()
	{
		System.out.println("\nCompanay Name : "+company);
		System.out.println("price : "+price);
	}

}
	
