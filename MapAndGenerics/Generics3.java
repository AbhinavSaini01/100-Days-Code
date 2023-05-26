package Map;
import java.util.*;

class Gen<T>  //T is used to achieve typesafety in the class
{
	
	T obj;

	public Gen(T obj)  //constructor
	{
		this.obj= obj;  
	}
	
	void disp()
	{
		System.out.println("The type of data is : "+ obj.getClass().getName());
	}
	
	public T getObj()
	{
		return obj;
	}
}

public class Generics3 
{

	public static void main(String[] args) 
	{
		Gen<Integer> g= new Gen<Integer>(10);
		g.disp();
		System.out.println(g.getObj());
		
		System.out.println("****************");
		
		Gen<String> g1= new Gen<String>("PW");
		g1.disp();
		System.out.println(g1.getObj());
		
		
		
//		ArrayList<Gen> list1= new ArrayList<Gen>(); *Syntax valid*
//		
//		List<String> list2= new ArrayList<String>();  *Syntax valid*
//		
//		Collection<Integer> list3 =new ArrayList<Integer>();  *Syntax valid*
//		
//		List<Object> list4 = new ArrayList<String>();  *Syntax not valid*  compile time error
//		
//		List<Integer> list5=new ArrayList<Integer>();   *Syntax valid*
//		
//		List<int> list6 = new ArrayList<int>();  *Syntax not valid*
		

	}

}
