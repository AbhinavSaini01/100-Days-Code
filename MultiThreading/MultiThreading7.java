package MultiThreading;

class Printing implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("Focus is important");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
	}
}
public class MultiThreading7 
{
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("Main thread started the work");
		Printing p= new Printing();
		Thread t= new Thread(p);
		System.out.println(t.isAlive());  //to check that thread gets life or not
		
		t.start();
		System.out.println(t.isAlive());
		t.join(); //to execute printing thread before whole execution of main thread
		
		System.out.println("Main thread finished the work");
	}
}
