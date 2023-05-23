package Collection;
import java.util.*;

public class LinkedlIst
{

	public static void main(String[] args)
	{
		LinkedList ll1= new LinkedList();
		
		ll1.add(100);
		ll1.add(200);
		ll1.add("PW Skills");
		ll1.add('J');
		ll1.add(200);
		
		System.out.println(ll1);
		
		System.out.println(ll1.get(1));
		System.out.println(ll1.indexOf(200));
		System.out.println(ll1.lastIndexOf(200));
		
		ll1.push(10);
		System.out.println(ll1);
		System.out.println(ll1.pop());
		
		ll1.addFirst("PW");
		System.out.println(ll1);
		
		ll1.addLast(100);
		System.out.println(ll1);
		
		ll1.add(2,10);
		System.out.println(ll1);
		
		System.out.println(ll1.peek());
		System.out.println(ll1);
		
		System.out.println(ll1.poll());
		System.out.println(ll1);
		
	}

}
