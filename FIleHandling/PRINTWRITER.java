package FileHandling;
import java.io.*;

/*By using FileWriter and BufferedWriter we can write only character data to the File but by using PrintWriter
we can write any type of data to the File.*/

public class PRINTWRITER
{

	public static void main(String[] args) throws IOException 
	{
		File dir=new File("KIET");
		dir.mkdir();
		System.out.println(dir.isDirectory());
		
		File file=new File("mca.txt");
		file.createNewFile();
		System.out.println(file.isFile());
		
		FileWriter fr= new FileWriter(file);
		PrintWriter pr=new PrintWriter(fr);
		
		pr.println("Abhinav"); //by using println data will get stored in next line always
		pr.println(03);
		pr.println('a');
		pr.println(0.5);
		pr.println(true);
		
		pr.close();
	}
}
