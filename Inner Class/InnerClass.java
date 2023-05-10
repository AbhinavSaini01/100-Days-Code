package InnerClass;


class A
{

    public void show()
    {
        System.out.println("in A show");
    }
    static class B  //static class inside class A
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();  //Object creation of inner class B
        obj1.display();
    }
}

