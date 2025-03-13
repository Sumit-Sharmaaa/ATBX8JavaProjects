package CORE_JAVA.JAVA12_Inheritance.MultiLevelInheritance;

public class Lab66_MainRunnerClass {
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println("Son can Access :- ");
        System.out.println(s1.Diamond);
        System.out.println(s1.gold);
        System.out.println(s1.Silver);
        s1.GHouse();
        s1.FHouse();
        s1.SHouse();

        System.out.println();
        System.out.println("Father Can access :-");
        Father f1 = new Father();
        System.out.println(f1.Diamond);
        System.out.println(f1.gold) ;
        // System.out.println(f1.Silver); // Not Possible
        f1.GHouse();
        f1.FHouse();
        // f1.SHouse(); // Not Possible

        GrandFather G1 = new GrandFather();
        System.out.println();
        System.out.println("GrandFather can access :-");
        System.out.println(G1.Diamond);
        G1.GHouse();




    }
}
