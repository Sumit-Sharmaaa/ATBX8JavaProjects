package CORE_JAVA.JAVA29_MAP;


import java.util.LinkedHashMap;
import java.util.Map;

public class Lab114_LinkedHashMap {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put("Name","Sumit"); // put works like add fxn, contains Key and value pair
        map.put("Roll_No",007);
        map.put("Phone_No",954000464); // order will be Maintained

        System.out.println(map);
    }
}
