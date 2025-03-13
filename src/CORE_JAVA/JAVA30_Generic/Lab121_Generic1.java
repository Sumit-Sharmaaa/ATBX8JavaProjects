package CORE_JAVA.JAVA30_Generic;

public class Lab121_Generic1 {
    public static void main(String[] args) {
        temp(12);
        temp(true);
        temp("Pramod");
        // T - Ref - It can be anything.

    }

    public static <T> void temp(T a) {
        System.out.println(a);
    }
}
