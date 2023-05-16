package Interface;

interface C
{
	void show();
	default void config()   //default method
	{
		System.out.println("in config");
	}
	static void abc()    //static method
	{
		System.out.println("in abc");
		
	}
}

class D implements C
{
	public void show()  //overriding
	{
		System.out.println("in show");
	}
	static void abc()  //we can override static and default methods too in interface
	{
		System.out.println("in abc1");
		
	}
}
public class Java8features {
	
	public static void main(String[] args)
	{
		C.abc(); 
		D obj= new D();
		obj.config();
		obj.show();
		obj.abc();
		
		
		
	}

}
