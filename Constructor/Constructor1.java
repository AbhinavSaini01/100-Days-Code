package constructor;

class Demo
{
	private int a;  //instance variable
	private int b;
	
	public Demo()  //non-parameterized constructor 
	{
		System.out.println("zero parameterized constructor");
	}
	
	public Demo(int a,int b)  //parameterized constructor
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

public class Constructor1 {
	
	public static void main(String[] args)
	{
		Demo d1= new Demo();   //non-parameterized constructor call
		d1.display();
		
		Demo d2=new Demo(10,20);  //parameterized constructor call
		d2.display();
		
	}

}
