package BasicPrograms;
import java.io.*;

class SubtractionofMatrix
{

	static void printMatrix(int M[][], int rowSize,
							int colSize)
	{
		for (int i = 0; i < rowSize; i++) 
		{
			for (int j = 0; j < colSize; j++)
			{
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
	}


	static int[][] subtract(int A[][], int B[][], int size)
	{
		int i, j;
		int C[][] = new int[size][size];

		for (i = 0; i < size; i++)
		{
			for (j = 0; j < size; j++)
			{
				C[i][j] = A[i][j] - B[i][j];
			}
		}

		return C;
	}


	public static void main(String[] args)
	{
		int size = 3;

		int A[][] = { { 50, 20, 30 },
					{ 60, 30, 10 },
					{ 30, 80, 10 } };
		
		System.out.println("\nMatrix A:");
		printMatrix(A, size, size);

		int B[][] = { { 10, 10, 5 },
					{ 20, 10, 12 },
					{ 23, 21, 12 } };
		
		System.out.println("\nMatrix B:");
		printMatrix(B, size, size);

		
		int C[][] = subtract(A, B, size);

		
		System.out.println("\nResultant Matrix:");
		printMatrix(C, size, size);
	}
}

