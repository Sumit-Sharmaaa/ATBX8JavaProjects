package CORE_JAVA.JAVA26_CF2_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab107_LinkedList {
    /*
LinkedList:-
1. Linked list allows duplicates and internally implements a doubly linked list data Structure, i.e. storing work is different
2. Elements gets stored non-contagiously internally using node representation.
3. It is fast to insert or delete the elements(because just need to add anode in between) , but slow for accessing the elements.
4. Consumes more memory than an ArrayList because of node structure.
5. Can act as a list and queue both .
6. Linked list is better for data Manipulation, whereas ArrayList is better for storing and accessing data.
     */
    public static void main(String[] args) {
       // LinkedList mylist = new LinkedList();
        List mylist = new LinkedList(); // dynamic dispatching // Linked List
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        System.out.println(mylist);

        Integer[] a = new Integer[5]; // Wrapper class array
        String[] s = new String[6];

        List mylist1 = new ArrayList(); // ArrayList
        mylist.add(1);
        mylist.add(2);

// Eg :- To store, Insert and delete elements in Selenium what should i use :- LL
        // Eg2 - To just access elements in API I should use ArrayList.


    }

}
