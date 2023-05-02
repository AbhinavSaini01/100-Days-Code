package LaunchSatic;
import java.util.Scanner;

class Loan
{
	int pa;
	float td;
	float si;
	static float ri;
	
	static
	{
		ri=.5f;
	}
	
void input()
{
	Scanner S =new Scanner(System.in);
	System.out.println("please mention the amount required");
	pa=S.nextInt();
	System.out.println("please mention time duration");
	td = S.nextFloat();
}
void compute()
{
	si=(pa*ri*td)/100f;
}
void disp()
{
	System.out.println("SI is :"+ si);
}
}
public class Farmer {
	
	public static void main(String [] args)
	{
		Loan F1 = new Loan();
		F1.input();
		F1.compute();
		F1.disp();
		

		Loan F2 = new Loan();
		F2.input();
		F2.compute();
		F2.disp();
		
		
	}
}
