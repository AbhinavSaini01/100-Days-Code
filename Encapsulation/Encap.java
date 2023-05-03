package Encap;

class student 
{
	private int age;
	private String name;
	
	public void setData()
	{
		age =18;
		name = "rahul";
	}
	
	public void show()
	{
		System.out.println(name + " " + age);
	}
}

public class Encap {

	public static void main(String[] args) {
		
		student obj =new student();
		obj.setData();
		obj.show();
	}
}
