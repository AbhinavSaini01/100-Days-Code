package Inheritance;

class Animal   //Parent class extends object
{
	int age;
    public void eat()  //method
    {
        System.out.println("Animal eats everyday");
    }
    public void age(int x)  //method
    {
        System.out.println("Animal age is" + age);
    }
    
}

class Tiger extends Animal  //Child class extends parent class
{
   public void eat()
   {
    System.out.println("Tiger hunts and eat");
   }
   
//   public int age()  **we can't input data from child class to parent class it is impossible **
//    {
//     return 10;
//    }
//   
  public void age(int x) //if we have same method in child class then parent class method will not be called**
   {
     
     
   }
    
}


public class Inheritance3 
{
    public static void main(String[] args) 
    {
      Tiger t=new Tiger();
      t.eat();
     t.age(10);
      
      
      
    }   
}

