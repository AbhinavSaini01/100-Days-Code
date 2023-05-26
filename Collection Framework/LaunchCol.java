
package Collection;
import java.util.*;

public class LaunchCol 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		

		ArrayList<String> al1=new ArrayList<String>();
		al1.add("PW");
		al1.add("HYDER");
		al1.add("JAVA");
		al1.add("ROHAN");
		
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		
		
		System.out.println(al2);
		
		int index=Collections.binarySearch(al2, 30);
		System.out.println("Index is :"+index);
		
		Collections.rotate(al2,3);
		System.out.println(al2);
		
		Collections.shuffle(al2);
		System.out.println(al2);
		
		System.out.println(Collections.frequency(al2,20));
		
	}

}



