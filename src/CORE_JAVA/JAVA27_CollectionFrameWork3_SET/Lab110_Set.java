package CORE_JAVA.JAVA27_CollectionFrameWork3_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab110_Set {
    public static void main(String[] args) {

  // List --> Duplicates are allowed
  // Set --> Duplicates are not allowed , doesn't uses indexation.

        Set hashSets = new HashSet(); // HashSet
        Set linkedHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();

        hashSets.add("Sumit");
        hashSets.add("Neha");
        hashSets.add("Udit");
        hashSets.add("Sumit"); // will not get added in Set
        hashSets.add("neha"); // Case-sensitive , will get added
        System.out.println(hashSets);

        /*
        Command to see all the functions available in sets(Run in CMD , make sure JDK is installed)
        javap java.util.Set
         */


    }
}
