package MultiThreading;

class Alpha implements Runnable 
{

    public void run() 
    {
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(name);
           
            Thread.yield();  /* A yield() method is a static method of Thread class and 
            				 it can stop the currently executing thread and will give 
            				 a chance to other waiting threads of the same priority	*/
        }
    }
}

class Beta implements Runnable{

    public void run()
    {
        String name=Thread.currentThread().getName();
       
            for(int i=0;i<3;i++)
            {
            System.out.println(name);
            
            }
       
    }
}

public class  MultiThreading11
{
    public static void main(String[] args) 
    {
        Alpha a=new Alpha();
        Beta b=new Beta();
     

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        


        t1.setName("ALPHA");
        t2.setName("BETA");
       

       

        t1.start();
        t2.start();
      

        
    }
    
}

