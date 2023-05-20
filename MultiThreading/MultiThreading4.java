package MultiThreading;
import java.util.*;

class Calc extends Thread
{  
	public void run()
	{
	System.out.println("calculation task started");
	
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter first number");
	int num1= sc.nextInt();
	
	System.out.println("Enter second number");
	int num2= sc.nextInt();
	
	int result=num1+num2;
	System.out.println("result is"+ " "+ result);
	
	}
}

class Message extends Thread
{ 
	public void run()
	{
		System.out.println("Message task started");
		for(int i=0;i<3;i++)
		{
			System.out.println("focus is important");
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading4 
{
	public static void main(String[] args)
	{
		Calc t1= new Calc();
		Message t2=new Message();
		
		t1.start();
		t2.start();
		
		
	}
	
}
