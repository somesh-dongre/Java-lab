import java.io.*;

class SilverCardCustomer implements CreditCardInterface
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	double creditAmount,creditLimit;
	String name,cardnumber;
	SilverCardCustomer()
	{
		creditAmount=0;
		creditLimit=50000;
	}
	public void input() throws IOException
	{
		System.out.print("\nEnter card holder name : ");
		name = br.readLine();
		System.out.print("Enter Card Number : ");
		while(true)
		{
			cardnumber = br.readLine();
			if(cardnumber.matches("[0-9]+") && cardnumber.length()==16)
				break;
			else
				System.out.print("Invalid card number, please re-enter card number : ");
		} 
	}
	public void viewCreditAmount()
	{
		System.out.println("Your credit amount is "+creditAmount);
	}
	
	public void useCard() throws IOException
	{
		System.out.println("You can use card upto "+(creditLimit-creditAmount));
		double amount;
		System.out.print("Enter amount to use : ");
		while(true)
		{
			amount = Double.parseDouble(br.readLine());
			if(amount>0)
				break;
			else
				System.out.print("Invalid amount, re-enter amount : ");
		}
		if((amount+creditAmount)<=creditLimit)
		{
			creditAmount = creditAmount+amount;
			System.out.println("Transaction is sucessful");
		}
		else
			System.out.println("Transaction is failed");		 
	}

	public void payCredit() throws IOException
	{
		double pay;
		viewCreditAmount();
		if(creditAmount==0.0)
			System.out.println("No credit left...Payment is not required");

		else
		{
			System.out.print("Enter amount to pay : ");
			while(true)
			{
				pay = Double.parseDouble(br.readLine());
				if(pay>0)
					break;
				else
					System.out.print("Invalid pay amount, re-enter amount : ");
			}
			if(pay<=creditAmount)
			{
				creditAmount = creditAmount-pay;
				System.out.println("Transaction is successful\nYour remaining credit amount is "+creditAmount);
			}
			else
				System.out.println("Transaction is failed");
		}
	}
			
	
	public void increaseLimit()
	{
	}
}


class GoldCardCustomer extends SilverCardCustomer
{
	int count=0;
	//double creditLimit;
	GoldCardCustomer() 
	{
		super.creditLimit = 100000;
	}
	public void increaseLimit()
	{
		
		
		if(count<3)
		{
			
			creditLimit = creditLimit+5000;
			System.out.println("Your credit limit is increased to "+creditLimit);
			count++;
		}
		else
			System.out.println("Card increase limit is reached");
	}
}



























































































	
