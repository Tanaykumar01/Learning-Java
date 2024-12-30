class Cal{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a , int b){
        return Math.abs(a-b);
    }
    @Override
    public String toString() {
        return "Cal []";
    }
    
}
// inheritence
// mutiple inheritence is not allowed in java
// but we can achieve it by using interface
class AdvanceCal extends Cal{
    public int mul(int a , int b){
        return a*b;
    }
    public int div(int a , int b){
        return a/b;
    }
}

public class Inheritence {
    public static void main(String a[]){
        AdvanceCal obj = new AdvanceCal();
        int r1 = obj.add(10, 20);
        int r2 = obj.sub(10, 20);
        int r3 = obj.mul(10, 30);
        int r4 = obj.div(r3, r1);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
        System.out.println(obj);
    }
}
