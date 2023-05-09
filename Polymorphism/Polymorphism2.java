package Polymorphism;

class AeroPlane2  //parent class
{
    public void takeOff()
    {
       
        System.out.println("AeroPlane is taking off");
    }

    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}


class CargoPlane2 extends AeroPlane2  //child class
{
    public void takeOff()  //override
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()  //override
   {
    System.out.println("Cargoplane flies at lower height");
   }  
}


class PassengerPlane2 extends AeroPlane2  //child class
{
    public void takeOff()  //override
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()  //override
    {
    System.out.println("PassengerPlane flies at medium height");
    }
}


class FighterPlane2 extends AeroPlane2  //child clss
{
    public void takeOff()  //override
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()  //override
    {
    System.out.println("FighterPlane flies at high height");
    }
}

class Airport  //new class
{
    public void poly(AeroPlane2 ref)  //parent type reference in argument cz in can hold address of object of all child classes.
    {
        ref.takeOff();  //invoke method of child class
        ref.fly();      //invoke method of child class

        System.out.println("-------------------------------------");
    }
}

public class Polymorphism2
{

    public static void main(String[] args) 
    {
       CargoPlane2 cp=new CargoPlane2();
        
        PassengerPlane2 pp=new PassengerPlane2();

        FighterPlane2 fp=new FighterPlane2();

        Airport a=new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
    
}