import java.io.*;

class mainVehicle
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,ch;
		System.out.println("Enter How many vehicles : ");
		n = Integer.parseInt(br.readLine());
		Vehicle v[] = new Vehicle[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("1.LMV");
			System.out.println("2.HMV");
			System.out.println("Enter your choice : ");
			
			ch = Integer.parseInt(br.readLine());
			if(ch==1){
				v[i] = new LMV();		
			}else if(ch==2){
				v[i] = new HMV();
			}else{
				System.out.println("Invalid Option !!!");			
			}
			v[i].accept();	
		} 
		System.out.println("All vehicle are as follows : ");
		for(int i=0;i<n;i++)
			v[i].display();
	}
}
