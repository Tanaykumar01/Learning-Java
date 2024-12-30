class Computer {
    int ram;
    public Computer() {
        System.out.println("Constructor of Computer");
    }
    public void playMusic() {
        System.out.println("Playing Music");
    }


    public String getPen() {
        return "Pen";
    }

    public void setPen(String pen) {
        System.out.println("Pen");
    }
}

class Students{
    int rollNo;
    String name;
    int Marks;
}

public class Hello {
    public static void main(String[] args) {
        StringBuffer hello = new StringBuffer("Hello World !");
        hello.append(" How was your day? Well I hope.");
        // String h = "Hello World";
        // hello = "Hello World";
        // System.out.println(hello);
        System.out.println(hello.capacity());
        Students s1 = new Students();
        s1.rollNo = 1;
        s1.name = "Rahul";
        s1.Marks = 90;
        Students s2 = new Students();
        s2.rollNo = 2;
        s2.name = "Tanay";
        s2.Marks = 101;
        Students s3 = new Students();
        s3.rollNo = 3;
        s3.name = "Pinku";
        s3.Marks = 20;
        Students s[] = {s1 , s2 , s3};
        for (Students i : s) {
            System.out.println(i.rollNo + " " + i.name + " : " + i.Marks);
        }
        
    }
}