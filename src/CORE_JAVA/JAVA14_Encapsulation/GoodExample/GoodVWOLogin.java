package CORE_JAVA.JAVA14_Encapsulation.GoodExample;

public class GoodVWOLogin {
    private String Username  ;
    private String password ;

    public GoodVWOLogin(String username, String password) {
        Username = username;
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
