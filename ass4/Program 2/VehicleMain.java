import java.io.*; 

class Vehicle
{
	String company;
	double price;
	Vehicle(String company, double price)
	{
		this.company = company;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("\nCompany : "+company);
		System.out.println("Price : "+price);
	}
}

class LightMotorVehicle extends Vehicle
{
	double mileage;
	LightMotorVehicle(double mileage,String company,double price)
	{
		super(company,price);
		this.mileage=mileage;
	}
	
	void display()
	{
		super.display();
		System.out.println("Mileage : "+mileage);
	}
}



class HeavyMotorVehicle extends Vehicle
{
	double capacity;
	
	HeavyMotorVehicle(double capacity,String company,double price)	
	{
		super(company,price);
		this.capacity=capacity;
	}
	
	void display()
	{
		super.display();
		System.out.println("Capacity : "+capacity);
	}
}


class VehicleMain
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String company;
		double price;
		int ch;
		
		do
		{
			System.out.println("\nMenu\n1.Light Motor vehicle\n2.Heavy Motor vehicle\n3.Exit");
			System.out.print("Enter your choice : ");
			ch = Integer.parseInt(br.readLine());
		
			switch(ch)
			{
				case 1: double mileage;
					System.out.print("Enter number of light motor vehicle : ");
					int n = Integer.parseInt(br.readLine());
					LightMotorVehicle lmv[] = new LightMotorVehicle[n];
					
					for(int i=0;i<n;i++)
					{
						System.out.print("Enter company name : ");
						company =br.readLine();
						System.out.print("Enter price : ");
						while(true)
						{
							price = Integer.parseInt(br.readLine());
							if(price<=0)
								System.out.print("Invalid price please re-enter price : ");
							else
								break;							
							
						}
						System.out.print("Enter mileage : ");
						while(true)
						{
							mileage = Double.parseDouble(br.readLine());
							if(mileage<=0)
								System.out.print("Invalid mileage please re-enter mileage : ");
							else
								break;							
							
						}
					
						lmv[i] = new LightMotorVehicle(mileage, company, price);
					}	
					System.out.println("\nLight Motor vehicle details : ");
					for(int i=0;i<n;i++)
					{
						lmv[i].display();
					}
					break;
		
				case 2: double capacity;
					System.out.print("Enter number of heavy motor vehicle : ");
					int n1= Integer.parseInt(br.readLine());
					HeavyMotorVehicle hmv[] = new HeavyMotorVehicle[n1];
					
					for(int i=0;i<n1;i++)
					{
						System.out.print("Enter company name : ");
						company =br.readLine();
						System.out.print("Enter price : ");
						while(true)
						{
							price = Integer.parseInt(br.readLine());
							if(price<=0)
								System.out.print("Invalid price please re-enter price : ");
							else
								break;							
							
						}
					
						System.out.print("Enter capacity in tons : ");
						while(true)
						{
							capacity =Double.parseDouble(br.readLine());
							if(capacity<=0)
								System.out.print("Invalid capacity please re-enter capacity : ");
							else
								break;							
		
						}					
						hmv[i] = new HeavyMotorVehicle(capacity, company, price);
					}	
					System.out.println("\nHeavy Motor vehicle details : ");
					for(int i=0;i<n1;i++)
					{
						hmv[i].display();
					}	
					break;

			
				case 3: break;
			
				default: System.out.println("Invalid choice ");
			}
	
		}while(ch!=3);
		
	}

}
