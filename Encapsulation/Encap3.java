package Encap;


class student2
{
	private int age;
	private String name;
	
	public void setData1(int age)
	{
		this.age =age;
	}
	public void setData2(String name)
	{
		this.name =name;
	}
	
	public void show()
	{
		System.out.println(name + " " + age);
	}
}



public class Encap3 {
	
	public static void main(String [] args)
	{
		student2 obj= new student2();
		student2 obj1= new student2();
		
		obj.setData1(18);
		obj1.setData1(25);
		
		obj.setData2("abhinav");
		obj1.setData2("rahul");
		
	}

}
