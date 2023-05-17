package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		try {
			num=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("enter a number");
		}
		finally
		{
			sc.close();
		}
		System.out.println(num);
	}

}
