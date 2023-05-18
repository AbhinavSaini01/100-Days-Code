package ExceptionHandling;

import java.util.Scanner;

public class Exception1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = s.next();

        try 
        {
            int number = Integer.parseInt(input);
            System.out.println("The number you entered is: " + number);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }
}
