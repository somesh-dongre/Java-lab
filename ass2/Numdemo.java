import NumOperation.*;
import java.io.*;

class NumOpdemo
{
	public static void main(String args[])throws IOException
	{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number");
		n=Integer.parseInt(br.readLine());
		
		Prime pri=new Prime();
		Perfect per=new Perfect();
		Armstrong ar=new Armstrong();	

		pri.prime(n);
		per.perfect(n);
		ar.armstrong(n);	
	}
}		
	
