package Collection;
import java.util.*;

public class TREESET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		
		System.out.println(ts.higher(50)); //give upper element
		System.out.println(ts.lower(50));  //give lower element
		
		System.out.println(ts.ceiling(40)); //we use ceiling ,floor functions for elements which are not present in data set 
		System.out.println(ts.floor(40));
		
		System.out.println(ts.ceiling(50)); // not work for which elements are already inserted.
		System.out.println(ts.floor(50));
		
		
		
	}

}
