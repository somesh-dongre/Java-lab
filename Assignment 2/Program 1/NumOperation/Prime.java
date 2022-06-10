package NumOperation;

public class Prime
{
	public void Primeno(int no)
	{
		int i,flag=0;
		if(no==0 || no==1)
		{
			System.out.println("\n The number "+no+" is not Prime number !!");
		}	
		else
		{
			for(i=2;i<=no/2;i++)
			{
				if(no%i==0)
				{
					System.out.println("\n The number "+no+" is not Prime number !!");
					flag=1;
					break;
				}	
			}
		}
		if(flag==0)
		{
			System.out.println("\n The number "+no+" is a Prime number !!");
				
		}	
	}
}
