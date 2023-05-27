import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
        int out,in,p;
	    System.out.println("Enter the row size:");
	    int row_size=cs.nextInt();
	    for(out=row_size;out>=-row_size;out--)
	    {
	     for(in=1;in<=Math.abs(out);in++)
	      System.out.printf(" ");
	    for(p=Math.abs(out);p<=row_size;p++)
	     System.out.print(p);
	    System.out.println();
	    }
	    cs.close();
	}
}
