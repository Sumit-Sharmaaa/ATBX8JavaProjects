package CORE_JAVA.JAVA19_Interfaces.Example_2;

public class Lab79 {
    public static void main(String[] args) {
        XYZ xyz = new XYZ();
        xyz.display();

    }
}

class ABC implements I1{

    @Override
    public void f1() {
        System.out.println("F1 present in ABC Class");
    }

    @Override
    public void f2() {
        System.out.println("F2 present in ABC Class");
    }
}

class XYZ {
    void display(){
        new ABC().f1();
        new ABC().f2();
    }
}

interface I1{
    void f1();
    void f2();
}
