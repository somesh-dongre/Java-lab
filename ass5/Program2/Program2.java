import java.io.*;
public class Program2
{
	public static void main(String args[]) throws IOException
	{
		String line;
		int countWords = 0,countLines = 0, countChars=0;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
			
			while((line=br.readLine())!=null)
			{
				countChars += line.length();
				String[] wordList = line.split("\\s+");
				for(String ch:wordList)
				{
					if(ch.matches("\\w+"))
						countWords++;
				}
				countLines++;
			}

			System.out.println("Number of characters : "+(countChars+countLines));
			System.out.println("Number of words : "+countWords);
			System.out.println("Number of Lines : "+countLines);	
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("File Not Found");
		}
	}
}
