package CORE_JAVA.JAVA19_Interfaces.Default_n_Static_Method_in_Interface;

public class Lab80 {
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.start();
        abc.stop();
        abc.ss();
    }
}

class ABC implements I1{

    @Override
    public void start() {
        I1.super.start(); // doubt --> same is not applicable with stop and ss function
        System.out.println("ABC Method - start");
    }

    @Override
    public void stop() {
        System.out.println("ABC Method - stop");
    }
    static void ss(){
        System.out.println("ABC Method - ss");
    }
}

interface  I1 {
    default void start(){
        System.out.println("I am having method body even in Interface becoz i'm default method");
    }
    void stop();

    static void ss(){
        System.out.println("I am having method body even in Interface becoz i'm static method ");
    }
}
