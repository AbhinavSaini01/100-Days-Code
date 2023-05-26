package Map;
import java.util.*;

class Student1
{
	private String name;
	private int id;
	
	public String toString()
	{
		return name +" "+id;
		
	}
}

class Employee1
{
	private String name;
	private int id;
	
	public String toString()
	{
		return name+" "+id;
		
	}
}


public class Generics2
{
	public static void main(String[] args) 
	{
		Student1 st1=new Student1();
		Student1 st2=new Student1();
		
		Employee1 emp=new Employee1();
		
		ArrayList<Student1> al= new ArrayList<Student1>();
		al.add(st1);
		al.add(st2);
		//al.add(emp);  *we can't add employee in student1 arraylist cz of student1 generics
		
		System.out.println(st1);
		System.out.println(st2);
		
	}

}
