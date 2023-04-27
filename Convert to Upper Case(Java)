
    import java.util.*;
public class stringlowtoupp
       {
    
  public static void main (String[]args)
  {
    ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    System.out.println("Java program to convert Vowel into uppercase");
    try (Scanner sc = new Scanner (System.in)) {
        System.out.println ("Please enter a String");
        String str = sc.nextLine();
        StringBuffer strBuffer = new StringBuffer(str); 
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i)) && arr.contains(str.charAt(i))) {  
                    strBuffer.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
            }
        }
        System.out.println("After Conversion Vowel into uppercase");
        System.out.println(strBuffer);
    }
  }
}

