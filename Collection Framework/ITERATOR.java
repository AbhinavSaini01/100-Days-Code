package Collection;
import java.util.*;

public class ITERATOR {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		System.out.println("*********************");
		
		Iterator itr= al.iterator();  //valid for all type of collection objects 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("*********************");
		
		ListIterator litr = al.listIterator(al.size());  //valid for only list type of objects
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		

	}

}
