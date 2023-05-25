package Map;

import java.util.*;

public class Map1 
{
    public static void main(String[] args) 
    {
        
        HashMap hm1=new HashMap();
        hm1.put(null, null);
        hm1.put(02, "Rohit");//Entry
        hm1.put(03, "Rohan");
        hm1.put(04, "Rohan");
        //hm1.put(04, "Rohan");
        hm1.put("Virat", "Rohit");

        System.out.println(hm1);

         LinkedHashMap lhm=new LinkedHashMap();
        
         lhm.put("Virat", "Rohit");//Entry
         lhm.put("Rohit", "Rohan");
         lhm.put("Hyder", "Rohan");
         lhm.put(01, "Rohan");
         //lhm.put(01, "Rohan");
        
 
         System.out.println(lhm);

        
    }
    
}

