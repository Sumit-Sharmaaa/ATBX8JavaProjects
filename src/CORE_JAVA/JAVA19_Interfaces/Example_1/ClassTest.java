package CORE_JAVA.JAVA19_Interfaces.Example_1;

import CORE_JAVA.JAVA19_Interfaces.Example_1.I1;

public class ClassTest implements I1,I2 {

    @Override
    public void show() {
        System.out.println("Show function calling in ClassTest Class");
    }

    @Override
    public void display() {
        System.out.println("Display Function calling in ClassTest Class");
    }
}


