package ExceptionHandling;

public class MultipleCatch {

		public static void main(String[] args)
		{
			int num1=6;
			int num2=2;
			int result=0;
			int values[]= {4,5,6,7};
			String name=null;
			
			try
			{
				result=num1/name.length();
				System.out.println(values[5]);
			}

			catch(ArithmeticException e)
			{
				System.out.println("can't divide by zero" +e);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("stay in your limits");
			}
			
			catch(Exception e)  //parent class of all exception class
		    {
			System.out.println("something went wrong" +e);
			}
			
			System.out.println(result);
			System.out.println("bye");
			
		}

	}



