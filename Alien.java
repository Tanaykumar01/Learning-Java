record Students(String name , int age) { }
// record set the equals() and hashCode() methods for us automatically and we can use them to compare objects
// record is a new feature in Java 14
// record is a class that is used to store the state of an object
public class Alien {
    public static void main(String[] args){
        Students s1 = new Students("Alice", 20);
        Students s2 = new Students("Bob", 22);
        Students s3 = new Students("Charlie", 25);
        Students s4 = new Students("Alice", 20);
        System.out.println(s1.equals(s4));
    }
}
