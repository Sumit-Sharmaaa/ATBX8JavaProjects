package CORE_JAVA.JAVA25_CollectionFramework_List;

import java.util.ArrayList;

public class Lab101_ArrayList2 {
    public static void main(String[] args) {

        // Collection - Interface - 10 methods
        // List - Interface - 15 + 10(collections)  = ( 25) Methods
        // ArrayList, LinkedList, Stack and Vector - Class ( can use all above and self methods)


        // Shopping - bread,milk, curd, panneer, buttermilk. , butter
        // Collection of items - with same or different data type.
        // Collections of students -

        ArrayList studentList = new ArrayList();
        studentList.add("Pramod");
        studentList.add("Dutta");
        studentList.add("Dutta"); // Duplicate is allowed.
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true); // Different data type is allowed.
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);


        // Integer[] names = new Integer[5]; - Fixed, Same Data Types

    }
}
