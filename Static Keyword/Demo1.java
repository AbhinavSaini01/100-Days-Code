package LaunchSatic;

public class Demo1 {
	static int age;
	static {
		age=18;
		System.out.println("static block first");
		System.out.println(age);
		}
	
	public static void main(String[] args)
	{
		System.out.println("main method second");
	}

}
/* Static blocks executes first */
/* If you want something to get executed before main method put it in static block  */