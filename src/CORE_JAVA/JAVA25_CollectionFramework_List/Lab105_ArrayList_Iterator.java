package CORE_JAVA.JAVA25_CollectionFramework_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab105_ArrayList_Iterator {
    public static void main(String[] args) {
    List<String> list = new ArrayList();
    list.add("Sumit");
    list.add("Neha");
    list.add("Udit");
    list.add("Pramod");

        System.out.println("1). To Print ArrayList - using For Each");
        for(String str: list){
            System.out.println(str);
        }

        System.out.println("___________________________________________");

        System.out.println("2). To Print ArrayList - using For each(2)");
        for(Object o: list){
            System.out.println(o);
        }

        System.out.println("____________________________________________");

        System.out.println("3). To print ArrayList - using for Loop");
        for(int i =0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("_______________________________________________");

        System.out.println("4). To Print ArrayList - using Iterator");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());


            //Iterator is used to print every collection framework i.e. it works with every CF.
       // For each loop is just used to print Lists and doesnt works with Sets,Queue, Maps etc.
        }
    }
}
