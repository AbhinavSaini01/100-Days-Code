package FileHandling;
import java.io.*;

class Cricketer implements Serializable 
{
	private String name;
	private int age;
	private int run;
	
public Cricketer(String name,int age,int run)
	{
		this.name= name;
		this.age=age;
		this.run=run;
	}

public void disp()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(run);
	}
}


public class SERIALIZATION 
{

	public static void main(String[] args) throws IOException 
	{
		Cricketer c= new Cricketer("sachin",44,500);
		c.disp();
		
		FileOutputStream fis= new FileOutputStream("mca.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fis);
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		
		oos.writeObject(c);
		oos.flush();
		oos.close();		
	}
	
}
