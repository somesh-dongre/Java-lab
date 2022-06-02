import java.io.*;

public class Program3
{
	public static void main(String[] args) throws IOException
	{
		OutputStream even = new FileOutputStream("./even.txt");
		OutputStream odd = new FileOutputStream("./odd.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader (new FileInputStream(args[0]))); 
	
		char linearr[];
		int linecount=0;
		String line;

		try 
		{
			while((line = br.readLine()) != null)
			{
				linecount++;
				linearr = line.toCharArray();
				
				if(linecount%2==0)
				{
					for(char ch : linearr)
						even.write(ch);
					even.write('\n');
					
				}
				
				else
				{
					for(char ch : linearr)
						odd.write(ch);
					odd.write('\n');
				}
			}
			System.out.println("Operation successful");
		}

		catch (FileNotFoundException fnfe)
		{
			System.out.println("File Not Found");
		}

		finally
		{
			odd.close();
			even.close();
		}
	}
}
