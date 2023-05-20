package MultiThreading;
import java.util.*;

//Thread creation by implementing Runnable interface.

class Calc1 implements Runnable
{
	public void run()
	{
		System.out.println("calculation task started");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first no.");
		int num1=sc.nextInt();
		
		System.out.println("enter second no.");
		int num2=sc.nextInt();
		
		int res=num1+num2;
		System.out.println(res);
	}
}

class Message1 implements Runnable
{
	public void run() 
	{
		System.out.println("Display message task");
		Scanner sc= new Scanner(System.in);
		
		try 
		{
			for(int i=0;i<3;i++)
			{
				System.out.println("Focus is important");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println("some problem");
		}
	}
}

public class MultiThreading5 
{
	public static void main(String [] args)
	{
		Calc1 c1= new Calc1();
		Message1 m1=new Message1();
		
		Thread t1= new Thread(c1);
		Thread t2= new Thread(m1);
		
		t1.start();
		t2.start();
	}
}
