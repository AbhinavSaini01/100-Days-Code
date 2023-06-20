package DSA;

public class Palindrome 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,2,2};
		int n= arr.length;
		int flag=0;
		
		for(int i=0;i<n/2;i++)
		{
			if(arr[i] != arr[n-i-1])
			{
				flag =1;
				System.out.println("not palindromic array");
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("palindromic array");	
		}
	}
}
