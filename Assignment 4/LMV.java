import java.io.*;

class LMV extends Vehicle
{
	private float mileage;
	
	public void accept() throws IOException
	{
		super.accept();	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println(" Enter Milage : ");
		while(true)
		{
			mileage = Float.parseFloat(br.readLine());		
			if(mileage > 0)
				break;
			else
				System.out.println("Invalid mileage !!");	
				System.out.println(" Enter Valid Milage : ");		
		}
	}

public void display()
	{
		super.display();
		System.out.println("Milage is : "+mileage);

	}

}
	
