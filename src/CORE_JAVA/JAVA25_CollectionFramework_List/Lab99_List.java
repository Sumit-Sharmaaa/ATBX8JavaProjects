package CORE_JAVA.JAVA25_CollectionFramework_List;

import java.util.List;

public class Lab99_List {
    public static void main(String[] args) {
      //  List list = new List(); not possible since list is interface,but there is another way in 100th Lab
        List list = List.of("banana","apple","grapes");
        System.out.println(list);
        System.out.println(list.size());
     //   list.add("guava"); //-->UnsupportedOperationException
        // but can be done by another way in Lab 100th with dynamic dispatching

    }
}
