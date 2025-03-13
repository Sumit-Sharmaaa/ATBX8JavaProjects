package CORE_JAVA.JAVA27_CollectionFrameWork3_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab111_Hash_LinkedHash_Tree_Sets {
    public static void main(String[] args) {

        Set hs = new HashSet(); // Hashing mechanism to store the element, random order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet(); //LinkedList mechanism to store the element,order will be maintained
        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        Set ts = new TreeSet(); // Black and Red Tree mechanism to store the element,
        // order will maintain, Natural Sorting is done.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
       //  ts.add(123); // java.lang.ClassCastException --> now no's can't be added as earlier string are stored
        ts.add("WaterMelon");
//        ts.add(null); // java.lang.NullPointerException --> can't sort null
        System.out.println(ts);

        Set ts1 = new TreeSet();
        ts1.add(123);
        ts1.add(456);
        //ts1.add("Sumit"); //java.lang.ClassCastException --> --> now string can't be added as earlier no's are stored
        ts1.add(98);
        System.out.println(ts1);

        /*
        Hashing Mechanism :-
        Hashtable --> Key and value pair
        key - unique value for index, value - value u want to store

        For eg :- Modulus(/10) function is used to store in HashSet.
        values to store - 11,12,13,14
        so 11 will be stored like 11/10 , quotient is 1 so at 1 place 11 will be stored.
        12/10, quotient is 2, so at place 2 , 12 will be stored
        that's why only if I want to store 12 again its get overriden
        (No duplicates are allowed)

        Above ex is just for understanding however heavy algorithm are used like SHA256, md5 etc.
         */

    }
}
