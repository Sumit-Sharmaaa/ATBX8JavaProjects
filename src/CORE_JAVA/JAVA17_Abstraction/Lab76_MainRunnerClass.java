package CORE_JAVA.JAVA17_Abstraction;

public class Lab76_MainRunnerClass {
    public static void main(String[] args) {

        Chrome_TC c = new Chrome_TC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");

        FireFox_TC f = new FireFox_TC();
        f.openBrowser("firefox");
        f.closeBrowser("firefox");

    }
}
