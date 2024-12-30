import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args){
        Map<String, Integer> obj = new HashMap<String, Integer>();
        // use hastable for thread safety and synchronized
        obj.put("Navin",52);
        obj.put("Rahul",12);
        obj.put("Rohit",45);
        obj.put("Tanay",52);
        System.out.println(obj);

        for(String key : obj.keySet()){
            System.out.println(key + " : " + obj.get(key));
        }
    }
}
