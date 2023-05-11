package Interface;

interface Calculator{
	int add(int a,int b);
	int sub(int a,int b);
	int multiply(int a,int b);
	int divide(int a,int b);
}


class BasicCal implements Calculator{
	public int add(int a,int b) 
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int multiply(int a, int b )
	{
		return a*b;
	}
	public int divide(int a, int b)
	{
		return a/b;
	}
}


public class Interface1
{
	public static void main(String s[]) 
	{
		BasicCal c=new BasicCal();
		System.out.println(c.add(10,10));
		System.out.println(c.sub(10,10));
		System.out.println(c.multiply(10,10));
		System.out.println(c.divide(10,10));
	}
}


