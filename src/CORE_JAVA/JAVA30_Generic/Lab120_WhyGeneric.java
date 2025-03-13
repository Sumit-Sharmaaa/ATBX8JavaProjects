package CORE_JAVA.JAVA30_Generic;

public class Lab120_WhyGeneric {

    // Here we can only use one Datatype
    public static void temp(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        //temp(12); // cannot use Int
        temp("Pramod");

        // Math.max is a generic function which we often use
        Math.max(1,2); // int
        Math.max(1.3,2.4); // double
        Math.max(1.33f,2.45f); //float
        Math.max(2345643l,325432l); //long
        System.out.println(Math.max(2345643l,325432l));

    }

}
