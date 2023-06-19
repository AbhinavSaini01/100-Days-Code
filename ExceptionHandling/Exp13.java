package LAB;

import java.util.Scanner;

class InvalidInputException extends Exception 
{
    InvalidInputException(String message) 
    {
        super(message);
    }
}

class Customer 
{
    private String custNo;
    private String custName;
    private String category;

    public Customer(String custNo, String custName, String category) throws InvalidInputException
    {
        if (!custNo.startsWith("C") && !custNo.startsWith("c") || custName.length() < 4 ||
                (!category.equals("Platinum") && !category.equals("Gold") && !category.equals("Silver")))
        {
            throw new InvalidInputException("Invalid input");
        }

        this.custNo = custNo;
        this.custName = custName;
        this.category = category;
    }

    public String getCustNo()
    {
        return custNo;
    }

    public String getCustName() 
    {
        return custName;
    }

    public String getCategory() 
    {
        return category;
    }
}

public class Exp13 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer number: ");
        String custNo = scanner.nextLine();

        System.out.print("Enter customer name: ");
        String custName = scanner.nextLine();

        System.out.print("Enter customer category (Platinum/Gold/Silver): ");
        String category = scanner.nextLine();

        try 
        {
            Customer customer = new Customer(custNo, custName, category);
            System.out.println("\nCustomer details:");
            System.out.println("Customer Number: " + customer.getCustNo());
            System.out.println("Customer Name: " + customer.getCustName());
            System.out.println("Category: " + customer.getCategory());
        } 
        catch (InvalidInputException e)
        {
            System.out.println("\nInvalid input: " + e.getMessage());
        }

        scanner.close();
    }
}


