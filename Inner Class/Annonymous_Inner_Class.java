package InnerClass;

interface Car
{
    void drive();
}


public class Annonymous_Inner_Class 
{
    public static void main(String[] args) 
    {
        //Car obj = new car();  //Object creation of interface is not possible
    	Car obj = new Car()
    	{
        public void drive()          //this is annonymous class and it can be used only once.
         {
        	System.out.println("Running with avg " );
         }
    	};
    
        obj.drive();

       
    }
}



