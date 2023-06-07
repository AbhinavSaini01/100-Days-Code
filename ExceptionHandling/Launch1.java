package ExceptionHandling;
import java.util.*;
import java.util.InputMismatchException;

public class Launch1
{
	public static void main(String[]args)
	{
		int num1=3;
		int num2=0;
		int arr[]= {1,2,3};
		int result=0;
		try
		{
			result=num1/num2;
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant divide by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("cant divide by zero"+e);
		}
		
		catch(Exception e)
		{
			System.out.println("error");
		}
		finally
		{
			System.out.println("Finally block executedd");
		}
		System.out.println(result);
	}
}
