package pattern;


public class pattern19_PascalTriangle
{

public static void main(String[] args) 
{

int x = 6;

for (int i = 0; i < x; i++) 
{

int num = 1;

System.out.printf("%" + (x - i) * 2 + "s", ""); //Pascal's triangle logic

for (int j = 0; j <= i; j++)
{

System.out.printf("%4d", num);

num = num * (i - j) / (j + 1);

}

System.out.println();

}

}

}

