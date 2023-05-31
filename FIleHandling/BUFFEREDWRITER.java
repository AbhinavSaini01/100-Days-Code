package FileHandling;
import java.io.*;

public class BUFFEREDWRITER 
{

	public static void main(String[] args) throws IOException
	{
		File dir= new File("PW");
		File file= new File(dir, "PW.txt");
		
		FileWriter fw= new FileWriter(file,true);
		BufferedWriter bw= new BufferedWriter(fw);//passing object of filewriter *compulsory*
		
		bw.write("java");
		bw.newLine();
		bw.write(65);
		bw.newLine();
		char ch[]= {'a','b','h','i'};
		bw.write(ch);
		
		bw.flush();
		bw.close();

	}

}
