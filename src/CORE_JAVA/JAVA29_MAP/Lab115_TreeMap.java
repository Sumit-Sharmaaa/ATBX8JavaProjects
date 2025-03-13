package CORE_JAVA.JAVA29_MAP;

import java.util.Map;
import java.util.TreeMap;

public class Lab115_TreeMap {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put("Name","Sumit"); // put works like add fxn, contains Key and value pair
        map.put("Roll_No",007);
        map.put("Phone_No",954000464);

        System.out.println(map);
    }
}
