package CORE_JAVA.JAVA29_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab116_HashMap_Fxn_Iterate {
    public static void main(String[] args) {
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        Map<String,Integer> map1 = new HashMap<>();
//        Map<String,Integer> map2 = new HashMap(); // All three are same

        Map<String,Integer> map = new HashMap();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id2",34);
        map.put("id4",null); //null value is allowed
        map.put("id5", null); // multiple null keys have values as null.
        map.put(null,100); // only one null key is allowed
        map.put(null,200); // above null key will get override.

        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(null));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id2"));
        System.out.println(map.get(7)); // will return null, since get is used to get value through valid key

        // To Iterate

        for (Map.Entry<String,Integer> item: map.entrySet())
        {
            System.out.println(item.getKey() + "-->" + item.getValue());
        }



    }
}
