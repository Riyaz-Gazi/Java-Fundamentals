package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
//        Map<String,Integer> mp = new HashMap<>();
        Map<String,Integer> mp = new TreeMap<>();

        mp.put("One",1);
        mp.put("Two",2);
        mp.put("Three",3);

//        if(!mp.containsKey("Two")){
//            mp.put("Two",23);
//        }
          // override the value

        mp.putIfAbsent("Two",23);

        System.out.println(mp);


        // Iterate on map
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key:mp.keySet()){
            System.out.println(key);
        }

        for(Integer value: mp.values()){
            System.out.println(value);
        }

        System.out.println(mp.containsKey("Three"));
        System.out.println(mp.containsValue(5));

        System.out.println(mp.isEmpty());

        mp.remove("Three");

        System.out.println(mp);
    }
}
