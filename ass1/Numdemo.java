class MyNumber
{
	private int num;
	
	MyNumber()
	{
		num=0;
	}
	
	public MyNumber(int num)
	{
		this.num=num;
	}
	
	 void check(int n)
	{
		if(n==0)
			System.out.println("Number is Zero");
		else if(n<0)
			System.out.println("Number is Negative");
		else
			System.out.println("Number is Positive");
		if(n!=0)
		{	
			if(n%2==0)
				System.out.println("Number is Even");
			else
				System.out.println("Number is Odd");
		}
	}
}

class Numdemo
{
	public static void main(String args[])
	{
		MyNumber number;		
		for(int i=0;i<args.length;i++)
		{
			int n=Integer.parseInt(args[i]);
			number=new MyNumber();
			number=new MyNumber(n);
			number.check(n);
		}
	}
}

	
