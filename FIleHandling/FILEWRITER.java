package FileHandling;
import java.io.*;

public class FILEWRITER
{

	public static void main(String[] args) throws IOException
	{
		File dir = new File("abhi");
		dir.mkdir();
		File file= new File(dir,"pw.txt");
		file.createNewFile();
		System.out.println(file.exists());
		
//		FileWriter fw = new FileWriter(file);  // through this we override data present in the file
//		fw.write("Java");
//		fw.write("\n");
//		fw.write(65);
//		fw.write("\n");
//		fw.write(97);
//		fw.write("\n");
//		char[] ch= {'j','a','v','a'};
//		fw.write(ch);
//		
//		fw.close();
		
		
		FileWriter fw = new FileWriter(file,true); //through this we can add more data without overridig the data present in the file
		fw.write("\n");
		fw.write("Toy");
		fw.write("\n");
		fw.write(65);
		fw.write("\n");
		fw.write(97);
		fw.write("\n");
		char[] ch= {'j','a','v','a'};
		fw.write(ch);
		
		fw.close(); //imporant to close 
		//fw.flush
				
		

	}

}
