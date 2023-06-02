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


public class LaunchDSR 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{	
		FileInputStream fis= new FileInputStream("pw.txt");
		BufferedInputStream bis= new BufferedInputStream(fis);
		ObjectInputStream ois=new ObjectInputStream(bis);
		Cricketer cr=(Cricketer) ois.readObject();
		cr.disp();
		ois.close();
	}

}
