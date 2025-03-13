package CORE_JAVA.JAVA14_Encapsulation.BadExample;

public class Lab70_Main {
    public static void main(String[] args) {
      VWOLogin vwoLogin = new VWOLogin("admin","admin123");
        System.out.println(vwoLogin.username);
        System.out.println(vwoLogin.password);

        vwoLogin.password = "hacker"; // anyone can change
        System.out.println(vwoLogin.password);
    }
}
