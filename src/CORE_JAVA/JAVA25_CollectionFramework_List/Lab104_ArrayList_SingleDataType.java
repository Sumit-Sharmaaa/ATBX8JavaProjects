package CORE_JAVA.JAVA25_CollectionFramework_List;

import java.util.ArrayList;
import java.util.List;

public class Lab104_ArrayList_SingleDataType {
    public static void main(String[] args) {
      //  List l = new ArrayList(); // This allows all datatypes
      //  List <int> l = new ArrayList();   // Not allowed only Wrapper Class allowed
            List <Integer> l  = new ArrayList<>();
            l.add(1);
            // l.add("1"); // not allowed to store string
        //   l.add("Sumit");
        System.out.println(l);

        List<String> names = new ArrayList();
        names.add("sumit");
        names.add("chunnu");
        // names.add(234);
        System.out.println(names);


    }
}
