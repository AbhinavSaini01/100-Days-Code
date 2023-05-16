package Interface;

@FunctionalInterface
interface Car
{
	//void drive();   **No paramter syntax**
	void drive(int avg,int ts);    //two parameter syntax
}

public class LambdaExpression {

	public static void main(String[] args) 
	{
		//Car obj = () -> System.out.println("driving");
		//obj.drive();
		
		Car obj= (avg,ts) -> System.out.println("Driving"+ avg + ts);
		obj.drive(200,150);	
	}

}
