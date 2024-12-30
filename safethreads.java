class Counter {
    int count;
    // synchronized keyword is used to make the method thread safe
    public synchronized void increament() {
        count++;
    }
}

public class safethreads {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 0; i < 100000; i++) {
                c.increament();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 100000; i++) {
                c.increament();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
