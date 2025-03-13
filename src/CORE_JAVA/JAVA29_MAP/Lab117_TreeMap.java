package CORE_JAVA.JAVA29_MAP;

import java.util.Map;
import java.util.TreeMap;

public class Lab117_TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",7);
        map.put("id4",null); //null value is allowed
        map.put("id5", null); // multiple null keys have values as null.
        //map.put(null,100); // Null key is not allowed in TreeMap.

        System.out.println(map); // will be in order

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(null));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id2"));
      //  System.out.println(map.get(7)); //Will give error, since null is not allowed in treeSet

        // To Iterate

        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey()+ " --> " + item.getValue());
        }

    }
}
