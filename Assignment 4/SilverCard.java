import java.io.*;

class SilverCard implements CCard 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String name;
	String cno;
	
	double cAmt,payAmt;
	double climit;
	int cnt;

	SilverCard()
	{
		cAmt=0;
		climit=50000;	
	}

	public void accept() throws IOException
	{
		System.out.println(" Enter Name : ");
		name = br.readLine();
		System.out.println(" Enter Card Number : ");
		while(true)
		{		
			cno = br.readLine();
			if(cno.matches("[0-9]+") && cno.length()==16)
				break;
			else
				System.out.println("Invalid Card Number !! ");
				System.out.println("\n Enter Valid Card Number : ");
			
		}
		/*System.out.println("Enter Credit Amount : ");
		while(true)
		{
			cAmt = Double.parseDouble(br.readLine());
			if(cAmt>0)
				break;
			else
				System.out.println("Invalid Amount !!");
				System.out.println("\n Enter Valid Credit Amount : ");
			
		}*/
			
	}
	public void viewAmt()
	{
		System.out.println("\nYour Credit Amount is : "+cAmt);
	}
	
	public void payCredit() throws IOException
	{
		if(cAmt==0)
		{
			System.out.println("\nCan not Pay credit !!!\n");
		}
		else
	{
		double amount;
		System.out.println("Enter amount : ");
		while(true)
		{
			amount = Double.parseDouble(br.readLine());
			if(amount > cAmt)
			{
				System.out.println("\n Amount is more than credit Amount!!");
				System.out.println("\n Enter Valid Credit Amount : ");
					
			}
			else
			{
				cAmt = cAmt - amount;
				System.out.println("Paid Successfully !!!");
				viewAmt();
				break;
			}		
		}
	   }	
	}

	public void useCard() throws IOException
	{
		if(cAmt!=climit)
		{
		
		System.out.println("Enter Paying Amount : ");
		while(true)
		{
			payAmt = Double.parseDouble(br.readLine());
			if((payAmt+cAmt)<=climit)
			{
				cAmt = cAmt + payAmt;
				System.out.println("Card Used!!");
				viewAmt();
				break;
			}
			else
			{
				System.out.println("Exceeding Credit Limit !!");
				System.out.println("\n Enter Valid Paying Amount : ");
			}
		}
		}
		else{
			System.out.println("\nCredit limit has reached !!");
		    }
	}
}

class GoldCard extends SilverCard
{
	public int cnt;
	double amount;

	GoldCard()
	{
		climit=100000;
	}
	
	public void inlimit() throws IOException
	{
		cnt++;
		if(cnt<4)
		{
			
				climit = climit + 5000;
				System.out.println("Credit Limit is increased !!");
				System.out.println("Updated Credit limit is : "+climit);
				System.out.println("\n");
			
			
		}
		else
			System.out.println("Can't increase limit more than 3 times !!!\n");	

	}

}

