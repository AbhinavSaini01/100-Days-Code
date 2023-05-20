package MultiThreading;

public class MultiThreading2 {

	public static void main(String[] args) 
	{
	  System.out.println("Main Thread");
	  System.out.println("Before changing");
	  String name = Thread.currentThread().getName();
	  System.out.println(name);
	  System.out.println(Thread.currentThread().getPriority());
	  
	  System.out.println("After changing");
	  Thread t= Thread.currentThread();
	  t.setName("PW");
	  t.setPriority(1);
	  
	  System.out.println(Thread.currentThread().getName());
	  System.out.println(Thread.currentThread().getPriority());
	  
	  

	}

}
