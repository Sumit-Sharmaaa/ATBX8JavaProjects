package CORE_JAVA.JAVA12_Inheritance.SingleLevel;

public class Lab65_RunnerClass {
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println(s1.Silver);
        s1.SonHouse();

        // below lines only works if Son Class extends Father Class
        System.out.println(s1.gold);
        s1.FatherHouse();
    }
}
