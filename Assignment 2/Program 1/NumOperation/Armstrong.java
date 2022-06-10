package NumOperation;
public class Armstrong
{
	public void Armstrongno(int no)
	{
		int sum=0;	
		int temp=no;
		int count=0;
		if(no>0)	
		{
			while(temp>0)
			{
				temp=temp/10;
				count++;
			
			}
			temp=no;
			while(temp>0)
			{
				int mul=1;
				int digit=temp%10;
				for(int i=0;i<count;i++)
					mul=digit*mul;
				sum=sum+mul;
				temp=temp/10;	
			}
			if(no==sum)
				System.out.println("\n The number : "+no+" is Armstrong Number");
			else
				System.out.println("\n The number : "+no+" is not Armstrong Number");		
		}
		else
			System.out.println("\n The number : "+no+"is Negative");	
	}
}
