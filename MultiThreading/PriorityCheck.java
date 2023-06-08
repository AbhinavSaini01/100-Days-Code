package MultiThreading;

public class PriorityCheck {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        
        thread1.setPriority(Thread.MIN_PRIORITY);  // Lowest priority (1)
        thread2.setPriority(Thread.MAX_PRIORITY);  // Highest priority (10)
        
        thread1.start();
        thread2.start();
    }
    
    static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is running.");
            }
        }
    }
}

