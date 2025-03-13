package CORE_JAVA.JAVA20_Static_Keyword.IIB_n_SIB;

public class Lab83_IIB_vs_SIB {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        new A();
        A a3;
    }
}
class A{

    {
        System.out.println("IIB");
    }
    static{
        System.out.println("SIB");
    }

}

/*
        OUTPUT should be

SIB (Will come once since it gets called during class loading and class gets loaded only once)
IIB
IIB
IIB

 */
