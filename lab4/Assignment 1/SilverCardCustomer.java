import java.io.*;

class SilverCardCustomer implements CreditCardInterface
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	double creditAmount,creditLimit,creditBalance;
	String name,cardnumber;
	SilverCardCustomer()
	{
		creditAmount = 0;
		creditLimit = 50000;
	}
	void input() throws IOException
	{
		System.out.print("\nEnter name of card holder : ");
		name = br.readLine();
		System.out.print("Enter card number : ");
		while(true)
		{
			cardnumber = br.readLine();
			if(cardnumber.length()==16 && cardnumber.matches("[0-9]+"))
				break;
			else
				System.out.print("Card number should be of 16 digits, please re-enter card number : ");
		}
	}
	public void viewCreditAmount() 
	{
		System.out.println("Your credit amount is "+creditAmount);
	}
	public void useCard() throws IOException
	{
		System.out.println("You can use credit card upto "+(creditLimit-creditAmount));
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
			System.out.println("Transaction is Successful");
		}
		else
			System.out.println("Transaction is Failed");
	}
	public void payCredit() throws IOException
	{
		double pay;
		viewCreditAmount();	
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
			System.out.println("Transaction is Successful\nYour remaining credit amount is "+creditAmount);
		}
		else
			System.out.println("Transaction is failed");
	}
	public void increaseLimit()
	{
		System.out.println("This facility is not for Silver card holders");
	}
}
class GoldCardCustomer extends SilverCardCustomer
{
	int count;
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
	
			
