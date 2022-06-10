import java.io.*;

class Matrix
{
  void display(int[][] a,int[][] b,int r,int c,int r1,int c1)
  {
    int i,j;

    for(i=0;i<r;i++)
    {
	for(j=0;j<c;j++)
		System.out.print(a[i][j]+" ");
	System.out.println();
    }
    for(i=0;i<r1;i++)
    {
	for(j=0;j<c1;j++)
		System.out.print(b[i][j]+" ");
	System.out.println();
     }
  }

  int[][] addm(int[][] a,int[][] b,int r,int c)
  {
    int i,j;
    int[][] res=new int[r][c];

    for(i=0;i<r;i++)
    {
	for(j=0;j<c;j++)
		res[i][j]=a[i][j]+b[i][j];
    }
 	return res;
  }
}
class addMatrix
{
  public static void main(String arhs[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int i,j;

    Matrix m = new Matrix();
 
    System.out.println("Enter row for 1st matrix:");
    int r=Integer.parseInt(br.readLine());
  
    System.out.println("Enter column for 1st matrix:");
    int c=Integer.parseInt(br.readLine());

    System.out.println("Enter row for 2nd matrix:");
    int r1=Integer.parseInt(br.readLine());
  
    System.out.println("Enter column for 2nd matrix:");
    int c1=Integer.parseInt(br.readLine());
    
    int[][] m1=new int[r][c];
    int[][] m2=new int[r1][c1];
    
    if(r==r1 && c==c1)
    {
      System.out.println("Enter details of 1st matrix:");
      for(i=0;i<r;i++)
      {
	 for(j=0;j<c;j++)
		m1[i][j]=Integer.parseInt(br.readLine());
      }
      System.out.println("Enter details of 2nd matrix:");
      for(i=0;i<r1;i++)
      {
	 for(j=0;j<c1;j++)
		m2[i][j]=Integer.parseInt(br.readLine()); 
      }
   
      m.display(m1,m2,r,c,r1,c1);

      int[][] res=new int[r][c];

      res=m.addm(m1,m2,r,c);

      System.out.println("Resultant matrix");
      for(i=0;i<r;i++)
      {
	 for(j=0;j<c;j++)	
		System.out.print(res[i][j]+" ");
	 System.out.println();
      }
     }else
	System.out.println("Dimensions not matched ");
  }
}    
