package LAB;


import java.io.File;
import java.io.IOException;

public class Exp14 
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("Java");
        	dir.mkdir();
        	
        File file = new File(dir,"xyz.txt");
        	file.createNewFile();
        	
            System.out.println("File exists: " + file.exists());
            System.out.println("Is directory: " + dir.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
      
    }
}


