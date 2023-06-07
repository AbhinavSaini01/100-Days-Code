package FileHandling;

import java.io.*;

public class CopyFile
{
    public static void main(String[] args)
    {
        try (FileReader reader = new FileReader("C:\\Users\\admin\\eclipse-workspace\\FileHandling\\KIET\\mca.txt");
             FileWriter writer = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\FileHandling\\PWJAVA\\abc.txt");)
        {

            int character;
            while ((character = reader.read()) != -1)
            {
                writer.write(character);
            }

            System.out.println("File copied successfully.");
            
            reader.close();
            writer.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

