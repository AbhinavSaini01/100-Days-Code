package FileHandling;
import java.io.*;

public class BUFFEREDREADER 
{

	public static void main(String[] args) throws Exception 
	{
		File dir= new File("abhi");
		File file= new File(dir,"pw.txt");
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String line= br.readLine();//It attempts to read the next line and return it , from the File. 
								   //if the next line is not available then this method returns null.
		while(line!=null);
		{
			System.out.println(line);
			line=br.readLine();
		}	
	}
}
