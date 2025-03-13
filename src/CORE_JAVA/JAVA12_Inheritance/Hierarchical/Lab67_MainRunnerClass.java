package CORE_JAVA.JAVA12_Inheritance.Hierarchical;

public class Lab67_MainRunnerClass {
    public static void main(String[] args) {

        System.out.println("Son can Access only :-");
        Son s1 = new Son();
        s1.car();
        System.out.println(s1.stocks);
        s1.Fathers_House();
        System.out.println(s1.Cash);
       // s1.jewelery();
        System.out.println();

        System.out.println("Daughter can only access");
        Daughter d1 = new Daughter();
        d1.jewelery();
        System.out.println(d1.fd);
        d1.Fathers_House();
        System.out.println(d1.Cash);

        System.out.println();
        System.out.println("Father can only access");
        Father f1 = new Father();
        f1.Fathers_House();
        System.out.println(f1.Cash);

    }
}
