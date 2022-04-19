import java.io.*;

public class Program3
{
    public static void main(String[] args) throws IOException{
        OutputStream even = new FileOutputStream("./even.txt");
        OutputStream odd = new FileOutputStream("./odd.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));

        char lineArr[];
        int lineCount = 0;
        String line;

        try{
            while((line = br.readLine()) != null);
            {
                lineCount++;
                lineArr = line.toCharArray();

                if(lineCount%2 == 0)
                {
                    for(char ch:lineArr)
                        even.write(ch);
                    even.write('\n');
                }

                else{
                    for(char ch :lineArr)
                        odd.write(ch);
                    odd.write('\n');
                }
            }
            System.out.println("Operation Successful");
        }

        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

        finally
        {
            odd.close();
            even.close();
        }
    }
}