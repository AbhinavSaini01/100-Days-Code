package Map;

class GenericTest<t>
{
	t a;
	void SetValue(t ar)
	{
		a=ar;
	}
	
	<p>void disp(p str)
	{
		System.out.println(str);
		System.out.println(a.getClass().getName());
		System.out.println(a);
	}
}


public class Generics4
{

	public static void main(String[] args)
	{
		GenericTest<Integer> ob=new GenericTest();
		ob.SetValue(10);
		ob.disp("Hello");
		
		GenericTest<Double> ob1= new GenericTest();
		ob1.SetValue(10.5);
		ob1.disp("Byee");
		
	}

}
