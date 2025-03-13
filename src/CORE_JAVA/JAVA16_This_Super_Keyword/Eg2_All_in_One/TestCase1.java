package CORE_JAVA.JAVA16_This_Super_Keyword.Eg2_All_in_One;

public class TestCase1 extends BaseClass{

    // TestCase is-A a Type Of BaseClass - Single Inheritance
    TestCase1(){
        super();// will call DC of Parent , one cannot override constructors
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }

}
