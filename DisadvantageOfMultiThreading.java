class Printer implements Runnable{
    synchronized public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " printing started");
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is printing");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Some problem occured");
            }
        }
        System.out.println(name + " completed the printing");
    }
}
public class DisadvantageOfMultiThreading {
    public static void main(String[] args) {
        Printer p = new Printer();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);
        t1.setName("Rachitha");
        t1.setName("Padmavani");
        t1.setName("Hazeera");
        t1.start();
        t2.start();
        t3.start();
    }
}
