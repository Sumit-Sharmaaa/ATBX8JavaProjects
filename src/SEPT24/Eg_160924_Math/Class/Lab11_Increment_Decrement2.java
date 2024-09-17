package SEPT24.Eg_160924_Math.Class;

public class Lab11_Increment_Decrement2 {
    public static void main(String[] args) {
        int a = 10;
        int increment = ++a + a++ + a++;
        System.out.println(increment); // 11+11+12 = 34
        System.out.println(a);// 13

        int b = 10;
        int decrement = --b + b++ + ++b;
        System.out.println(decrement); //9+9+11 = 29
        System.out.println(b); //b = 11
    }
}
