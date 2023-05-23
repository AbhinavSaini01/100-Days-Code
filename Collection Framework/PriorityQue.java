package Collection;
import java.util.*;

public class PriorityQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		PriorityQueue pq= new PriorityQueue(); 
		
		pq.add(100);  //internally it follow min heap data structure to store elements.
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		
		System.out.println(pq);
		 
		pq.add(25); //duplicacy  is allowed
		System.out.println(pq);
	}

}
