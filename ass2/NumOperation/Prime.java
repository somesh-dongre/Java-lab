package NumOperation;
public class Prime
{
		
	public void prime(int n)
	{
		int flag=0;	
		if(n<0)
			n=-n;
		
		if(n==0||n==1)
		{
			System.out.println(n+" is not prime no.");
			flag=1;
		}
		else
		{
			for(int i=2;i<(n/2);i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime no.");
					flag=1;
					break;
				}				
				
					
			}
		}
		if(flag==0)
			System.out.println(n+"is prime no.");
	}	
}				

