package ExceptionHandling;

public class Exception2 
{
	public static void main(String[] args)
	{
	
	int a=40,d=0;
	
	try {
		System.out.println(a/d);
		System.out.println("end of try block");
		}
   catch(ArithmeticException exception )
	{
	   System.out.println("divide by zero");
	}
	System.out.println("End of main");
}
}
