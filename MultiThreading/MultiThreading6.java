package MultiThreading;
import java.util.Scanner;

class MyThread1 extends Thread
{
	public void run()
	{
		String name= Thread.currentThread().getName();
		if (name.equals("Calc"))
		{
			Calc();
		}
		else
		{
			Message();
		}
	}
	
	public void Calc()
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
	
	public void Message()
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

public class MultiThreading6
{

	public static void main(String[] args)
	{
		System.out.println("main thread");
		
		MyThread1 t1= new MyThread1();
		MyThread1 t2= new MyThread1();
		
		t1.setName("Calc");
		t2.setName("Print");
		
		t1.start();
		t2.start();
    }

}
