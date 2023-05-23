package Collection;
import java.util.*;

public class HASHSET
{

	public static void main(String[] args)
	{

		 
		HashSet hs=new HashSet(); 
		
		hs.add(100);   //data str.= Hash table 
		hs.add(20);  //insertion order not preserved
		hs.add(30);
		hs.add(40);
		
		System.out.println(hs);
		
		LinkedHashSet hs1= new LinkedHashSet();
		hs1.add(100);  //data str = hash table + linkedlist
		hs1.add(20);   //insertion order is preserved
		hs1.add(30);
		hs1.add(40);
		
		System.out.println(hs1);
	}

}




