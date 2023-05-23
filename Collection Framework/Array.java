package Collection;

import java.util.*;
public class Array
{
    public static void main(String[] args) 
    {
        
        ArrayList al1=new ArrayList();

        al1.add(100);  //adding elements in arraylist
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        System.out.println(al1.contains(200)); //checking it contains 200 or not

        int index=al1.indexOf(300);  //getting index of 300
        System.out.println(index);
        System.out.println(al1.size());  //printing size acquired by al1

        al1.ensureCapacity(10); //giving size of 10 to al1
        System.out.println(al1.size());
        al1.trimToSize(); //resizing al1 .removing extra size 
        System.out.println(al1.size());

        al1.clear();  //deleting all data of al1
        System.out.println(al1);

        List al=new ArrayList();

        al.add(100);  //adding a element
        System.out.println(al);
        

         System.out.println("****************************************");

         ArrayList al2=new ArrayList();

         al2.add("PW Skills");  //heterogenous element insertion
         al2.add(1);
         al2.add('j');
         al2.add(1.1);
        
         System.out.println(al2);

         System.out.println("****************************************");


         ArrayList al3=new ArrayList();

         al3.add(1);  //checking order of insertion is maintained or not
         al3.add(2);
         al3.add(4);
         System.out.println(al3);

         System.out.println("After adding collection 2 in collection 3");

         al3.addAll(al2);  //adding al2 elements in al3 elements 
         System.out.println(al3);

         al3.add(2, "PW");  //putting PW on 2nd index in al3 , rest of elements will get shifted

         System.out.println(al3);
         al3.add(100);  

         System.out.println(al3);



        
    }
    
}

