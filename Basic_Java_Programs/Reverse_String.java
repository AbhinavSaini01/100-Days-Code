package BasicPrograms;

import java.io.*;
import java.util.Scanner;

class Reverse_String
{
	public static void main (String[] args)
	{
	
		String str= "Abhinav", newstr="";
		char ch;
	
	System.out.print("Original word: ");
	System.out.println("Abhinav"); 
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		newstr= ch+newstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ newstr);
	}
}
