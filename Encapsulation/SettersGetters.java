package Encap;

class Student3
{
	private String name;
	private int age;
	
	//To generate setters and getters method press (Alt+Shift+S)
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
 
	public void show()
	{
		System.out.println(name+" "+age);
	}
	
}
public class SettersGetters {

	public static void main(String[] args)
	{
		Student3 st1=new Student3();
		Student3 st2=new Student3();
		
		st1.setAge(18);
		st1.show();
		
		st2.setAge(19);
		st2.show();
		
		st1.setName("Abhiav");
		st1.show();
		
		st2.setName("Ankit");
		st2.show();
		
		int StudAge=st1.getAge();
		System.out.println(StudAge);
		

	}

}
