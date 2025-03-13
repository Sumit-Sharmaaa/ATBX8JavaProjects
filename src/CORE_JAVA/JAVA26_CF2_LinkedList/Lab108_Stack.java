package CORE_JAVA.JAVA26_CF2_LinkedList;

import java.util.Stack;

public class Lab108_Stack {
    /*
1. Stack similarly to Vector is a part of Legacy Classes
2. Stack works on Last in first out (LIFO). Eg: Stack of book
     */
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Sumit");
        s.add("Udit");
        s.add(3);
        s.add(7);
        s.add(null);
        System.out.println(s);

        Stack book= new Stack();
        book.push("C");
        book.push("Java");
        book.push("Python");
        System.out.println(book);
        System.out.println(book.size());

        System.out.println(book.pop());
        System.out.println(book);// always deletes the last added element
        System.out.println(book.peek()); // always gives the last added element(just view doesn't deletes)
        System.out.println(book);
        book.pop(); // delete
        System.out.println(book);
        System.out.println(book.size());
        System.out.println(book.empty());
        System.out.println(book.search("Java"));
        book.add("Java"); // works same like push --> adds at end
        System.out.println(book.search("Java"));
        book.add(0,"C#"); // adds elements at that location and rest gets shifts
        System.out.println(book);

    }
}
