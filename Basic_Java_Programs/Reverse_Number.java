package BasicPrograms;
import java.io.*;

class Reverse_Number{
	
	// Function to reverse the number
	static int reverse(int n){
	
	int rev = 0; // reversed number
	int rem; // remainder
	
	while(n>0){
		
		rem = n%10;
		rev = (rev*10) + rem;
		n = n/10;
	}
	
	return rev;
	}
	

	public static void main (String[] args) {
		int n = 4526;
		
		System.out.print("Reversed Number is "+ reverse(n));
	}
}


