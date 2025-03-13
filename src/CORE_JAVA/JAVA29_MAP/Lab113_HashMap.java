package CORE_JAVA.JAVA29_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab113_HashMap {
    public static void main(String[] args) {
        // name:Sumit, roll_no:7, Phone:9540004643
        Map map = new HashMap();
        map.put("Name","Sumit"); // put works like add fxn, contains Key and value pair
        map.put("Roll_No",007);
        map.put("Phone_No",954000464); // order will not get maintained

        System.out.println(map);


    }
}
