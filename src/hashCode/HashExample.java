package hashCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 11);
        map.put(4, 11);
        map.put(2, 11);
        System.out.println(map.hashCode());
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        map1.put(1, 11);
        map1.put(4, 11);
        System.out.println(map1.hashCode());
        if (map.equals(map1)) {
            System.out.println("equal ");
        } else {
            System.out.println("Not equal");
        }
    }
}
