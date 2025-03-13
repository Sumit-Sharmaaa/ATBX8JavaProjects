package CORE_JAVA.JAVA23_WrapperClass;

public class Lab89 {
    public static void main(String[] args) {
        int a =10;
/*
* Wrapper classes in Java are essential component that allows primitive dataTypes to
be treated as objects

* Types of Wrapper Classes :-
byte --> Byte, short -->Short, int --> Integer, long --> Long, float-->Float
double-->Double, boolean-->Boolean, char-->Character.

* Why used - In collection Framework only classes and objects and not primitive datatypes
 are used that's why we use wrapper class
*




  */

// Java is not pure oops since primitive data types just have attributes and not behaviour like objects
// That's why Integer like Wrapper classes are used

        Integer b = a;    // boxing
        System.out.println(b);
        System.out.println(Integer.MIN_VALUE); // Methods of Integer Class
        System.out.println(Integer.MAX_VALUE); // Integer class is static class that's y methods are called using class name only

        Integer a2 = 42;
        int value =a2;  // Unboxing
        System.out.println(value);
    }
}
