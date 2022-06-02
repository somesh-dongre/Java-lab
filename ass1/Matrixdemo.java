import java.io.*;

class Matrix
{
	int[][] addmatrix(int a[][],int b[][])
	{
		int res[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{	
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}	

}
class Matrixdemo
{

	static void display(int abc[][],int row,int col)
		{
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{		
					System.out.print(abc[i][j]+"\t");
				}
				System.out.println();
			}
			
		}

	public static void main(String args[])throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rowa,cola,rowb,colb;

		
		System.out.println("Enter row size of A:");
		rowa=Integer.parseInt(br.readLine());
		
		System.out.println("Enter col size of A:");
		cola=Integer.parseInt(br.readLine());


		while(true)
		{

			System.out.println("Enter row size of B:");
			rowb=Integer.parseInt(br.readLine());
		
			if(rowa==rowb)
				break;

			else
				System.out.println("No. of rows of matrix B should be equal to no. of rows of matrix A");
		}

		while(true)
		{

			System.out.println("Enter col size of B:");
			colb=Integer.parseInt(br.readLine());
		
			if(cola==colb)
				break;

			else
				System.out.println("No. of cols of matrix B should be equal to no. of cols of matrix A");
		}
		
		
		int a[][]=new int[rowa][cola];
		int b[][]=new int[rowb][colb];
		
		int res[][]=new int[rowa][cola];
		System.out.println("\nEnter elements of matrix A");		
		for(int i=0;i<rowa;i++)
		{
			for(int j=0;j<cola;j++)
			{	
				System.out.format("Enter element A[%d][%d]:",i+1,j+1);
				a[i][j]=Integer.parseInt(br.readLine());
			}
		
		}
		System.out.println("Matrix A:");
		display(a,rowa,cola);
		
		System.out.println("\nEnter elements of matrix B");
		for(int i=0;i<rowb;i++)
		{
			for(int j=0;j<colb;j++)
			{	
				System.out.format("Enter element B[%d][%d]:",i+1,j+1);
				b[i][j]=Integer.parseInt(br.readLine());
			
			}
		
		}
		System.out.println("Matrix B:");
		display(b,rowb,colb);

		Matrix m1=new Matrix();

		res=m1.addmatrix(a,b);
		System.out.println("\nResult matrix:");
		display(res,rowa,cola);

	}	
}	
			





		
