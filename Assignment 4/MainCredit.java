import java.io.*;

class MainCredit
{
	public static void main(String args[]) throws IOException
	{
		int ch,cch;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	
	do
	   {		
		System.out.println("1 : Silver Card ");		
		
		System.out.println("2 : Gold card ");
		
		System.out.println("0 : EXIT ");
				

		System.out.println("Enter Card choice : ");
		cch = Integer.parseInt(br.readLine());
	switch(cch)
	{
		case 1:	
			SilverCard s = new SilverCard();
			s.accept();

			do
			{
				System.out.println("1 : Use Silver Card");
				System.out.println("2 : Pay Credit for Silver Card");
				System.out.println("0 : EXIT ");	

				System.out.println("Enter your choice : ");
				ch = Integer.parseInt(br.readLine());
				switch(ch)
				{
					case 1:
						s.useCard();
						break;

					case 2:
						s.payCredit();
						break;
				
					case 0: 
						break;
					default:
						System.out.println("\nInvalid Option !!\n");
				}
			}while(ch!=0);
			break;		
		case 2:
			GoldCard g = new GoldCard();
			g.accept();
			do
			{
				System.out.println("1 : Use Gold Card");
				System.out.println("2 : Pay Credit for Gold Card");
				System.out.println("3 : Increase Limit for Gold");
				System.out.println("0 : EXIT ");	

				System.out.println("Enter your choice : ");
				ch = Integer.parseInt(br.readLine());
				switch(ch)
				{
					case 1:
						g.useCard();
						break;

					case 2:
						g.payCredit();
						break;

					case 3:
						g.inlimit();
						break;
				
					case 0: 
						break;
					default:
						System.out.println("\nInvalid Option !!\n");
				}
			}while(ch!=0);
			break;			
		case 0:
			break;
		default:
				System.out.println("\nInvalid Option !!\n");

	}
	}while(cch!=0);
	}
}
