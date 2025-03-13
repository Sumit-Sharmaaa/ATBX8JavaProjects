package CORE_JAVA.JAVA14_Encapsulation.GoodExample;

public class Lab71_GoodVWOMain {
    public static void main(String[] args) {

        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("admin","password");
      //  System.out.println(goodVWOLogin.username); // Error - cannot access
        // only possible through getter setter vo bhi in same class where defined.

        System.out.println(goodVWOLogin.getUsername());
        System.out.println(goodVWOLogin.getPassword());

        goodVWOLogin.setPassword("Pass@123");
        goodVWOLogin.setUsername("SumitS");

        System.out.println(goodVWOLogin.getUsername());
        System.out.println(goodVWOLogin.getPassword());
     /*
     Ques :-
     Here the main question arises is that still one can use the getter setter and can see and change
     the username or password, so what's the benefit of encapsulation or getter and setters ?

     Answer:-
     i). First thing If one wants that others should not access then they can stop the
      getter and setter by removing or commenting it.
     ii). One can keep the names of getter and setter like that it is not recognizable to hacker.
     iii). one can use another parameter in these getter setters like boolean IsAdmin or any int key
     the one which weill be having access to them can access or change.
      */




    }


}
