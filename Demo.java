class A{
    public A() {
        System.out.println("Constructor of A");
    }
    public A(int a) {
        System.out.println("Constructor of A with a");
    }
}

class B extends A{
    public B() {
        System.out.println("Constructor of B");
    }
    public B(int a) {
        super(a);
        System.out.println("Constructor of B with a");
    }
    public Boolean bb(int a){
        System.out.println("in bb");
        return a==0;
    }
}

public class Demo {
    public static void main(String[] args) {
        // B obj = new B();
        B obj = new B(0);
        System.out.println(obj.bb(0));
    }
}
