package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test_3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Franka");
        map.put(30, "Goran");
        map.put(21, "Edi");
        map.put(90, "Divna");
        map.put(43, "Franka");
        System.out.println(map);
        //printMapElements(map);
        printMapElements2(map);
        //Set<Integer> keys = getKeysForValue(map, "Franka");
        Set<Integer> keys = getKeysForValue2(map, "Franka");
        System.out.println(keys);
    }


    private static void printMapElements(HashMap<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
    }

    private static <K, V> void printMapElements2(HashMap<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + map.get(key));
        }
    }

    private static Set<Integer> getKeysForValue(HashMap<Integer, String> map, String value) {
        Set<Integer> keys = new HashSet<>();
        for (Integer key : map.keySet()) {
            if (map.get(key).equals(value)) {
                keys.add(key);
            } else {
                continue;
            }
        }
        return keys;
    }

    private static <K, V> Set<K> getKeysForValue2(HashMap<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (K key : map.keySet()) {
            if (map.get(key).equals(value)) {
                keys.add(key);
            } else {
                continue;
            }
        }
        return keys;
    }
}
