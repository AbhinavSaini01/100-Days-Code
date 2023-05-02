package LaunchSatic;

class abc
{
	static int a;   //static variable
	static int b;   
	int m;          //instance variable
	int n;          
	
	static          //Static block
	{
		a=10;
		b=20;
		System.out.println("control in static block");
	}
	{
		m=100;      //non-static block
		n=200;
		System.out.println("control in non-static block");
	}
	static void disp1()   //static method
	{
		System.out.println("value of static var" + a);
		System.out.println("value of static var" + b);
	}
	void disp2()     //non-static method
	{
		System.out.println("value of instance var" + m);
		System.out.println("value of instance var" + n);
	}
}
public class Demo3 {
             
	public static void main(String[] args)
	{
		abc l= new abc();  //object of class abc
		abc.disp1();
		l.disp2();
	}
}
