package CORE_JAVA.JAVA25_CollectionFramework_List;

import java.util.ArrayList;
import java.util.List;

public class Lab100_ArrayList {
    public static void main(String[] args) {
        // List list  = new List();
        List list = new ArrayList(); // Dynamic dispatching
        list.add("1");
        list.add("2");
        System.out.println(list);
        System.out.println(list.size());
        list.add("3");
        list.add(4);
        list.add(4); // In List/ArrayList duplicates are allowed, in Sets not allowed
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty()); // false
        System.out.println(list.contains(1)); // false, string "1"
        System.out.println(list.contains("1")); // true, string
        System.out.println(list.contains("4"));
        System.out.println(list.contains(4));
        System.out.println(list.indexOf("1")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("3")); //find the first occ of element in list
/*
ArrayList allows duplicates and it is implemented as a resizable array.
ArrayList elements will be stored internally using indexing notation.
This is one of the most widely used concrete class.
It is fast to access the elements.
It is fast to access the elements, but slow to insert and delete the elements

Vector:-
Is a part of Legacy class.
Same points as above the only difference is it is Synchronized i.e. thread Safe.
That's why it is slow
 */
    }
}
