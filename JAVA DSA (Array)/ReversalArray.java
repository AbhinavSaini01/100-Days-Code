package DSA;

public class ReversalArray 
{

	public static void main(String[] args)
	{
		int [] array= {1,3,5,8,10};
		int n= array.length;
		
		for(int i=0;i<n/2;i++)
		{
			int temp=array[i];
			array[i]=array[n-i-1];
			array[n-i-1]=temp;
		}
		
		System.out.println("Reversal array");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]+" ");
		}
		

	}

}
