package CORE_JAVA.JAVA29_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab118_Students_Data_Using_Map_List {
    public static void main(String[] args) {
        HashMap<String,String> student1 = new HashMap<>();
        student1.put("name","Sumit");
        student1.put("rollno","007");
        student1.put("phone","098769");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap<>();
        student2.put("name","Amit");
        student2.put("rollno","67");
        student2.put("phone","898769");
        System.out.println(student2);

        List students = new ArrayList(); // Storing the student map data in List
        students.add(student1);
        students.add(student2);

        System.out.println(students);

    }
}
