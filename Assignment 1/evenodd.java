
class Mynumber
{
  private int data;

    Mynumber ()
  {
    data = 0;
  }
  Mynumber (int d)
  {
    this.data = d;
  }
  public void check()
  {

	if(data==0)
	{
		System.out.println("Zero !!");
	}
	else
	{
	if(data<0)
	{
		System.out.println("Negative");
	}
	else
	{
		System.out.println("Positive");
	}
	if(data%2==0)
	{
		System.out.println("Even");
	}	
	else
	{
		System.out.println("ODD");	
	}
	}
  }

  public static void main (String args[])
  {
   
    int n = Integer.parseInt(args[0]);  
    Mynumber ob = new Mynumber(n);
  
	ob.check();
  }

}
