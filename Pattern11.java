import java.util.Scanner;
public class Pattern11 {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);

     System.out.println("Enter the row size:");
     int row_size=cs.nextInt();
     for(int out=row_size;out>=-row_size;out--)
     {
      for(int in=1;in<=Math.abs(out);in++)
       System.out.printf(" ");
     for(int p=row_size;p>=Math.abs(out);p--)
      System.out.printf("*");
     System.out.println();
     }
     cs.close();
 }

}