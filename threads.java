class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){

            System.out.println("A");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("B");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        // lemda expression to create a thread
        // lemda 
        Runnable obj3 = () -> {
                for(int i=0;i<5;i++){
                    System.out.println("C");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj3);
        obj2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        obj2.start();
        t2.start();
    }
}
