package NumOperation;
public class Armstrong
{
	public void armstrong(int num)
	{
		int sum=0;
		int temp=num;
		int order=0;
	
		if(num>=0)
		{
			while(temp>0)
			{
				temp=temp/10;
				order++;
			}
			temp=num;
			while(temp>0)
			{
				int mul=1;
				int digit=temp%10;
				for(int i=0;i<order;i++)
					mul=digit*mul;
				sum=sum+mul;
				temp=temp/10;
			}
			if(num==sum)
				System.out.println(num+" is armstrong");
			else
				System.out.println(num+" is not armstrong");
		}
		else
			System.out.println(num+" is negative, cannot be armstrong");
	}
}
