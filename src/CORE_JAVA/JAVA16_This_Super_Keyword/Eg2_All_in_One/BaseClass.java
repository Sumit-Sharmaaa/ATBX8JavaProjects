package CORE_JAVA.JAVA16_This_Super_Keyword.Eg2_All_in_One;

public class BaseClass {

    private String browser;

    BaseClass(){                                        // Default Constructor
        System.out.println("DC-BaseClass");
    }

    BaseClass(String b){                                // Parameterized Constructor
        System.out.println("PC-BaseClass");
    }

    public String getBrowser() {                            //  Getter
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {// Setter
        if (isAuth) {
            this.browser = browser;
        }
        else {
            System.out.println("Not Allowed-only admin can");
        }
    }

    void openBrowser(){
        System.out.println("Chrome Browser");
    }

    void openBrowser(String browserName){                   // Method Overloading
        System.out.println("Open Browser-->" + browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser!!!");
    }



}
