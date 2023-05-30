package FileHandling;
import java.io.*;

public class File2 
{

	public static void main(String[] args) throws IOException 
	{
		File dir = new File("PWJAVA");
		//System.out.println(dir.isDirectory()); //false
		
		dir.mkdir();
		System.out.println("dir is referring to directory PWJAVA"+" "+dir.isDirectory()); //new method to check directory is available or not
		
		
		File file= new File(dir,"abc.txt"); //through this we check that 'dir' dircetory have 'abc.txt' file or not.
		//System.out.println(file.isFile()); //false
		
		file.createNewFile();//here we created a file inside directory 'dir'.
		System.out.println("file is referring to abc.txt"+" "+file.isFile());
		
		
		
		int count =0;
		
		File f= new File("PWJAVA");
		String str[]= f.list(); //array storing files inside PWJAVA
		
		for(String name : str) //enhanced for loop
		{
			count++;
			System.out.println(name);
		}
		System.out.println("No. of files are"+" "+count);
		
	}

}
