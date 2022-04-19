import java.io.*;



class Program1
{
    public static void main(String args[])  {
        String name = args[0];
        File f1 = new File(name);

        if(f1.isDirectory())
        {
            String contentofDir[];
            int countFile = 0, countDir = 0;
            System.out.println("Directory");
            contentofDir = f1.list();
            System.out.println("Contents of Directory");
            for(String content : contentofDir)
            {
                File f2 = new File(name, content);
                if(f2.isFile())
                {
                    System.out.println(content);
                    countFile++;
                }
                else if(f2.isDirectory())
                {
                    System.out.println(content);
                    countDir++;
                }
            }
            System.out.println("\nTotal Files in Directory "+name+" ; "+countFile);
            System.out.println("Total Sub directory in Directory "+name+" ; "+countDir);
            System.out.println("Files with .txt extension in directory  "+name);
            for(int i = 0; i<contentofDir.length; i++)
            {
                if(contentofDir[i].endsWith(".txt"))
                    System.out.println(contentofDir[i]);
            }
        }
        else if(f1.isFile())
        {
            System.out.println("File");
            System.out.println("Path : "+f1.getPath());
            System.out.println("Size : "+f1.length());
            System.out.println("Is Readable : "+f1.canRead());
            System.out.println("Is Writable : "+f1.canWrite());
        }
        else 
            	System.out.println(name+"name file/Directory ia not present");
    }
}