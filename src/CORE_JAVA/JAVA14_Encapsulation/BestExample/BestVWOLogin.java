package CORE_JAVA.JAVA14_Encapsulation.BestExample;

public class BestVWOLogin {
    private String Username  ;
    private String password ;
    boolean isAdmin;

    public BestVWOLogin(String username, String password) {
        Username = username;
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username, boolean isAdmin) {
        if (isAdmin) {
            Username = username;
        }
        else {
            System.out.println("Not allowed to change username");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }
        else {
            System.out.println("Not allowed to change Password");
        }
    }
}
