package CORE_JAVA.JAVA16_This_Super_Keyword.Eg2_All_in_One;

public class Lab75_MainRunnerClass {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1(); // Dynamic Dispatching
        t1.openBrowser();
        t1.openBrowser("edge");
        t1.closeBrowser();
        System.out.println("__________________________________________________________");

        BaseClass t2 = new BaseClass();
        t2.openBrowser();
        t2.openBrowser("mozilla");
        t2.closeBrowser();
        System.out.println("__________________________________________________________");

        TestCase1 t3= new TestCase1();
        t3.openBrowser();
        t3.openBrowser("chrome");
        t3.closeBrowser();



 // Dynamic Dispatching --> Father Reference but child object, reverse not possible


    }
}
