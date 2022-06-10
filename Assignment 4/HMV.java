import java.io.*;

class HMV extends Vehicle
{
	private float capacity;
	
	public void accept() throws IOException
	{
		super.accept();	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println(" Enter Capacity : ");

		while(true)
		{
			capacity = Float.parseFloat(br.readLine());		
			if(capacity > 0)
				break;
			else
				System.out.println("Invalid capacity !!");	
				System.out.println(" Enter Valid capacity : ");		
		}		

	}

public void display()
	{
		super.display();
		System.out.println("Capacity is : "+capacity);

	}

}
	
