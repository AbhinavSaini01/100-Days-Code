package pattern;
import java.util.*;

public class pattern17
{

	public static void printPattern(int n)
	{
		int i, j;
		int num = 1;

		for (i = 1; i <= n; i++) 
		{
			for (j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}

			int spaces = 2 * (n - i);
			for (j = 1; j <= spaces; j++)
			{
				System.out.print(" ");
			}

			for (j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}

			System.out.println();
		}

		
		for (i = n; i >= 1; i--)
		{
			
			for (j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}

			
			int spaces = 2 * (n - i);
			for (j = 1; j <= spaces; j++) 
			{
				System.out.print(" ");
			}

			for (j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}

	
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}

