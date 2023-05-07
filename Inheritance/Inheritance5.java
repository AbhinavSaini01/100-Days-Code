package Inheritance;


class AeroPlane  //parent class
{
    public void takeOff()  //This method is inherited in both class.
    {
        System.out.println("AeroPlane is taking off");  
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}


class CargoPlane extends AeroPlane  //child class 1
{
   public void fly()  //overridden method
   {
    System.out.println("Cargoplane flies at lower height");
   }
    public void carryGoods()  //specialize method
    {
        System.out.println("CargoPlane carries goods");
    }
}


class PassengerPlane extends AeroPlane  //child class 2
{
    public void fly()   //overridden method
    {
    System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger()  //specialize method
    {
        System.out.println("PassengerPlane carries passenger");
    }

}


class Inheritance5
{
    public static void main(String[] args) 
    {
        CargoPlane cp=new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp=new PassengerPlane();
        pp.takeOff();
        pp.fly();
       
        
    }
}