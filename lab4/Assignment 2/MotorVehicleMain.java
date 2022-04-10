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
		System.out.println("\nCompany : "+company+"\nPrice : "+price);
	}
}
class LightMotorVehicle extends Vehicle
{
	double mileage;
	LightMotorVehicle(String company, double price, double mileage)
	{
		super(company, price);
		this.mileage = mileage;
	}
	void display()
	{
		super.display();
		System.out.println("Mileage : "+mileage);
	}
}
class HeavyMotorVehicle extends Vehicle
{
	double capacity_in_tons;
	HeavyMotorVehicle(String company, double price, double capacity_in_tons)
	{
		super(company, price);
		this.capacity_in_tons = capacity_in_tons;
	}
	void display()
	{
		super.display();
		System.out.println("Capacity_in_tons : "+capacity_in_tons);
	}
}
class MotorVehicleMain
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch,n;
		String company;
		double price;
		do
		{
			System.out.println("\n1.Light Motor Vehicle\n2.Heavy Motor Vehicle\n3.Exit");
			System.out.print("Enter your choice : ");		
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: System.out.print("\nEnter number of Light Motor Vehicle : ");
					n = Integer.parseInt(br.readLine());
					double mileage;
					LightMotorVehicle lmv[] = new LightMotorVehicle[n];
					for(int i=0; i<n; i++)
					{
						System.out.print("\nEnter company : ");
						company = br.readLine();
						System.out.print("Enter price : ");
						while(true)
						{
							price = Double.parseDouble(br.readLine());
							if(price>0)
								break;
							else
								System.out.print("Invalid price, please re-enter price : ");
						}
						System.out.print("Enter mileage : ");
						while(true)
						{
							mileage = Double.parseDouble(br.readLine());
							if(mileage>0)
								break;
							else
								System.out.print("Invalid mileage, please re-enter mileage : ");
						}
						lmv[i] = new LightMotorVehicle(company, price, mileage);
					}
					System.out.println("\nLight Motor Vehicle Details : ");
					for(int i=0; i<n; i++)
					{
						lmv[i].display();
					}
				case 2: System.out.print("\nEnter number of Heavy Motor Vehicle : ");
					n = Integer.parseInt(br.readLine());
					double capacity_in_tons;
					HeavyMotorVehicle hmv[] = new HeavyMotorVehicle[n];
					for(int i=0; i<n; i++)
					{
						System.out.print("\nEnter company : ");
						company = br.readLine();
						System.out.print("Enter price : ");
						while(true)
						{
							price = Double.parseDouble(br.readLine());
							if(price>0)
								break;
							else
								System.out.print("Invalid price, please re-enter price : ");
						}
						System.out.print("Enter capacity_in_tons : ");
						while(true)
						{
							capacity_in_tons = Double.parseDouble(br.readLine());
							if(capacity_in_tons>0)
								break;
							else
								System.out.print("Invalid capacity_in_tons, please re-enter capacity_in_tons : ");
						}
						hmv[i] = new HeavyMotorVehicle(company, price, capacity_in_tons);
					}
					System.out.println("\nHeavy Motor Vehicle Details : ");
					for(int i=0; i<n; i++)
					{
						hmv[i].display();
					}
				case 3: break;
				default:System.out.println("Invalid choice");
			}
		}while(ch!=3);
	}
}


