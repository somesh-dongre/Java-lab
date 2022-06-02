package NumOperation;
public class Perfect
{
	int sum=0;	
	public void perfect(int n)
	{
		int temp=n;
		if(n==0)
			System.out.println(n+" is not perfect");
		else if(n>0)
		{
			for(int i=1;i<=n/2;i++)
			{
				if(n%i==0)
					sum=sum+i;
			}
			if(sum==temp)
				System.out.println(n+" is perfect");
			else
				System.out.println(n+" is not perfect");
		}
		else
			System.out.println(n+" is neagtive, cannot be perfect");				
	}
}
		

		
