package constructor;

class student
{
	private String name;  //instance variable
	private int age;
	
	public student()  //non-parameterized constructor
	{
		System.out.println("Deafult constructor is called");
		name="Rohan";
		age=18;	
	}
	
	public student(String name)  //parameterized constructor 
	{
		this.name=name;
		age=19;
	}
	
	public student(String name, int age)  //parameterized constructor 
	{
		this.name=name;
		this.age=age;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
}

public class Constructor_Overloading 
{

	public static void main(String[] args)
	{
		student st1=new student();  //non-parameterized constructor call
		st1.display();
		
		student st2= new student("Abhinav");  //parameterized constructor call
		st2.display();
		
		student st3=new student("Ankit",19);  //parameterized constructor call
		st3.display();
		
	}

}
