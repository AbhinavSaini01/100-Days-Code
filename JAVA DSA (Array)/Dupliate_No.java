package DSA;

public class Dupliate_No
{
	public static void main(String[] args)
	{
		int arr[]= {2,3,4,2,5,3,5,43,43};
		int n= arr.length;
		
		int count=0;
		
		for(int i=0; i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Match found : "+ arr[i]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
