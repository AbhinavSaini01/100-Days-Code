package FileHandling;
import java.io.*;

public class File1
{

	public static void main(String[] args) throws IOException
	{
		
		File file1= new File("pw.txt");
		System.out.println(file1.exists());
		
		file1.createNewFile();
		System.out.println(file1.exists());
		
		File dir=new File("PW");
		System.out.println(dir.exists());
		
		dir.mkdir();
		System.out.println(dir.exists());
		
	}

}
