package MultiThreading;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("in child");
	}
}

public class MultiThreading3 
{
	public static void main(String [] args)
	{
		System.out.println("in main");
		MyThread obj =new MyThread();
		obj.start();
	}
}
