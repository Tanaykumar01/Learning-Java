import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Students implements Comparable<Students>{
    String name;
    int rollno;
    public Students(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public String toString() {
        return "Students [name=" + name + ", rollno=" + rollno + "]";
    }
    public int compareTo(Students that){
        return this.rollno > that.rollno ? 1 : -1;
    }
    
}
public class Compare {
    public static void main(String[] args){
        Comparator<String> obj = new Comparator<String>() {
            public int compare(String a, String b){
                if(a.length() > b.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        List<String> obj1 = new ArrayList<>();
        obj1.add("Navinkk");
        obj1.add("Sheetal");
        obj1.add("Rohit");
        obj1.add("TanayKumar");
        Collections.sort(obj1 , obj);
        // System.out.println(obj1);
        List<Students> studs = new ArrayList<>();
        studs.add(new Students("Navink", 52));
        studs.add(new Students("Rahulku", 12));
        studs.add(new Students("Rohitkuma", 45));
        studs.add(new Students("Tanaykum", 100));
        studs.add(new Students("Sheetal", 88));
        Collections.sort(studs, new Comparator<Students>(){
            public int compare(Students a, Students b){
                if(a.rollno > b.rollno){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        // Collections.sort(studs);
        for(Students s : studs){
            System.out.println(s);
        }
    }
}
