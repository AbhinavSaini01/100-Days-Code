package Inheritance;

class Human		//Super class, Base class, Parent class
{
	int age;
	void sleep()
	{
		age=18;
		System.out.println("Human needs good sleep");
		System.out.println(age);
	}
}

class Student extends Human 	//Child class, Sub class, Derived class
{
	//now using extends keyword we can use everything written in Human class in this class.
}
public class Inheritance1
{

	public static void main(String[] args)
	{
		Student st=new Student(); //Object of student class
		st.sleep(); 			  //call to sleep method
	}			

}
