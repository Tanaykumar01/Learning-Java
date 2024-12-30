class A{
    public A(){
        System.out.println("constructor in B");
    }
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}

public class InnerClass {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}
