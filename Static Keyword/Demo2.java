package LaunchSatic;

 class launch
{
	static void disp1() //method with static
	{
		System.out.println("static disp1");
	}
	
	void disp2() // method without static
	{
		System.out.println("Non static disp2");
	}
}
 
 public class Demo2
 {
	 public static void main (String[] agrs)
	 {
		 launch.disp1(); //static method can be called without making object
		 
		 launch l= new launch();
		 l.disp1(); 
		 l.disp2();
		 
	 }
 }

