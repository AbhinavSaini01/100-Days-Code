package Map;
import java.util.*;

public class Generics1
{

    public static void main(String[] args) 
    {
        //typesafety
        // String ar[]=new String[10];  *array*
        // ar[0]="Hyder";
        // ar[1]="PW";
        // //ar[2]=10;  *compileTime Error*

        // String name1=ar[0];
        // String name2=ar[1];

        //No typsesafety
        //Typesafety achived using generics
        ArrayList<String> al=new ArrayList<String>();

        al.add("Hyder");
        al.add("PW");

        //al.add(10); *after applying generics we can't add integer to string* 

        // String n1=(String)al.get(0); //typecasting
        // String n2=(String)al.get(1);
        // String n3=(String)al.get(2);

        String name1 =al.get(0);
        String name2 =al.get(1);
        
        System.out.println(name1);
        System.out.println(name2);


    }
    
}


 

