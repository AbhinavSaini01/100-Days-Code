package FileHandling;
import java.io.*;

public class FILEREADER 
{
    public static void main(String[] args) throws Exception
    {
       

         File dir=new File("abhi");
         File file=new File(dir, "pw.txt");

         FileReader fd=new FileReader(file);
         
         
         char ch[]=new char[(int)file.length()]; //created a array length same as file to store file data 
         fd.read(ch); //reading data from file
         for(char data:ch)
         {
            System.out.print(data);
         }

         
        //this method is to print file's data in one by one character form
        //  int i=fd.read(); 
        //  System.out.println((char)i);

        //  while(i!=-1) *traversing to the end of file(-1 = end of file)*
        //  {
        //     System.out.print(i+ "----> ");
        //     System.out.println((char)i);
        //     i=fd.read();

        //  }


        
    }
    
}

