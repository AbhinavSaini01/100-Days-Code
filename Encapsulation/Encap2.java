
package Encap;

class student1
{
	private int age;
	private String name;
	
	public void setData1(int a)
	{
		age =a;
	}
	
	public void show()
	{
		System.out.println(name + " " + age);
	}
}


public class Encap2 {

	public static void main(String[] args) 
	{
 
		student1 obj= new student1();
		student1 obj1= new student1();
		obj.setData1(18);
		obj1.setData1(25);
		obj.show();
		obj1.show();
		
	}

}
