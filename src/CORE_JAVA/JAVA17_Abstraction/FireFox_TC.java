package CORE_JAVA.JAVA17_Abstraction;

public class FireFox_TC extends BaseClass{

    @Override
    void openBrowser(String browser) {
        System.out.println("Open the FireFox Browser");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close the FireFox Browser");
    }
}
