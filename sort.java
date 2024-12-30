import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sort {
    public static void main(String[] args){
        List<Integer> obj = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++){
            obj.add(scanner.nextInt());
        }
        scanner.close();
        // obj.sort(null);
        Collections.sort(obj);

        System.out.println(obj);
    }
}
