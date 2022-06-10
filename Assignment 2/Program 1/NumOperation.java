
import NumOperation.*;

import java.io.*;
	
class NumOperation
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number : ");		
		int n = Integer.parseInt(br.readLine());
	
		Prime pr = new Prime();
		Perfect pt = new Perfect();
		Armstrong ar = new Armstrong();
		
		pr.Primeno(n);
		pt.Perfectno(n);
		ar.Armstrongno(n);
	}
}
