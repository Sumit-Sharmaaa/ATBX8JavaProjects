package CORE_JAVA.JAVA29_MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab119_HashTable {
 /*
 HashTable - Similar to HashMap, only difference --> no null key and value allowed, Synchronised, slow.
 It is a Legacy Class.
 To iterate HashTable ENUMERATION is used.
  */
 public static void main(String[] args) {

     Hashtable<Integer, String> hashtable = new Hashtable<>();
     hashtable.put(1,"one");
     hashtable.put(2,"two");
//     hashtable.put(null,"three"); // not allowed, will throw error
//     hashtable.put(4,null); // not allowed, will throw error

     System.out.println(hashtable);

// To Iterate
     Enumeration<Integer> e = hashtable.keys();
     while (e.hasMoreElements()){
         System.out.println(hashtable.get(e.nextElement()));
     }



     Map<Integer,String> map = new HashMap();
     map.put(1,"one");
     map.put(2,"two");
     map.put(null,"three");
     map.put(4,null);

     System.out.println(map);
 }
}
