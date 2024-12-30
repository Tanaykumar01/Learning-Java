import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class array {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int arr3[] = new int[n];
        // for(int i=0; i<n; i++){
        //     arr3[i] = scanner.nextInt();
        // }
        // scanner.close();
        // for(int i=0; i<n; i++){
        //     System.out.print(arr3[i] + " ");
        // }
        // List<Integer> obj = new ArrayList<Integer>();
        // obj.add(1);
        // obj.add(2);
        // obj.add(3);
        // obj.add(4);
        // obj.add(5);
        // obj.add(2);
        Set<Integer> obj = new TreeSet<Integer>();
        obj.add(81);
        obj.add(62);
        obj.add(43);
        obj.add(94);
        obj.add(88);
        obj.add(72);
        // for(int i = 0; i < 6; i++){
        //     System.out.println(obj.get(i));
        // }
        for (int n : obj) {
            System.out.println(n);
        }
    }
}
