package Inheritance;


//final class Animal1     **because of final keyword this method can't participate in inheritance**
//{
//  void sleep()
//  {
//      System.out.println("Animal is sleeping");
//  }
//}


class Animal1
{
 final int age=19;  //variable become constant here due to final keyword
 final void sleep()
 {
     //age=20;  **value of variable can't be changed because it it constant**
     System.out.println("Animal is sleeping");
 }
}

     
class Tiger1 extends Animal1
{
 // void sleep()  **we cannot override any final method in child class**
 // {

 // }
}


public class Final_Keyword 
{
 public static void main(String[] args) 
 {

     Tiger1 t=new Tiger1();
     t.sleep();
 }
 
}
