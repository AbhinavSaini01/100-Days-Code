package Inheritance;

class Human1
{
	private String name;
	int age;
	
	Human1() //non parameterized constructor 
	{
		System.out.println("Human class constructor");
	}
	
	void sleep()
	{
		age=18;
		System.out.println("Human needs good sleep");
		System.out.println(age);
	}
}

class Student1 extends Human1
{ 
	/*non parameterized constructor of parent class is called in this class
	  because this class has a default constructor which has super() keyword 
	  in first line so that it will call to the non-parameterized constructor 
	  of parent class */
	
	void display()
	{
		System.out.println("The age is: " + age);
		//System.out.println("the name is: " + name);  //name can't be inherited cz it is private in parent class
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		
		Student1 st1 = new Student1();
		st1.sleep();
		st1.display();

	}

}
