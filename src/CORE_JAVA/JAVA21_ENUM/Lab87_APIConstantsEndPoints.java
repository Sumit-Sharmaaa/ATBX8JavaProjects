package CORE_JAVA.JAVA21_ENUM;

public class Lab87_APIConstantsEndPoints {
    public static void main(String[] args) {
        System.out.println(APIConstantsEndPoints.BASE_URL.getValue());
        System.out.println(APIConstantsEndPoints.LOGIN_PAGE.getValue());
        System.out.println(APIConstantsEndPoints.DASHBOARD.getValue());
    }
}

enum APIConstantsEndPoints{
    BASE_URL("www.sumit.com"),
    LOGIN_PAGE("www.sumit.com/login"),
    DASHBOARD("www.sumit.com/dashboard");


     String name;

    APIConstantsEndPoints(String name) {
        this.name = name;
    }

    public String getValue() {
        return name;
    }
}
