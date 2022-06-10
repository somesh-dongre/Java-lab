package NumOperation;
public class Perfect
{
	public void Perfectno(int num)
	{
		if(num<=0)
			System.out.println("Entered number cannot be perfect number !!");
		else
		{
			int sum=0;
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
				{
					sum=sum+i;			
				}
			}
			if(sum==num)
			{
				System.out.println("Entered number is perfect number !!");
						
			}
			else
			{
				System.out.println("Entered number is not perfect number !!");
	
			}		
		}	
	}	
			

}
