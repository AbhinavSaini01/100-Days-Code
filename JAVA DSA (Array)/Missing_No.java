package DSA;

public class Missing_No
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,7,6,5};
		 int n = arr.length;
		
		int total_sum = (n+1)*(n+2)/2;
		int current_sum= 0;
		
		for(int i=0; i<n;i++)
		{
			current_sum += arr[i];
		}
		
		int missing_no = total_sum-current_sum ;
		System.out.println(missing_no);
	}

	

}
